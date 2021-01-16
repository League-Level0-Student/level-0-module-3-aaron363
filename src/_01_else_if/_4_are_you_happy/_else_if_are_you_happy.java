package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class _else_if_are_you_happy {

	public static void main(String[] args) {
		
		String user = JOptionPane.showInputDialog("Are You Happy?");
		if(user.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}else {
			String user2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if(user2.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		}
	}

}
