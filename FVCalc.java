


// Computes the future value of a saving investment.
public class FVCalc
 {
	public static void main(String[] args){

		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		Double rant = Double.parseDouble(args[1]);
		rant = rant / 100.00;
		int numofyear = Integer.parseInt(args[2]);
		double FutureValue = currentValue * (Math.pow(1+rant ,(double)numofyear));
		System.out.println(" after " + numofyear + " years, $" + currentValue + " saved at " + rant*100 + "% will yield " + "$" + (int)FutureValue);
		
		





	}
}