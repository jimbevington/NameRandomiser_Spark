import java.util.ArrayList;
import java.util.Random;

public class NameRandomiser {

    private ArrayList<String> names;
    private int range;
    private Random rand;

    public NameRandomiser() {
        this.names = new ArrayList<String>();
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

        this.range = this.names.size();

        this.rand = new Random();
    }


    public String oneName() {
//        Random rand = new Random();
        return this.names.get(rand.nextInt(this.range));
    }


    public ArrayList<String> twoNames() {

        ArrayList<String> twoNames = new ArrayList<String>();

        String name1 = this.names.get(rand.nextInt(range));
        String name2 = this.names.get(rand.nextInt(range));

//        until both names are different, regenerate the 2nd name
        while (name1 == name2) {
            name2 = this.names.get(rand.nextInt(range));
        }

        twoNames.add(name1);
        twoNames.add(name2);

        return twoNames;

    }
}
