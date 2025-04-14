package ClassWork;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.text.*;

public class format_GUI extends JFrame implements ActionListener, ChangeListener{
	private JButton calcButton;
	private JSpinner vehichle;
	private JLabel distance;
	private JLabel time;
	private JLabel vChoice;
	private JFormattedTextField distField;
	
	public format_GUI() {
		GridBagConstraints gbc = new GridBagConstraints();
		setTitle("Travel Time");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
	}
	
	public static void main(String [] args) {
		
	}

	
}
