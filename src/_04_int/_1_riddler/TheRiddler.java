package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("What's black and white and read all over.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equalsIgnoreCase("A newspaper")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct");
	
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {JOptionPane.showMessageDialog(null, "You are wrong, the correct answer is A newspaper ");
		// 6. Add some more riddles
}
JOptionPane.showMessageDialog(null,"Your score was "+score+"/1");
}
}

