import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class BalanceService {

    // userId is of type String and balance is of type Integer
    private HashMap<String, Integer> map = new HashMap<String, Integer>();

    public int getBalance(String userId) {

        if (map.containsKey(userId)) {
            return map.get(userId);
        }
        return -1;
    }

    public boolean setBalance(String userId, int balance) {
        map.put(userId, balance);

        return true;
    }


    /*
     // Implementation using ArrayList
    private ArrayList<UserDetails> list =  new ArrayList<UserDetails>();


    public int getBalance(String userId) {



        // (1, 10) -> (2,20) -> (3,30)

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            UserDetails userDetails = (UserDetails) itr.next();

            if (userId.equals(userDetails.userId)) {
                return userDetails.balance;
            }
        }
        return  -1;
    }

    public boolean setBalance(String userId, int balance){
        UserDetails userDetails = new UserDetails();
        userDetails.balance = balance;
        userDetails.userId = userId;

        list.add(userDetails);
        return true;
    }
    */

}