package daniel.com.think.data.structures.first;

// import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class ListClientExample {

    @SuppressWarnings("rawtypes")
    private List list;

    @SuppressWarnings("rawtypes")
    public ListClientExample() {
        // list = new LinkedList();
        list = new ArrayList();
    }

    @SuppressWarnings("rawtypes")
    public List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        @SuppressWarnings("rawtypes")
        List list = lce.getList();
        System.out.println(list);
    }
}
