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

    private int constrainInput(int number){
        if (number > this.range) {
            return this.range;
        }
        if (number < 1) {
            return 1;
        }
        return number;
    }

    public String getName(){
        int index = rand.nextInt(this.range);
        String name = this.names.get(index);
        return name;
    }

    public ArrayList<String> getRandomNames(int number) {

//        constrain specified number of Names
        number = constrainInput(number);

        ArrayList<String> listOfNames = new ArrayList<>();

//        until the list has the number of names specified ...
        while (listOfNames.size() < number) {

//            ... get a random name
            String name = getName();

//            ... add name to the list if it isn't already there
            if (!listOfNames.contains(name)) {
                listOfNames.add(name);
            }
        }

        return listOfNames;
    }


    public ArrayList<String> twoNames() {

        ArrayList<String> twoNames = new ArrayList<String>();

        String name1 = getName();
        String name2 = getName();

//        until both names are different, regenerate the 2nd name
        while (name1 == name2) {
            name2 = getName();
        }

        twoNames.add(name1);
        twoNames.add(name2);

        return twoNames;

    }


//    WORK (OR THOUGHTS) IN PROGRESS ...
//    public String formatList(ArrayList<String> nameList){
//
//        int penultimate = nameList.size() - 2;
//
//        String output = "";
//
//        for (String item : nameList){
//            output.concat(item);
//        }
//
//        return output;
//    }

}
