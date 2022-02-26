import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDlabel = new JLabel("Username: ");
	JLabel userPasswordlabel = new JLabel("Password: ");
	JLabel messagelabel = new JLabel();
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	LoginPage(HashMap<String, String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
		
		userIDlabel.setBounds(50, 100, 75, 25);
		userPasswordlabel.setBounds(50, 150, 75, 25);
		userIDField.setBounds(150, 100, 125, 25);
		userPasswordField.setBounds(150, 150, 125, 25);
		messagelabel.setBounds(100, 250, 250, 35);
		loginButton.setBounds(150, 300, 75, 25);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);
		resetButton.setBounds(50, 300, 75, 25);
		resetButton.addActionListener(this);
		resetButton.setFocusable(false);
		messagelabel.setFont(new Font(null, Font.ITALIC, 25));
		
		frame.add(resetButton);
		frame.add(loginButton);
		frame.add(userIDlabel);
		frame.add(userPasswordlabel);
		frame.add(messagelabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource() == loginButton) {
			
			String userID = userIDField.getText();
			String userPassword = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(userPassword)) {
					messagelabel.setForeground(Color.green);
					messagelabel.setText("Login Succesful!");
					frame.dispose();
					Index index = new Index(userID);
				}else {
					messagelabel.setForeground(Color.red);
					messagelabel.setText("Wrong password!");
				}
				
			}else {
				messagelabel.setForeground(Color.red);
				messagelabel.setText("Wrong username!");
			}
			
		}

	}
}