import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.math.*; 
import java.text.DecimalFormat;
import java.lang.*;

public class GUI extends JFrame {

	public static void main (String args[]){
		//creating frame
		GUI window = new GUI();

	}

	public GUI(){
		//Setting up window
		JFrame frame = new JFrame("Infix Expression Evaluator");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); 
		frame.setSize(420,225); 
		frame.setLayout(null); 
		frame.setVisible(true);

		JLabel first_Label = new JLabel("Enter Infix Expression");
		first_Label.setBounds(20,20,1000,25);
		frame.add(first_Label);

		JTextField equation = new JTextField();
		equation.setBounds(175,20,150,25);
		frame.add(equation);

		JButton evaluate = new JButton("Evaluate");
		evaluate.setBounds(130,85,90,30);
		frame.add(evaluate);

		JLabel result = new JLabel("Result");
		result.setBounds(40,120,50,50);
		frame.add(result);

		JTextField solution = new JTextField();
		solution.setBounds(100,135,150,25);
		frame.add(solution);
		
		//Is DivideByZero an exception, or am I going to have to creat a custom exception at this point for this lines below?
		//JFrame divided_By_Zero = new JFrame();
		//JOptionPane.showMessageDialog(divided_By_Zero,"Divided By Zero.");
	}
}