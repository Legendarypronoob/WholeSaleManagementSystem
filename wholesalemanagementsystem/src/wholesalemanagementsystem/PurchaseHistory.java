package wholesalemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PurchaseHistory extends Database{

	PurchaseHistory() {
		
		jframe =new JFrame();
		jframe.setTitle("PuschaseHistory");
		jframe.setSize(new Dimension(1016,638));
		jpanel =new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		jlabel=new JLabel();
		image=new ImageIcon("PurchaseHistory.jpg");
		jlabel.setIcon(image);
		jlabel.setBounds(0,0,1000,600);
		jpanel.add(jlabel);
		
	}

}
