import javax.swing.JOptionPane;

public class TypeConversion {
	public static void main(String[] args) {

		String numberOne = JOptionPane.showInputDialog("gimmie a number: ");
		String numberTwo = JOptionPane.showInputDialog("gimmie another number: ");

		int numberOneAsInt = Integer.parseInt(numberOne);
		int numberTwoAsInt = Integer.parseInt(numberTwo);

		JOptionPane.showMessageDialog(null, numberOneAsInt + numberTwoAsInt);

	}
}
