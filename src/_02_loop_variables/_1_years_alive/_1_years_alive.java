package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class _1_years_alive {

	public static void main(String[] args) {
		String born_string = JOptionPane.showInputDialog("Enter year born");
		int born = Integer.parseInt(born_string);
		for(int i = born; i < 2021; i++) {
			System.out.println(i);
		}

	}

}
