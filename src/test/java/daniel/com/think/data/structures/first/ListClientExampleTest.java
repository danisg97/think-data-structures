package daniel.com.think.data.structures.first;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ListClientExampleTest {

    /**
     * Test method for {@link ListClientExample}.
     */
    @Test
    public void testListClientExample() {
        ListClientExample lce = new ListClientExample();
        @SuppressWarnings("rawtypes")
        List list = lce.getList();
        assertThat(list).isInstanceOf(ArrayList.class);

    }

}
