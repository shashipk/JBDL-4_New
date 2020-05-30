

/*
https://www.geeksforgeeks.org/how-to-initialize-and-compare-strings-in-java/
*/
public class StringPoolEx {
	public static void main(String[] args)
	{
		String s1 = "Ram";
		String s2 = "Ram";
		String s3 = new String("Ram");
		String s4 = new String("Ram");
		String s5 = "Shyam";
		String nulls1 = null;
		String nulls2 = null;

		System.out.println(" Comparing strings with equals:");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s5));
		// System.out.println(nulls1.equals(nulls2)); // NullPointerException

		System.out.println(" Comparing strings with ==:");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		System.out.println(nulls1 == nulls2);

		System.out.println(" Comparing strings with compareto:");
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s5));
		// System.out.println(nulls1.compareTo(nulls2)); // NullPointerException
	}
}
