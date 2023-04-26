package wholesalemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp3 extends Database {
	
SignUp3(){
	
	jframe=new JFrame();
	jframe.setTitle("SignUp");
	jframe.setSize(new Dimension(1016,638));
	jpanel=new JPanel();
	jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	jframe.getContentPane().add(jpanel);
	jpanel.setLayout(null);
	jlabel=new JLabel();
	image=new ImageIcon("SignUp3.jpg");
	jlabel.setIcon(image);
	jlabel.setBounds(0,0,1000,600); 
	jpanel.add(jlabel);
	
	
    jlabel1=new JLabel("User Id :");//userid
    jlabel1.setBounds(127,242,145,17);
    jpanel.add(jlabel1);
    jlabel2 =new JLabel("Password :");//password
    jlabel2.setBounds(127,314,100,17);
    jpanel.add(jlabel2);
    jlabel3 =new JLabel("Confirm Password :");//confirm password
    jlabel3.setBounds(127,386,100,17);
    jpanel.add(jlabel3);
    
    
    jtextfield= new JTextField();//userid
    jtextfield.setBounds(127,265,381,38);
    jpanel.add(jtextfield);
    jtextfield1= new JTextField();//password
    jtextfield1.setBounds(127,337,381,38);
    jpanel.add(jtextfield1);
    jtextfield2= new JTextField();//confirm password
    jtextfield2.setBounds(127,409,381,38);
    jpanel.add(jtextfield2);
    
    
	jbutton=new JButton("Finish");//finalize
	jbutton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			jframe.dispose();
			new SignUp4();
	}});
	jbutton.setSize(113,43);
	jbutton.setLocation(719,411);
	jpanel.add(jbutton);
	jbutton1=new JButton();//back
	
	
	
	jframe.setVisible(true);
	
	
	
	
}

}
