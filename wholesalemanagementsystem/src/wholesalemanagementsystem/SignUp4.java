package wholesalemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp4 extends Utility{
SignUp4(){
	
	jframe=new JFrame();
	jframe.setTitle("SignUp");
	jframe.setSize(new Dimension(1016,638));
	jpanel=new JPanel();
	jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	jframe.getContentPane().add(jpanel);
	jpanel.setLayout(null);
	jlabel=new JLabel();
	image=new ImageIcon("SignUp4.jpg");
	jlabel.setIcon(image);
	jlabel.setBounds(0,0,1000,600); 
	jpanel.add(jlabel);
	
	
    jlabel1=new JLabel("Your account has been created succesfully.");//success dialogue
    jlabel1.setBounds(250,260,500,60);
    jpanel.add(jlabel1);
    
    
	jbutton=new JButton("Go to LogIn");//go to login
	jbutton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			jframe.dispose();
			new LogIn();
	}});
	jbutton.setSize(132,43);
	jbutton.setLocation(438,308);
	jpanel.add(jbutton);
	
	
	
	jframe.setVisible(true);
	
	
}
}
