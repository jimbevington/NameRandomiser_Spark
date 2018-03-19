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

    public int constrainInput(int number){
        if (number > this.range) {
            return this.range;
        }
        if (number < 1) {
            return 1;
        }
        return number;
    }

    public ArrayList<String> getRandomNames(int number) {

//        constrain specified number of Names
        number = constrainInput(number);

        ArrayList<String> listOfNames = new ArrayList<>();

//        until the list has the number of names specified
        while (listOfNames.size() < number) {

//            get a randomly selected name
            int index = rand.nextInt(this.range);
            String name = this.names.get(index);

//            add name to the list if it isn't already there
            if (!listOfNames.contains(name)) {
                listOfNames.add(name);
            }
        }

        return listOfNames;
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
