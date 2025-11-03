// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your 
		int NumWords = Integer.parseInt(args[0]);
		System.out.print((NumWords/100) + " hundreds, ");
		System.out.print(((NumWords%100)/10) + " tens, ");
		System.out.print("and " + (NumWords%10) + " ones.");

	}
}