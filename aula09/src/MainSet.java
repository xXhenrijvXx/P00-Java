import java.util.*;

public class MainSet {
    public static void main(String[]args){
        var list1 = new HashSet<Integer>();
        //var list2 = new ArrayList<String>();

        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(1);

        //list1.remove(2);
        //list1.clear();

        System.out.println("SIZE: " + list1.size());

        list1.forEach(value ->{
            System.out.println(value);
        });


    }
}
