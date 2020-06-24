package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		
int score;
score = 0;
String input = JOptionPane.showInputDialog("what can go up without moving");
if(input.equalsIgnoreCase("tempature"));
JOptionPane.showMessageDialog(null, "correct because tempature can go up if its hot and eithout moving ");
score= score +1;

String input1 = JOptionPane.showInputDialog("what runs the whole yard without moving");
if(input1.equalsIgnoreCase("a fence"));
JOptionPane.showMessageDialog(null, "correct goes a along a whole yard  ");
score= score +1;

String input2 = JOptionPane.showInputDialog("what has  six faces , does not wear makeup, has twenty one eyes, but cannot see");
if(input2.equalsIgnoreCase("a dice"));
score= score +1;
String input3 = JOptionPane.showInputDialog(" I am white when dirty, and black when I am clean what am I ");
if(input3.equalsIgnoreCase("a blackboard"));
score= score +1;
	JOptionPane.showMessageDialog(null, "You got score" );
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

