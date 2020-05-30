import java.util.*;
public class ArrayListExample {

    public static void main(String[] args) {

        // Creating an ArrayList of String
        ArrayList<String> animals = new ArrayList<String>();
        // Adding new elements to the ArrayList
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        //System.out.println(animals);
        //System.out.println(animals.get(1));

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

       // System.out.println(animals);


        // size of ArrayList
        int n = 5;

        //declaring ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying ArrayList after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (int i=0; i<arrli.size(); i++)
            System.out.println(arrli.get(i)+" ");

        //Traversing list through Iterator
        Iterator itr=arrli.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
