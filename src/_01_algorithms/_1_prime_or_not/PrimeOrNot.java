package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		
			String num = JOptionPane.showInputDialog("Write a whole number.");
			int n = Integer.parseInt(num);
		
		for (int i = 2; i < n; i++) {
	
			if (n % i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is not prime");
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Your number is prime");
				break;
			}
		}
		
		
	}
}
