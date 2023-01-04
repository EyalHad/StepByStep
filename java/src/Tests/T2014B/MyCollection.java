package Tests.T2014B;

public class MyCollection {
    // *** data members ***
    public static final int INIT_SIZE=10; // the first (init) size of the set.
    public static final int RESCALE=10; // the re-scale factor of this set.
    private int _sp=0;
    private Object[] _data;

    public static int instances = 0;
    /************ Constructors ************/
    public MyCollection(){
        synchronized (this){
            instances++;
            _sp=0;
            _data = new Object[INIT_SIZE];
        }
    }

    public static int getInstancesNumber(){
        return instances;
    }
    /** return true is this collection is empty, else return false. */
    public boolean isEmpty() {return _sp==0;}

    /** add an Object to this set */
    public synchronized void add(Object p){
        if(_sp == _data.length) rescale(RESCALE);
        _data[_sp] = p; // shallow copy semantic.
        _sp++;
    }


    /** returns the actual amount of Objects contained in this collection */
    public int size() {return _sp;}

    /** returns true if this collection contains an element which is equals to ob */
    public boolean isMember(Object ob) {
        return get(ob)!=-1;
    }

    /** returns the object at the given index or null if the index is not valid*/
    public Object at(int index) {
        if (index<0||index>=_sp) return null;
        return _data[index];
    }

    /** returns the index of the first object which equals ob, if none returns -1 */
    public int get(Object ob) {
        for(int i=0; i<size(); i++) {
            if(at(i).equals(ob)) return i;
        }
        return -1;
    }

    /** removes and returns the first object which equals to ob, if none returns null */
    public synchronized Object remove(Object ob) {
        int ind = get(ob);
        Object ans = at(ind);
        if(ind!=-1) remove(ind);
        return ans;
    }

    /************** private methods *************/
    private Object remove(int ind) {
        Object o = _data[ind];
        _sp--;
        for (int i=ind; i<_sp; i++){
            _data[i] = _data[i+1];
        }
        return o;
    }
    private void rescale(int t) {
        Object[] temp = new Object[_sp*t];
        for (int i=0; i<_sp; i++){
            temp[i] = _data[i];
        }
        _data = temp;
    }
}
