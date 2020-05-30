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
