import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tahmid on 10/21/2015.
 */
public class TMLinkedListTest {
    TMLinkedList<Integer> list;

    @Before
    public void initialize(){
        list = new TMLinkedList<>();
    }

    @Test
    public void canary(){
        assertTrue(true);
    }

    @Test
    public void sizeIsZero(){

        assertEquals(0, list.size());
    }

    @Test
    public void isEmptyTrue(){

        assertTrue(list.isEmpty());
    }

    @Test
    public void validInitialAdd(){

        assertTrue(list.add(6));
    }

    @Test
    public void getFirstItem(){
        list.add(6);

        assertEquals(6, list.get(0));
    }

    @Test
    public void sizeIsOne(){
        list.add(6);

        assertEquals(1, list.size());
    }

    @Test
    public void isEmptyFalse(){
        list.add(6);

        assertFalse(list.isEmpty());
    }

    @Test
    public void validSecondAdd(){
        list.add(1);

        assertTrue(list.add(2));
    }

    @Test
    public void getSecondItem(){
        list.add(1);
        list.add(2);

        assertEquals(2, list.get(1));
    }

    @Test
    public void toArray(){
        Integer x = 1;
        Integer y = 2;
        list.add(x);
        list.add(y);

        Integer[] test = {1,2};

        assertArrayEquals(test, list.toArray());

    }

    @Test
    public void removeNegativeIndex(){
        list.add(1);
        list.add(2);

        assertFalse(list.remove(-1));
    }

    @Test
    public void removeNOutOfBoundIndex(){
        list.add(1);
        list.add(2);

        assertFalse(list.remove(2));
    }

    @Test
    public void removeFromBeginingIndex(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);

        Integer[] test = {2,3};

        assertArrayEquals(test, list.toArray());
    }

    @Test
    public void removeFromMiddleIndex(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);

        Integer[] test = {1,3};

        assertArrayEquals(test, list.toArray());
    }

    @Test
    public void removeFromEndIndex(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);

        Integer[] test = {1,2};

        assertArrayEquals(test, list.toArray());
    }

    @Test
    public void addToNegativeIndex(){
        list.add(1);
        list.add(2);

        assertFalse(list.add(-1, 3));
    }

    @Test
    public void addToOutOfBoundIndex(){
        list.add(1);
        list.add(2);

        assertFalse(list.add(5, 3));
    }

    @Test
    public void addToBeginingIndex(){
        list.add(1);
        list.add(2);
        list.add(0, 3);

        Integer[] test = {3,1,2};

        assertArrayEquals(test, list.toArray());
    }

    @Test
    public void addToMiddleIndex(){
        list.add(1);
        list.add(2);
        list.add(1, 3);

        Integer[] test = {1,3,2};

        assertArrayEquals(test, list.toArray());
    }

    @Test
    public void addToEndIndex(){
        list.add(1);
        list.add(2);
        list.add(2,3);

        Integer[] test = {1,2,3};

        assertArrayEquals(test, list.toArray());
    }


}
