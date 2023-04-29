package wholesalemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends Utility {
	Menu(){
		
		jframe=new JFrame();
		jframe.setTitle("Menu");
		jframe.setSize(new Dimension(1016,638));
		jpanel =new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		jlabel=new JLabel();
		image=new ImageIcon("Menu.jpg");
		jlabel.setIcon(image);
		jlabel.setBounds(0,0,1000,600);
		jpanel.add(jlabel);
		
		
		jlabel1=new JLabel("What would you like to do?");//user preference
		
		
		jbutton=new JButton("Servicing");//servicing
		jbutton1=new JButton("Shopping");//shopping
		jbutton2=new JButton("Cart");//cart
		jbutton3=new JButton("Purchase History");//purchase history
		jbutton3=new JButton("Change password");//change passowrd
		jbutton5=new JButton("Back");//back
		jbutton6=new JButton("SignOut");//signout
		

		
		jframe.setVisible(true);
		
	}
}
