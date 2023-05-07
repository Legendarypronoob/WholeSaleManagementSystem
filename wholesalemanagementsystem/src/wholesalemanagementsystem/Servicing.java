package wholesalemanagementsystem;

import javax.swing.*;

import wholesalemanagementsystem.Menu;

import java.awt.*;
import java.awt.event.*;


public class Servicing{
	private JFrame jframe;
	private JPanel jpanel;
	private JLabel jlabel,jlabel1,jlabelback,jlabelsignout;
	private JTextField jtextfield,jtextfield1,jtextfield2;

	Servicing(){
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
        
        
		jtextfield=new JTextField();//product id
		jtextfield.setBounds(127,265,381,38);
		jpanel.add(jtextfield);
		jtextfield1=new JTextField();//date of purchase
		jtextfield1.setBounds(127,337,381,38);
		jpanel.add(jtextfield1);
		jtextfield2=new JTextField();//product details
		 jtextfield2.setBounds(127,409,381,108);
		jpanel.add(jtextfield2);
		
		
		jlabel1 = new JLabel("Submit");
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
		jlabel1.setBounds(768, 513, 46, 14);
		jpanel.add(jlabel1);

		jlabelback=new JLabel("Back");
		jlabelback.setIcon(new ImageIcon(""));
		jlabelback.setBounds(40,70,70,70);
		jlabelback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new Menu();
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
		jpanel.add(jlabelback);
		
		jlabelsignout=new JLabel("SignOut");
		jlabelsignout.setIcon(new ImageIcon(""));
		jlabelsignout.setBounds(869,70,70,70);
		jlabelsignout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new LogIn();
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
		jpanel.add(jlabelsignout);
		
		
		jlabel=new JLabel();
		jlabel.setIcon(new ImageIcon("Servicing.png"));
		jframe.setBounds(0,0,1000,600); 
				
		
	}
	
}
