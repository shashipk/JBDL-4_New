import java.io.*;
class StringBufferTest {
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("GeeksforGeeks");
       System.out.println(s);

        StringBuffer s2 = new StringBuffer("Geeksfor");
        s2.append("Geeks");
        System.out.println(s2); // returns GeeksforGeeks
        s2.append(1);
        System.out.println(s2); // returns GeeksforGeeks1
    }
}
