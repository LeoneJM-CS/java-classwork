package ClassWork;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Graphic extends JComponent{
	
	 @Override
	 public void paintComponent(Graphics g) {
		 Graphics2D graphicObj = (Graphics2D) g;
		 
		 Rectangle bin1 = new Rectangle(10, 12, 200, 50);
		 Color binColor = new Color(5, 9, 245); // Red, Green, Blue
		 graphicObj.setColor(binColor);
		 graphicObj.fill(bin1);
		 
		 Rectangle bin2 = new Rectangle(10, 75, 200, 50);
		 Color binColor2 = new Color(140, 194, 183); // Red, Green, Blue
		 graphicObj.setColor(binColor2);
		 graphicObj.fill(bin2);
		 
		 Rectangle bin3 = new Rectangle(10, 140, 200, 50);
		 Color binColor3 = new Color(153, 86, 99); // Red, Green, Blue
		 graphicObj.setColor(binColor3);
		 graphicObj.fill(bin3);
	 }
}

public class basic_GUI extends JFrame{
	private JLabel wageLabel = null;
	private JLabel salLabel = null;
	private JTextField wageField = null;
	private JTextField salField = null;

	public basic_GUI() {
		int wage = 15;
		GridBagConstraints layoutConst = null;
		
		setTitle("Salary");
		
		wageLabel = new JLabel("Hourly wage:");
		salLabel = new JLabel("Salary:");
			
		wageField = new JTextField(15);
		wageField.setEditable(true);
		wageField.setText(Integer.toString(wage));
			
		salField = new JTextField(15);
		salField.setEditable(false);
		salField.setText(Integer.toString(wage * 40 * 50));
		
		setLayout(new GridBagLayout ());
		
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(wageLabel, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(wageField, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(salLabel, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 1;
		layoutConst.gridy = 1;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(salField, layoutConst);
	}
	public static void main(String [] args) {
		basic_GUI myFrame = new basic_GUI();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.setVisible(true);
			
	}
}

