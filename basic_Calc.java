package ClassWork;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class basic_Calc extends JFrame implements ActionListener{
	private JLabel num1_Label = null;
	private JLabel num2_Label = null;
	private JLabel res_Label = null;
	private JTextField num1_Field = null;
	private JTextField num2_Field = null;
	private JTextField res_Field = null;
	private JButton multButton;
	private JButton addButton;
	private JButton subButton;
	private JButton divButton;
	

	public basic_Calc() {
		int wage = 0;
		GridBagConstraints layoutConst = null;
		
		setTitle("Simple Calculator");
		
		num1_Label = new JLabel("Enter First Number:");
		num2_Label = new JLabel("Enter Second Number:");
		res_Label = new JLabel("Result:");
			
		num1_Field = new JTextField(15);
		num1_Field.setEditable(true);
		num1_Field.setText("0");
			
		num2_Field = new JTextField(15);
		num2_Field.setEditable(true);
		num2_Field.setText("0");
		
		res_Field = new JTextField(15);
		res_Field.setEditable(false);
		res_Field.setText("0");
		
		multButton = new JButton("*");
		multButton.addActionListener(this);
		
		divButton = new JButton("/");
		divButton.addActionListener(this);
		
		addButton = new JButton("+");
		addButton.addActionListener(this);
		
		subButton = new JButton("-");
		subButton.addActionListener(this);
		
		setLayout(new GridBagLayout ());
		layoutConst = new GridBagConstraints();
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(num1_Label, layoutConst);
		
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(num1_Field, layoutConst);
	
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(num2_Label, layoutConst);
		
		layoutConst.gridx = 1;
		layoutConst.gridy = 1;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(num2_Field, layoutConst);
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(res_Label, layoutConst);
		
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(res_Field, layoutConst);
		
		
		layoutConst.gridx = 2;
		layoutConst.gridy = 0;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(multButton, layoutConst);
		
		layoutConst.gridx = 2;
		layoutConst.gridy = 1;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(divButton, layoutConst);
		
		layoutConst.gridx = 2;
		layoutConst.gridy = 2;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(addButton, layoutConst);
		
		layoutConst.gridx = 2;
		layoutConst.gridy = 3;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		add(subButton, layoutConst);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String num1;
		String num2;
		int num1_int;
		int num2_int;
		
		num1 = num1_Field.getText();
		num2 = num2_Field.getText();
		num1_int = Integer.parseInt(num1);
		num2_int = Integer.parseInt(num2);
		
		res_Field.setText(Integer.toString(num1_int * num2_int));
		
	}
	
	public static void main(String [] args) {
		basic_Calc myCalc = new basic_Calc();
		
		myCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myCalc.pack();
		myCalc.setVisible(true);
			
	}
}

