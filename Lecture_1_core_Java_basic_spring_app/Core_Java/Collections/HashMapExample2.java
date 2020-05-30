import java.util.HashMap;

public class HashMapExample2 {
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(107, 20);
        map.put(101, 30);
        map.put(2765, 100);
        System.out.println("Size of map is: " + map.size());
        System.out.println(map);
        if (map.containsKey(107))
        {
            Integer balance = map.get(107);
            System.out.println("The balance of userId 107 is:- " + balance);
        }
    }
}
