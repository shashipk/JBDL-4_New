import java.util.*;
public class HashMapExample1 {
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("vishal", 20);
        map.put("sachin", 30);
        map.put("vaibhav", 22);
        System.out.println("Size of map is: " + map.size());
        System.out.println(map);
        if (map.containsKey("vishal"))
        {
            Integer age = map.get("vishal");
            System.out.println("The age of Vishal is: " + age);
        }
        map.clear();
        if(!map.isEmpty()) {
            System.out.println(map);
        }
        else {
            System.out.println("Map is empty");
        }
    }
}
