import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by tahmid on 10/21/2015.
 */
public class TMLinkedListTest {
    TMLinkedList list;

    @Before
    public void initialize(){
        list = new TMLinkedList();
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
        TMLinkedList<Integer> list2 = new TMLinkedList<Integer>();

        assertTrue(list2.add(6));
    }
}
