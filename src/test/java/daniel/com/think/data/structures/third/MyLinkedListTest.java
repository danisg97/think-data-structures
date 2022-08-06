package daniel.com.think.data.structures.third;

import java.util.ArrayList;

import daniel.com.think.data.structures.second.MyArrayListTest;
import org.junit.Before;

public class MyLinkedListTest extends MyArrayListTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        myList = new MyLinkedList<Integer>();
        myList.addAll(list);
    }

}
