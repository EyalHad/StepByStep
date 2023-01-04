package Tests.T2013B;

import java.util.Arrays;
import java.util.Comparator;

public class Container {
    // *** data members ***
    public static final int INIT_SIZE = 10; // the first (init) size of the set.
    public static final int RESCALE = 10; // the re-scale factor of this set.
    private int _sp = 0;
    private Object[] _data;

    /************ Constructors ************/
    public Container() {
        _sp = 0;
        _data = new Object[INIT_SIZE];
    }

    public Container(Container other) { // copy constructor
        this();
        for (int i = 0; i < other.size(); i++)
            this.add(other._data[i]);
    }

    /**
     * return true is this collection is empty, else return false.
     */
    public boolean isEmpty() {
        return _sp == 0;
    }

    /**
     * add an Object to this set
     */
    public void add(Object p) {
        if (_sp == _data.length) rescale(RESCALE);
        _data[_sp] = p; // shallow copy semantic.
        _sp++;
    }

    /**
     * returns the actual amount of Objects contained in this collection
     */
    public int size() {
        return _sp;
    }

    /**
     * return the index of the first object which equals ob, if none returns -1
     */
    public int get(Object ob) {

        for (int i = 0; i < size(); i = i + 1)
            if (_data[i].equals(ob)) return i;

        throw new ContainerException();
    }

    /************** private methodes *************/
    private void rescale(int t) {
        _data = Arrays.copyOf(_data, t + _data.length);
    }


    /***/

    public Object maxSecond(Comparator comp){

        Object[] copy = Arrays.copyOf(_data, _data.length);

        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j < copy.length - i - 1; j++) {

                if (comp.compare(_data[j], _data[j + 1]) > 0){
                    Object temp = _data[j];
                    _data[j] = _data[j+1];
                    _data[j+1] = temp;
                }

            }
        }
        return _data[_data.length - 2];
    }


} // class Container
