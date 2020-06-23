package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthtday {
public static void main(String[] args) {
	String date = JOptionPane.showInputDialog("When is your birthday?");
	if(date.equalsIgnoreCase("06/23")) {
		JOptionPane.showMessageDialog(null, ("Happy Birthday"));
		
	}
	else {
		JOptionPane.showMessageDialog(null, ("Happy UnBirthday"));
	}
}
}
