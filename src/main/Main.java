package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("JFrame example"); 
		
		JButton button = new JButton("This is a button!");
		JButton button2 = new JButton("Yo it's another button!");
		JButton closeButton = new JButton("Click to close this thingy!");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		//JLabel label = new JLabel("This is a label!");
		
		//panel.add(label);
		panel.add(button);
		panel.add(button2); 
		panel.add(closeButton);
		
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Hello. Can you hear me?");
		
		button.setSize(50, 50);
		button.setText("Hey how are ya");
		button.setEnabled(true);
		
		button2.setSize(50, 50);
		button2.setText("What's up dog?!");
		button2.setEnabled(true);
		
		closeButton.setSize(50, 50);
		closeButton.setText("Close this thing!");
		closeButton.setEnabled(true);
		//closeButton.setLocation(45, 25);
		
		//ActionEvent e = new ActionEvent(button, 1, "Press button"); 
			
		while(true)
		{
			if(button.getModel().isRollover()) 
			{
				button.setEnabled(true);
				System.out.println("Nice work clicking that button");
				//break;
			}
			else if(button2.getModel().isPressed())
			{	
				button2.setEnabled(true);
				System.out.println("Dang it is another button!");
				//break;
			}
			else if(closeButton.getModel().isPressed())
			{
				closeButton.setEnabled(true);
				System.exit(0);
				//break;
			}
			else
			{
				System.out.println("Nothings pressed!");
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
		

