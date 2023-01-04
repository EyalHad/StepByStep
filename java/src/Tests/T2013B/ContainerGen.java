package Tests.T2013B;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class ContainerGen<T> {
    // *** data members ***
    public static final int INIT_SIZE = 10; // the first (init) size of the set.
    public static final int RESCALE = 10; // the re-scale factor of this set.
    private int _sp = 0;
    private T[] _data;

    /************ Constructors ************/
    public ContainerGen() {
        _sp = 0;
        _data = (T[]) new Object[]{};
    }

    public ContainerGen(ContainerGen<T> other) { // copy constructor
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
    public void add(T p) {
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
    public int get(T ob) {

        for (int i = 0; i < size(); i = i + 1)
            if (_data[i].equals(ob)) return i;

        throw new ContainerException();
    }

    /************** private methodes *************/
    private void rescale(int t) {
        _data = Arrays.copyOf(_data, t + _data.length);
    }


    /***/

    public Object maxSecond (Comparator<T> comp){
        Object[] copy = Arrays.copyOf(_data, _data.length);
        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j < copy.length - i - 1; j++) {
                if (comp.compare(_data[j], _data[j + 1]) > 0){
                    T temp = _data[j];
                    _data[j] = _data[j+1];
                    _data[j+1] = temp;
                }
            }
        }
        return _data[_data.length - 2];
    }

    public Iterator containerIterator(){

        return new Iterator() {

            int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor != size();
            }

            @Override
            public T next() {
                int current = cursor;
                cursor++;
                return _data[current];
            }

        };
    }


    public class containerIterator implements Iterator{

        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor != size() || cursor != _data.length;
        }

        @Override
        public T next() {
            int current = cursor;
            cursor++;
            return _data[current];
        }
    }

} // class Container
