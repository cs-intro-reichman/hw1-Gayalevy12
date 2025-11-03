// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random()*lim);
		int num2 = (int)(Math.random()*lim);
		int num3 = (int)(Math.random()*lim);
		System.out.println(num1 + "," + num2 + "," + num3);
		int numMax = Math.max(num1, Math.max(num2, num3));
		int numMin = Math.min(num1, Math.min(num2, num3));
		int numMid = (num1+num2+num3)-numMax-numMin;
		System.out.println(numMin + "," + numMid + "," + numMax);
	}
}
