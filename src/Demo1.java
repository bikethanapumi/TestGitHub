import javax.swing.JOptionPane;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String parse=JOptionPane.showInputDialog("Input Fahrenheit");
		double fah= Double.parseDouble(parse);
		double centigrade = (5.0/9.0)*(fah-32.0);
		JOptionPane.showMessageDialog(null,
									  "Centigrade ="+centigrade,
									  "Fah To Cen",
									  JOptionPane.PLAIN_MESSAGE);
		
		
	}

}
