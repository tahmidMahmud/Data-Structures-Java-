
import java.util.*;

/**
 * Created by tahmid on 10/21/2015.
 */

public class TMLinkedList<Type> {

    private int size;
    private Node<Type> rootNode;

    public TMLinkedList(){
        size = 0;
        rootNode = new Node<Type>(null);
    }

    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size==0 ? true : false;
    }

    public boolean add(Object o) {
        Node<Type> tempNode = new Node(o);
        Node<Type> currentNode = rootNode;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(tempNode);
        size++;

        return true;
    }

    public Object get(int index) {
        int i = 0;
        Node<Type> currentNode = rootNode;

        while (i < index) {
            currentNode = currentNode.getNext();
            i++;
        }

        return currentNode.nextNode.getData();
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;

        while(i < size){
            array[i] = get(i);
            i++;
        }

        return array;
    }

    public boolean remove(int index) {
        Node<Type> currentNode = rootNode;

        for (int i = 0; i < index; i++) {
            if (currentNode.getNext() == null) {
                return false;
            }

            currentNode = currentNode.getNext();
        }
        currentNode.setNext(currentNode.getNext().getNext());
        size--; 
        return true;
    }

    class Node<T> {

        Node nextNode;
        T data;

        public Node(Object value) {
            nextNode = null;
            data = (T) value;
        }

        public Node(Object value, Node<T> nextValue) {
            nextNode = nextValue;
            data = (T) value;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object value) {
            data = (T) value;
        }

        public Node getNext() {
            return nextNode;
        }

        public void setNext(Node nextValue) {
            nextNode = nextValue;
        }
    }
}
