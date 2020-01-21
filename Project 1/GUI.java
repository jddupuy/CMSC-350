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
		frame.setSize(400,225); 
		frame.setLayout(null); 
		frame.setVisible(true);
	}
}