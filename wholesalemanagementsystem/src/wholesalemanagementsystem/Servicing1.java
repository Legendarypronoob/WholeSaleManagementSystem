package wholesalemanagementsystem;

import javax.swing.*;

import wholesalemanagementsystem.Menu;

import java.awt.*;
import java.awt.event.*;


public class Servicing1{
	private JFrame jframe;
	private JPanel jpanel;
	private JLabel jlabel,jlabel1;


	Servicing1(){
		jframe=new JFrame();
		jframe.setTitle("Servicing");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        jframe.setVisible(true);
        

		jlabel1 = new JLabel("Go To Menu");
		jlabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new PurchaseHistory();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		jlabel1.setBounds(535, 299, 46, 14);
		jpanel.add(jlabel1);

		
		
		jlabel=new JLabel();
		jlabel.setIcon(new ImageIcon("Servicing1.png"));
		jframe.setBounds(0,0,1000,600); 
				
		
	}
	
}
