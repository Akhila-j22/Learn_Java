public class TypeConversion {

	// Main driver method
	public static void main(String args[]) {
		// Declaring byte variable
		byte b;

		// Declaring and initializing integer and double
		int i = 257;
		double d = 323.142;

		// Display message
		System.out.println("Conversion of int to byte.");

		// i % 256
		b = (byte)i;

		// Print commands
		System.out.println("i = " + i + ", b = " + b);
		System.out.println(
			"\nConversion of double to byte.");

		// d % 256
		b = (byte)d;

		// Print commands
		System.out.println("d = " + d + ", b= " + b);
	}
}