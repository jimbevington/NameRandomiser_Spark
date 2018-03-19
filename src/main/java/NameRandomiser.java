import java.util.ArrayList;
import java.util.Random;

public class NameRandomiser {

    private ArrayList<String> names;

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
    }


    public String oneName() {
        int range = this.names.size();
        Random rand = new Random();
        return this.names.get(rand.nextInt(range));
    }
}
