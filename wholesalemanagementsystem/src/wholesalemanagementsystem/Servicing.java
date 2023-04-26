package wholesalemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Servicing extends Database{

	Servicing(){
		jframe =new JFrame();
		jframe.setTitle("Servicing");
		jframe.setSize(new Dimension(1016,638));
		jpanel =new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		jlabel=new JLabel();
		image=new ImageIcon("Servicing.jpg");
		jlabel.setIcon(image);
		jlabel.setBounds(0,0,1000,600);
		jpanel.add(jlabel);
		
		
		jlabel1=new JLabel("Product ID:");//product id
		jlabel2=new JLabel("Date Of Purchase:");//date of purchase
		jlabel3=new JLabel("Product Details:");//product details
		
		
		jtextfield=new JTextField();//product id
		jtextfield1=new JTextField();//date of purchase
		jtextfield2=new JTextField();//product details
		
		
		jbutton=new JButton();//submit
		jbutton1=new JButton();//back
		jbutton2=new JButton();//signout
		
		
		
		jframe.setVisible(true);
		
		
	}
	
}
