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

public class Index {

	
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel();
	
	Index(String userID){
		
		welcomeLabel.setBounds(50, 50, 200, 25);
		welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
		welcomeLabel.setText("Hello "+userID+"!" );
		
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
}
