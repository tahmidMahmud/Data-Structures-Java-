
/**
 * Created by tahmid on 10/21/2015.
 */

public class TMLinkedList<Type> {

    private int size;
    private Node<Type> rootNode;

    public TMLinkedList(){
        size = 0;
        rootNode = new Node<>(null);
    }

    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size==0;
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

    public boolean add(int index, Object o) {
        Node<Type> tempNode = new Node(o);
        Node<Type> currentNode = rootNode;

        if(index < 0 || index > size){ return false; }

        for(int i = 0; i < index; i++){
            currentNode = currentNode.nextNode;
        }

        tempNode.setNext(currentNode.getNext());
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

        if(index < 0 || index >= size){ return  false;}

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

        public Object getData() { return data; }

        public Node getNext() {
            return nextNode;
        }

        public void setNext(Node nextValue) {
            nextNode = nextValue;
        }
    }
}
