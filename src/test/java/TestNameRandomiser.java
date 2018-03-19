import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestNameRandomiser {

    private NameRandomiser rand;
    private ArrayList<String> names;

    @Before
    public void setUp() throws Exception {
        rand = new NameRandomiser();
        names = new ArrayList<String>();
    }

    @Test
    public void canGetName() {
        String name = rand.oneName();
        assert(names.contains(name));
    }
}
