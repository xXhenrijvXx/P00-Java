import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class MainMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();

        map.put(1, "João");
        map.put(2, "Anna");
        map.put(3, "Maria");



        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }


    }

}
