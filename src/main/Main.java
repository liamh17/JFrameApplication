package main;

import java.awt.FlowLayout;
import java.util.Scanner;
import java.math.*;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.DefaultFormatter; 

public class Main 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JFrame example"); 
		
		//JButton button = new JButton("");
		//JButton button2 = new JButton("");
		
		JButton buttonSum = new JButton("");
		JButton buttonDifference = new JButton("");
		JButton buttonProduct = new JButton("");
		JButton buttonQuotient = new JButton("");
		
		JButton circum = new JButton(""); 
		JButton circleArea = new JButton("");
		JButton trianglePerim = new JButton("");
		JButton triangleArea = new JButton(""); 	
		JButton rectPerim = new JButton(""); 
		JButton rectArea = new JButton("");
		JButton squarePerim = new JButton("");
		JButton squareArea = new JButton(""); 
		
		SpinnerModel model = new SpinnerNumberModel(2, 1, 500, 1); 
		JSpinner spinner = new JSpinner(model); 
		
		SpinnerModel model2 = new SpinnerNumberModel(1, 1, 500, 1); 
		JSpinner spinner2 = new JSpinner(model2);
		
		SpinnerModel model3 = new SpinnerNumberModel();
		JSpinner spinner3 = new JSpinner(model3);
		spinner3.setSize(50, 10);
		
		JComponent comp = spinner.getEditor();
		//JComponent comp2 = spinner2.getEditor(); 
		
		JFormattedTextField field = (JFormattedTextField) comp.getComponent(0);
		//JFormattedTextField field2 = (JFormattedTextField) comp2.getComponent(0);
		
		DefaultFormatter formatter = (DefaultFormatter) field.getFormatter();
		//DefaultFormatter formatter2 = (DefaultFormatter) field2.getFormatter(); 
		formatter.setCommitsOnValidEdit(true);
	    spinner.addChangeListener(new ChangeListener() {

	        @Override
	        public void stateChanged(ChangeEvent e) {
	            System.out.println("value changed: " + spinner.getValue());
	        }
	    });
		
		spinner.setEnabled(true);
		
		JButton closeButton = new JButton("Click to close this thingy!");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		//JLabel label = new JLabel("This is a label!");
		
		//panel.add(label);
		//panel.add(button);
		//panel.add(button2); 
		
		//default operations
		panel.add(buttonSum);
		panel.add(buttonDifference);
		panel.add(buttonProduct);
		panel.add(buttonQuotient);
		
		//geometry
		panel.add(circleArea);
		panel.add(circum);
		panel.add(trianglePerim); 
		panel.add(triangleArea); 
		panel.add(rectPerim); 
		panel.add(rectArea);
		panel.add(squarePerim);
		panel.add(squareArea);
		
		//spinners
		panel.add(spinner);
		panel.add(spinner2); 
		panel.add(spinner3);
		spinner3.setToolTipText("A");
		
		//close
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
		buttonSum.setText("a + b");
		buttonSum.setEnabled(true);
		
		buttonDifference.setSize(50, 50);
		buttonDifference.setText("a - b");
		buttonDifference.setEnabled(true);
		
		buttonProduct.setSize(50, 50);
		buttonProduct.setText("a * b");
		buttonProduct.setEnabled(true);
		
		buttonQuotient.setSize(50, 50);
		buttonQuotient.setText("a / b");
		buttonQuotient.setEnabled(true);
		
		circum.setSize(50, 50);
		circum.setText("Circle circumference");
		circum.setEnabled(true);
		
		circleArea.setSize(50, 50);
		circleArea.setText("Circle area");
		circleArea.setEnabled(true);
		
		trianglePerim.setSize(50, 50);
		trianglePerim.setText("Triangle perimeter");
		trianglePerim.setEnabled(true);
		 
		triangleArea.setSize(50, 50);
		triangleArea.setText("Triangle area");
		triangleArea.setEnabled(true);
		
		rectPerim.setSize(50, 50);
		rectPerim.setText("Rectangle perimeter");
		rectPerim.setEnabled(true);
		
		rectArea.setSize(50,  50);
		rectArea.setText("Rectangle area");
		rectArea.setEnabled(true);
		
		squarePerim.setSize(50, 50);
		squarePerim.setText("Square perimeter");
		squarePerim.setEnabled(true);
		
		squareArea.setSize(50, 50);
		squareArea.setText("Square area");
		squareArea.setEnabled(true);
		
		/*try 
		{
			spinner.commitEdit();
		} 
		catch (ParseException e) 
		{
			System.out.println("Commitment of value didn't work! " + e.getMessage());
		} */
			
		//closeButton.setLocation(45, 25);
		 
		//ActionEvent e = new ActionEvent(button, 1, "Press button"); 
			
		while(true)
		{
			//variables
			double a = (Integer) spinner.getValue();
			double b = (Integer) spinner2.getValue(); 
			double c = (Integer) spinner3.getValue(); 
			double r = (Integer) spinner3.getValue(); 
			
			//basic operations
			double sum = a + b;
			double difference = a - b; 
			double product = a * b; 
			double quotient = a / b;
			
			//geometry
			double circumCalc = 2 * 3.14 * r; 
			double areaCalc = 3.14 * r * r; 
			double triArea = b / 2 * a; 
			double triPerim = a + b + c; 
			double rectPerimA = 2 * a;
			double rectPerimB = 2 * b; 
			double rectPerimValue = rectPerimA + rectPerimB;
			double rectAreaValue = a * b;
			double sqPerim = 4 * a;
			double sqArea = a * a; 
			
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
			else if(circum.getModel().isPressed()) 
			{
				circum.setEnabled(true); 
				System.out.println("Circumference of the circle!: " + circumCalc);
				//break; 
			}
			else if(circleArea.getModel().isPressed()) 
			{
				circleArea.setEnabled(true);
				System.out.println("Area of the circle!: " + areaCalc);
			}
			else if(trianglePerim.getModel().isPressed()) 
			{
				trianglePerim.setEnabled(true);
				System.out.println("Triangle perimeter = " + triPerim);
			}
			else if(triangleArea.getModel().isPressed()) 
			{
				triangleArea.setEnabled(true);
				System.out.println("Triangle area = " + triArea);
			}
			else if(rectPerim.getModel().isPressed())
			{
				rectPerim.setEnabled(true);
				System.out.println("Rectangle perimeter = " + rectPerimValue);
			}
			else if(rectArea.getModel().isPressed())
			{
				rectArea.setEnabled(true);
				System.out.println("Rectangle area = " + rectAreaValue);
			}
			else if(squarePerim.getModel().isPressed()) 
			{
				squarePerim.setEnabled(true); 
				System.out.println("Square perimeter = " + sqPerim);
			}
			else if(squareArea.getModel().isPressed()) 
			{
				squareArea.setEnabled(true);
				System.out.println("Square area = " + sqArea);
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