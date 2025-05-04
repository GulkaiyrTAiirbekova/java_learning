import java.util.ArrayList;

public class NameListExample {
    public  static void main (String [] args){
        ArrayList <String> names = new ArrayList<String>();
        names.add("Aikol");
        names.add("Khankeldi");
        names.add("Sofi");
        names.add("Tom");

        // Print the entire list
        System.out.println("Names" + names);

        // Access individual elements
        System.out.println("The first name:" + names.get(0));
        // Modify an element
        names.set(1,"Alexsandr");
        System.out.println("After changes:" + names);
        // Remove an element
        names.remove("Sofi");
        System.out.println("After removal:" + names);

        System.out.println("All names:" + names);
        for (String name: names){
            System.out.println(name);
        }
        System.out.println("Total names:" + names.size());
    }
}