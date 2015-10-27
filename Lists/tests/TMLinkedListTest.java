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
    public void remove(){
        list.add(1);
        list.add(2);
        list.remove(1);
        Integer[] test = {1};

        assertArrayEquals(test, list.toArray());

    }
}
