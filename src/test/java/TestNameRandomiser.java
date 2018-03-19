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
        names.add("Jim");
        names.add("Geraldine");
        names.add("Spencer");
        names.add("Brandy");
        names.add("Horace");
        names.add("Agnes");
        names.add("Abner");
        names.add("Saliva");
        names.add("Preston");
        names.add("Atli");
        names.add("Walrusnose");
        names.add("Gary");
        names.add("Josef");
        names.add("Bratislav III");
    }

    @Test
    public void canGetName() {
        String name = rand.oneName();
        assert(names.contains(name));
    }
}
