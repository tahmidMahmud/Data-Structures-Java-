import java.util.*;

/**
 * Created by tahmid on 10/21/2015.
 */
public class TMLinkedList<T> {

    private int size;
    private boolean isEmpty;
    private T node;

    public TMLinkedList<T>(){
        size = 0;
        isEmpty = true;
        node = new T();
    }

    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return isEmpty;
    }


    public boolean contains(Object o) {
        return false;
    }


    public Iterator iterator() {
        return null;
    }


    public Object[] toArray() {
        return new Object[0];
    }


    public boolean add(Object o) {
        if (o.getClass() == node.getClass()){
            node = (T) o;
            return true;
        }
        return false;
    }


    public boolean remove(Object o) {
        return false;
    }


    public boolean addAll(Collection c) {
        return false;
    }


    public boolean addAll(int index, Collection c) {
        return false;
    }


    public void clear() {

    }


    public Object get(int index) {
        return null;
    }


    public Object set(int index, Object element) {
        return null;
    }


    public void add(int index, Object element) {

    }


    public Object remove(int index) {
        return null;
    }


    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public ListIterator listIterator() {
        return null;
    }


    public ListIterator listIterator(int index) {
        return null;
    }


    public List subList(int fromIndex, int toIndex) {
        return null;
    }


    public boolean retainAll(Collection c) {
        return false;
    }


    public boolean removeAll(Collection c) {
        return false;
    }


    public boolean containsAll(Collection c) {
        return false;
    }

//    @Override
//    public T[] toArray(Object[] a) {
//        return new T[0];
//    }
}
