package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String input = JOptionPane.showInputDialog("Pick 2 numbers.");
		int number1 = Integer.parseInt(input);
		int number2 = Integer.parseInt(input);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add ", "Subtract ", "Multiply ", "Divide " },
				null);
	if (operation==0) {
		add(number1, number2); 
	}
	else if (operation==1) {
		subtract(number1, number2);
	}
	else if (operation==2) {
		multiply(number1, number2);
	}
	else if (operation==3) {
		divide(number1, number2);
	}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(number1, number2) {
		JOptionPane.showMessageDialog(null,""+num);
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}