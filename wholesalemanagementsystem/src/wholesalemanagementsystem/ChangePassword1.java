package wholesalemanagementsystem;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ChangePassword1 extends Database{

	public ChangePassword1() {
		
		jframe =new JFrame();
		jframe.setTitle("Change Password");
		jframe.setSize(new Dimension(1016,638));
		jpanel =new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		jlabel=new JLabel();
		image=new ImageIcon("ChangePassword1.jpg");
		jlabel.setIcon(image);
		jlabel.setBounds(0,0,1000,600);
		jpanel.add(jlabel);
		
		
		jlabel1=new JLabel("Previous Password:");//previous password
	    jlabel1.setBounds(127,242,145,17);
	    jpanel.add(jlabel1);
	    jlabel2 =new JLabel("New Password :");//new password
	    jlabel2.setBounds(127,314,100,17);
	    jpanel.add(jlabel2);
	    jlabel3 =new JLabel("Confirm Password :");//confirm password
	    jlabel3.setBounds(127,386,100,17);
	    jpanel.add(jlabel3);
	    
	    
	    jtextfield= new JTextField();//previous password
	    jtextfield.setBounds(127,265,381,38);
	    jpanel.add(jtextfield);
	    jtextfield1= new JTextField();//new password
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
				new ChangePassword2();
		}});
		jbutton.setSize(113,43);
		jbutton.setLocation(719,411);
		jpanel.add(jbutton);
		jbutton1=new JButton();//back
		jbutton2=new JButton();//signout

		
		
		jframe.setVisible(true);
		
	}

}
