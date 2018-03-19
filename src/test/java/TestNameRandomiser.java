import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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

    @Test
    public void canGetTwoNames() {
        ArrayList<String> twoNames = rand.twoNames();
//        test there are 2 names
        assertEquals(2, twoNames.size());
        String name1 = twoNames.get(0);
        String name2 = twoNames.get(1);
//        test the names aren't the same
        assertFalse(name1 == name2);
//        test they are both in the names collection
        assert(names.contains(name1));
        assert(names.contains(name2));
    }
}
