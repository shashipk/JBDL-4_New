=============
  
  public class StaticPoly {

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    String add (String a, String b)
    {
        return a+b;
    }

    public static void main(String[] args) {

        StaticPoly staticPoly = new StaticPoly();

        System.out.println(staticPoly.add(5,20));

        System.out.println(staticPoly.add(5,10,20));

        System.out.println(staticPoly.add("abc","def"));
    }
}


===================
  
  public class AnimalManager {

    public void makeAnimalSound(Animal animal)
    {
        animal.sound();
    }
}


=====
  
  public class Overriding {

    public static void main(String[] args) {
        Lion lion1 = new Lion();
        lion1.sound();

        Cat cat1 = new Cat();
        cat1.sound();

        AnimalManager animalManager = new AnimalManager();
        animalManager.makeAnimalSound(cat1);
        animalManager.makeAnimalSound(lion1);

    }
}

==
  
  import java.util.ArrayList;
import java.util.Iterator;

public class BalanceService {

    ArrayList<UserDetails> list =  new ArrayList<UserDetails>();

    int getBalance(String userId) {

        /*

        (1, 10) -> (2,20) -> (3,30)
         */
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            UserDetails userDetails = (UserDetails) itr.next();

            if (userId.equals(userDetails.userId)) {
                return userDetails.balance;
            }
        }
        return  -1;
    }

    boolean setBalance(String userId, int balance){
        UserDetails userDetails = new UserDetails();
        userDetails.balance = balance;
        userDetails.userId = userId;

        list.add(userDetails);
        return true;
    }

}


========================
  Links for Collections
  
  https://beginnersbook.com/2013/12/java-arraylist/
  
https://www.geeksforgeeks.org/arraylist-in-java/
https://www.geeksforgeeks.org/linked-list-in-java/
https://www.geeksforgeeks.org/java-util-hashmap-in-java/
https://www.geeksforgeeks.org/hashset-in-java/
https://www.geeksforgeeks.org/treemap-in-java/
https://beginnersbook.com/2013/12/treemap-in-java-with-example/
https://www.geeksforgeeks.org/hashmap-treemap-java/


  
