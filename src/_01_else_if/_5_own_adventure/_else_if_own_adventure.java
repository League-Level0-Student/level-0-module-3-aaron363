package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class _else_if_own_adventure {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You got lost in the woods and can't find your path home.\n "
				+ "You find 2 path ways but you can't decide which one to go to.");
		String user1 = JOptionPane.showInputDialog("Type 1 to go to the left path,\n or Type 2 to go to the right one");
		if(user1.equals("1")) {
			String user2 = JOptionPane.showInputDialog("You decided to go to the left path and found a wooden house but it looks haunted.\n"
					+ "Type 1 to go inside the house or Type 2 to ignore the old house");
			if(user2.contentEquals("1")) {
				String user3 = JOptionPane.showInputDialog("You found some food inside and decided to eat the food and to move on.\n"
						+ "You then found a lot of wolfs on the path way.\n"
						+ "Type 1 to run away or Type 2 to give them your food");
				if(user3.contentEquals("1")) {
					JOptionPane.showMessageDialog(null, "You decided to run away but the wolfs were way faster.\n"
							+ "You ran really far and then you found your brother while you were running\n."
							+ "Your brother scared the wolfs and the wolfs ran away\n"
							+ "You thanked your brother and he said why you are here\n"
							+ "You told him the whole story and he escorted you home.\n"
							+ "And you lived happily ever after!");
				}else {
					JOptionPane.showMessageDialog(null, "You decided to give the wolfs your food.\n"
							+ "The wolfs ate all the food and then ran away.\n"
							+ "You continued the path and eventually found your village");
				}
				
			}else {
				String user3 = JOptionPane.showInputDialog("You decided to ignore the house and move on\n"
						+ "You found someone walking on the path too and asked him where was your village and he escorted you.\n"
						+ "He escorted you to the wrong village.\n"
						+ "It was getting pretty dark."
						+ "Type 1 to sleep in the village or type 2 to find your village right now.");
				if(user3.equals("1")) {
					JOptionPane.showMessageDialog(null, "You decided to sleep in the village"
							+ "You told the people in the village that this was not your village and they escorted you to the correct one\n"
							+ "And you found your village and lived happily ever after!");
				}else {
					JOptionPane.showMessageDialog(null, "It was night time and you couldn't see anything.\n"
							+ "Lucky you found fire and it was from your village\n"
							+ "You found home but the fire is really far away.\n"
							+ "You decided to go back to the last village.\n"
							+ "The next day you went back to your village and you lived happily ever after!.");
				}
			}
			
		}else {
			String user2 = JOptionPane.showInputDialog("You decided to go to the right path.\n"
					+ "You find a village but it is not yours.\n"
					+ "Type 1 to go into the village or type 2 to go past the village.");
			if(user2.contentEquals("1")) {
				JOptionPane.showMessageDialog(null, "You went into the village.\n"
						+ "The people living there were nice and gave you water and food.\n"
						+ "They said your village is near their village and can lead you there.\n"
						+ "You followed them to your village and you lived happily ever after.");;
			}else {
				JOptionPane.showMessageDialog(null, "You went passed  the village.\n"
						+ "You found your village\n"
						+ "You followed the path and found  your village and you lived happily ever after.");;
			}
		}

	}

}
