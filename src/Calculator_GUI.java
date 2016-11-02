import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator_GUI {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result; 
	String operations; 
	String answer; 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_GUI window = new Calculator_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 552, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(0, 0, 534, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn7.getText(); 
				textField.setText(EnterNumber); 
			}
		});
		btn7.setBounds(10, 75, 49, 40);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn8.getText(); 
				textField.setText(EnterNumber);  
			}
		});
		btn8.setBounds(73, 75, 49, 40);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn9.getText(); 
				textField.setText(EnterNumber); 
			}
		});
		btn9.setBounds(134, 75, 49, 40);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn4.getText(); 
				textField.setText(EnterNumber); 
			}
		});
		btn4.setBounds(10, 128, 49, 40);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn5.getText(); 
				textField.setText(EnterNumber); 
			}
		});
		btn5.setBounds(73, 128, 49, 40);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn6.getText(); 
				textField.setText(EnterNumber); 
			}
		});
		btn6.setBounds(134, 128, 49, 40);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn1.getText(); 
				textField.setText(EnterNumber); 
			}
		});
		btn1.setBounds(10, 181, 49, 40);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn2.getText(); 
				textField.setText(EnterNumber); 
			}
		});
		btn2.setBounds(72, 181, 49, 40);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn3.getText(); 
				textField.setText(EnterNumber); 
			}
		});
		btn3.setBounds(134, 181, 49, 40);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn0.getText(); 
				textField.setText(EnterNumber); 
			}
		});
		btn0.setBounds(73, 234, 49, 40);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);  
			}
		});
		btnClear.setBounds(245, 75, 97, 40);
		frame.getContentPane().add(btnClear);
		
		JButton btnProcent = new JButton("%");
		btnProcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText()); 
				textField.setText(""); 
				operations = "%";  
			}
		});
		btnProcent.setBounds(409, 86, 55, 52);
		frame.getContentPane().add(btnProcent);
		
		JButton btnRandom = new JButton("Rnd");
		btnRandom.setBounds(245, 193, 97, 40);
		frame.getContentPane().add(btnRandom);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText()); 
				textField.setText(""); 
				operations = "+"; 
			}
		});
		btnPlus.setBounds(368, 151, 55, 46);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText()); 
				textField.setText(""); 
				operations = "-"; 
			}
		});
		btnMinus.setBounds(451, 151, 55, 46);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText()); 
				textField.setText(""); 
				operations = "*";  
			}
		});
		btnMultiply.setBounds(369, 210, 55, 46);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText()); 
				textField.setText(""); 
				operations = "/";  
			}
		});
		btnDivision.setBounds(451, 210, 55, 46);
		frame.getContentPane().add(btnDivision);
		
		JButton btnPi = new JButton("PI");
		btnPi.setBounds(245, 140, 97, 40);
		frame.getContentPane().add(btnPi);
		
		JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.setBounds(245, 246, 97, 40);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnAbs = new JButton("Abs");
		btnAbs.setBounds(245, 299, 97, 40);
		frame.getContentPane().add(btnAbs);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnEquals.setBounds(409, 269, 55, 52);
		frame.getContentPane().add(btnEquals);
		
		
	}
}
