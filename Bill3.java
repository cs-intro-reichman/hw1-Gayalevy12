// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String nam1 = args[0];
		String nam2 = args [1];
		String nam3 = args [2];
		int sum = Integer.parseInt(args[3]);
		double payfor1 = Math.ceil((double)sum/3.0);
		System.out.println("Dear " + nam3 + ", " + nam2 + ", and " + nam1 + ": pay " + payfor1 + " shekels each");

	   
	}
}
