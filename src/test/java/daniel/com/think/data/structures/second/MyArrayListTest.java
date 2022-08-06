package daniel.com.think.data.structures.second;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

public class MyArrayListTest {

    protected List<Integer> myList;
    protected List<Integer> list;


    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        myList = new MyArrayList<Integer>();
        myList.addAll(list);
    }

    /**
     * Test method for {@link MyArrayList#MyArrayList()}.
     */
    @Test
    public void testMyList() {
        assertThat(myList).hasSize(3);


    }

    /**
     * Test method for {@link MyArrayList#add(Object)}.
     */
    @Test
    public void testAddT() {
        for (int i = 4; i < 20; i++) {
            myList.add(i);
        }
        //System.out.println(Arrays.toString(mal.toArray()));
        assertThat(myList.get(18)).isEqualTo(new Integer(19));
    }

    /**
     * Test method for {@link MyArrayList#add(int, Object)}.
     */
    @Test
    public void testAddIntT() {
        myList.add(1, 5);
        //System.out.println(Arrays.toString(mal.toArray()));
        assertThat(myList.get(1)).isEqualTo(new Integer(5));
        assertThat(myList).hasSize(4);

        try {
            myList.set(-1, 0);
            fail();
        } catch (IndexOutOfBoundsException e) {
        } // good

        try {
            myList.set(4, 0);
            fail();
        } catch (IndexOutOfBoundsException e) {
        } // good

        myList.add(0, 6);
        //System.out.println(Arrays.toString(mal.toArray()));
        assertThat(myList.get(0)).isEqualTo(6);

        myList.add(5, 7);
        //System.out.println(Arrays.toString(mal.toArray()));
        assertThat(myList.get(5)).isEqualTo(new Integer(7));
    }

    /**
     * Test method for {@link MyArrayList#addAll(java.util.Collection)}.
     */
    @Test
    public void testAddAllCollectionOfQextendsT() {
        myList.addAll(list);
        myList.addAll(list);
        myList.addAll(list);
        assertThat(myList).hasSize(12);
        assertThat(myList.get(5)).isEqualTo(new Integer(3));
    }

    /**
     * Test method for {@link MyArrayList#clear()}.
     */
    @Test
    public void testClear() {
        myList.clear();
        assertThat(myList).hasSize(0);
    }

    /**
     * Test method for {@link MyArrayList#contains(Object)}.
     */
    @Test
    public void testContains() {
        assertThat(myList.contains(1)).isEqualTo(true);
        assertThat(myList.contains(4)).isEqualTo(false);
        assertThat(myList.contains(null)).isEqualTo(false);
        myList.add(null);
        assertThat(myList.contains(null)).isEqualTo(true);
    }

    /**
     * Test method for {@link MyArrayList#containsAll(java.util.Collection)}.
     */
    @Test
    public void testContainsAll() {
        assertThat(myList.containsAll(list)).isEqualTo(true);
    }

    /**
     * Test method for {@link MyArrayList#get(int)}.
     */
    @Test
    public void testGet() {
        assertThat(myList.get(1)).isEqualTo(new Integer(2));
    }

    /**
     * Test method for {@link MyArrayList#indexOf(Object)}.
     */
    @Test
    public void testIndexOf() {
        assertThat(myList.indexOf(1)).isEqualTo(0);
        assertThat(myList.indexOf(2)).isEqualTo(1);
        assertThat(myList.indexOf(3)).isEqualTo(2);
        assertThat(myList.indexOf(4)).isEqualTo(-1);
    }

    /**
     * Test method for {@link MyArrayList#indexOf(Object)}.
     */
    @Test
    public void testIndexOfNull() {
        assertThat(myList.indexOf(null)).isEqualTo(-1);
        myList.add(null);
        assertThat(myList.indexOf(null)).isEqualTo(3);
    }

    /**
     * Test method for {@link MyArrayList#isEmpty()}.
     */
    @Test
    public void testIsEmpty() {
        assertThat(myList.isEmpty()).isEqualTo(false);
        myList.clear();
        assertThat(myList.isEmpty()).isEqualTo(true);
    }

    /**
     * Test method for {@link MyArrayList#iterator()}.
     */
    @Test
    public void testIterator() {
        Iterator<Integer> iter = myList.iterator();
        assertThat(iter.next()).isEqualTo(new Integer(1));
        assertThat(iter.next()).isEqualTo(new Integer(2));
        assertThat(iter.next()).isEqualTo(new Integer(3));
        assertThat(iter.hasNext()).isEqualTo(false);
    }

    /**
     * Test method for {@link MyArrayList#lastIndexOf(Object)}.
     */
    @Test
    public void testLastIndexOf() {
        myList.add(2);
        assertThat(myList.lastIndexOf(new Integer(2))).isEqualTo(3);
    }

    /**
     * Test method for {@link MyArrayList#remove(Object)}.
     */
    @Test
    public void testRemoveObject() {
        boolean flag = myList.remove(new Integer(2));
        assertThat(flag).isEqualTo(true);
        assertThat(myList.size()).isEqualTo(2);
        assertThat(myList.get(1)).isEqualTo(new Integer(3));
        //System.out.println(Arrays.toString(mal.toArray()));

        flag = myList.remove(new Integer(1));
        assertThat(flag).isEqualTo(true);
        assertThat(myList.size()).isEqualTo(1);
        assertThat(myList.get(0)).isEqualTo(new Integer(3));
        //System.out.println(Arrays.toString(mal.toArray()));

        flag = myList.remove(new Integer(5));
        assertThat(flag).isEqualTo(false);
        assertThat(myList.size()).isEqualTo(1);
        assertThat(myList.get(0)).isEqualTo(new Integer(3));
        //System.out.println(Arrays.toString(mal.toArray()));

        flag = myList.remove(new Integer(3));
        assertThat(flag).isEqualTo(true);
        assertThat(myList.size()).isEqualTo(0);
        //System.out.println(Arrays.toString(mal.toArray()));
    }

    /**
     * Test method for {@link MyArrayList#remove(int)}.
     */
    @Test
    public void testRemoveInt() {
        Integer val = myList.remove(1);
        assertThat(val).isEqualTo(new Integer(2));
        assertThat(myList.size()).isEqualTo(2);
        assertThat(myList.get(1)).isEqualTo(new Integer(3));
    }

    /**
     * Test method for {@link MyArrayList#removeAll(java.util.Collection)}.
     */
    @Test
    public void testRemoveAll() {
        myList.removeAll(list);
        assertThat(myList.size()).isEqualTo(0);
    }
        
    /**
     * Test method for {@link MyArrayList#size()}.
     */
    @Test
    public void testSize() {
        assertThat(myList.size()).isEqualTo(3);
    }

    /**
     * Test method for {@link MyArrayList#subList(int, int)}.
     */
    @Test
    public void testSubList() {
        myList.addAll(list);
        List<Integer> sub = myList.subList(1, 4);
        assertThat(sub.get(1)).isEqualTo(new Integer(3));
    }

    /**
     * Test method for {@link MyArrayList#toArray()}.
     */
    @Test
    public void testToArray() {
        Object[] array = myList.toArray();
        assertThat((Integer) array[0]).isEqualTo(new Integer(1));
    }

}
