package main;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel; 

public class Main 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JFrame example"); 
		
		//JButton button = new JButton("");
		//JButton button2 = new JButton("");
		JButton buttonSum = new JButton("Add a and b!");
		JButton buttonDifference = new JButton("Subtract a and b!");
		JButton buttonProduct = new JButton("Multiply a and b!");
		JButton buttonQuotient = new JButton("Divide a and b!");
		
		SpinnerModel model = new SpinnerNumberModel(2, 1, 500, 1); 
		JSpinner spinner = new JSpinner(model); 
		
		SpinnerModel model2 = new SpinnerNumberModel(1, 1, 500, 1); 
		JSpinner spinner2 = new JSpinner(model2); 
		
		JButton closeButton = new JButton("Click to close this thingy!");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		//JLabel label = new JLabel("This is a label!");
		
		//panel.add(label);
		//panel.add(button);
		//panel.add(button2); 
		panel.add(buttonSum);
		panel.add(buttonDifference);
		panel.add(buttonProduct);
		panel.add(buttonQuotient);
		panel.add(spinner);
		panel.add(spinner2); 
		
		panel.add(closeButton);
		
		
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("BASIC CALCULATOR");
		
		/*button.setSize(50, 50);
		button.setText("Hello!");
		button.setEnabled(true);*/
		
		/*button2.setSize(50, 50);
		button2.setText("How's the weather?");
		button2.setEnabled(true);*/
		
		closeButton.setSize(50, 50);
		closeButton.setText("Close this thing!");
		closeButton.setEnabled(true);
		
		buttonSum.setSize(50, 50);
		buttonSum.setText("Add a and b!");
		buttonSum.setEnabled(true);
		
		buttonDifference.setSize(50, 50);
		buttonDifference.setText("Subtract a and b!");
		buttonDifference.setEnabled(true);
		
		buttonProduct.setSize(50, 50);
		buttonProduct.setText("Multiply a and b!");
		buttonProduct.setEnabled(true);
		
		buttonQuotient.setSize(50, 50);
		buttonQuotient.setText("Divide a and b!");
		buttonQuotient.setEnabled(true);
		
		int a = (Integer) spinner.getValue();
		int b = (Integer) spinner2.getValue(); 
		int sum = a + b;
		int difference = a - b; 
		int product = a * b; 
		int quotient = a / b; 
		
		//closeButton.setLocation(45, 25);
		
		//ActionEvent e = new ActionEvent(button, 1, "Press button"); 
			
		while(true)
		{
			/*if(button.getModel().isRollover()) 
			{
				button.setEnabled(true);
				System.out.println("Hello! How are you today?");
				//break;
			}
			else if(button2.getModel().isPressed())
			{	
				button2.setEnabled(true);
				System.out.println("It's awfully cold!");
				//break;
			}*/
			if(buttonSum.getModel().isPressed()) 
			{
				buttonSum.setEnabled(true);
				System.out.println("a + b = " + sum);
				//break;
			}
			else if(buttonDifference.getModel().isPressed())
			{
				buttonDifference.setEnabled(true);
				System.out.println("a - b = " + difference);
				//break;
			}
			else if(buttonProduct.getModel().isPressed()) 
			{
				buttonProduct.setEnabled(true);
				System.out.println("a * b = " + product);
				//break;
			}
			else if(buttonQuotient.getModel().isPressed() && (Integer) spinner.getValue() > 0)
			{
				buttonQuotient.setEnabled(true);
				System.out.println("a / b = " + quotient);
				//break; 
			}
			else if(closeButton.getModel().isPressed())
			{
				closeButton.setEnabled(true);
				System.out.println("Goodbye!");
				System.exit(0);
				//break;
			}
			else
			{
				System.out.println("Press something dangit!");
			}
		}
		/*JFrame frame = new JFrame("JFrame Example");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JLabel label = new JLabel("This is a label!");

		JButton button = new JButton();
		button.setText("Press me");

		panel.add(label);
		panel.add(button);

		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);*/
	}
}
		

