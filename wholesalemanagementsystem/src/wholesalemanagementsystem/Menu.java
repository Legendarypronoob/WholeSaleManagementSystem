package wholesalemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends Utility {
	
	protected static JFrame jframe;
	protected static JPanel jpanel;
	protected static JButton jbutton;
	protected static JButton jbutton1;
	protected static JButton jbutton2;
	protected static JButton jbutton3;
	protected static JButton jbutton4;
	protected static JButton jbutton5;
	protected static JButton jbutton6;
	protected static JLabel jlabel;
	protected static JLabel jlabel1;
	protected static JLabel jlabel2;
	protected static JLabel jlabel3;
	protected static JLabel jlabel4;
	protected static JLabel jlabel5;
	protected static JLabel jlabel6;
	protected static JLabel jlabel7;
	protected static JLabel jlabel8;
	protected static JLabel jlabelback;
	protected static JLabel jlabelsignout;
	protected static JTextField jtextfield;
	protected static JTextField jtextfield1;
	protected static JTextField jtextfield2;
	protected static JPasswordField jpasswordfield;
	protected static ImageIcon image;
	protected static ImageIcon image1;
	protected static ImageIcon image2;
	protected static ImageIcon image3;
	protected static ImageIcon image4;
	protected static ImageIcon image5;
	protected static ImageIcon image6;
	protected static ImageIcon image7;
	protected static ImageIcon image8;
	protected static ImageIcon image9;
	protected static ImageIcon image10;
	protected static ImageIcon imageback;
	protected static ImageIcon imagesignout;

	Menu(){
		
		jframe=new JFrame();
		jframe.setTitle("Menu");
		jframe.setSize(new Dimension(1016,638));
		jpanel =new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		
		
		
		jlabel1=new JLabel("What would you like to do?");//user preference
		
		
		image1=new ImageIcon("Servicing.jpg");
		jlabel2=new JLabel("Servicing");//servicing
		jlabel2.setIcon(image1);
		jlabel2.setToolTipText("Servicing");
		jlabel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new Servicing();
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
		
		jlabel7 = new JLabel("What would you like to do?");
		jlabel7.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel7.setBounds(0, 120, 1000, 14);
		jpanel.add(jlabel7);
		jlabel2.setSize(200, 200);
		jlabel2.setLocation(280, 330);
		jpanel.add(jlabel2);
		image2=new ImageIcon("Shopping.jpg");
		jlabel3=new JLabel("Shopping");//shopping
		jlabel3.setIcon(image2);
		jlabel3.setToolTipText("Shop");
		jlabel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new Shopping();
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
		jlabel3.setSize(200, 200);
		jlabel3.setLocation(518, 330);
		jpanel.add(jlabel3);
		image3=new ImageIcon("Cart.jpg");
		jlabel4=new JLabel("Cart");//cart
		jlabel4.setIcon(image3);
		jlabel4.setToolTipText("Go to cart");
		jlabel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new Cart();
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
		jlabel4.setSize(200, 200);
		jlabel4.setLocation(638, 155);
		jpanel.add(jlabel4);
		image4=new ImageIcon("PurchaseHistory.jpg");
		jlabel5=new JLabel("Purchase History");//purchase history
		jlabel5.setIcon(image4);
		jlabel5.setToolTipText("Purchase History");
		jlabel5.addMouseListener(new MouseAdapter() {
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
		jlabel5.setLocation(162, 155);
		jlabel5.setSize(200, 200);
		jpanel.add(jlabel5);
		image5=new ImageIcon("ChangePassword.jpg");
		jlabel6=new JLabel("Change password");//change passowrd
		jlabel6.setIcon(image5);
		jlabel6.setToolTipText("Change password");
		jlabel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new ChangePassword();
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
		jlabel6.setSize(200, 200);
		jlabel6.setLocation(400, 155);
		jpanel.add(jlabel6);
		imageback=new ImageIcon("Back.png");
		jlabelback=new JLabel("Back");//back
		jlabelback.setIcon(imageback);
		jlabelback.addMouseListener(new MouseAdapter() {
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
		jlabelback.setLocation(72, 72);
		jlabelback.setSize(60, 60);
		jpanel.add(jlabelback);
		imagesignout=new ImageIcon("SignOut.png");
		jlabelsignout=new JLabel("SignOut");//signout
		jlabelsignout.setIcon(imagesignout);
		jlabelsignout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new FrontPage();
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
		jlabelsignout.setLocation(850, 72);
		jlabelsignout.setSize(60, 60);
		jpanel.add(jlabelsignout);
		
		
		
		image=new ImageIcon("Menu.jpg");
		jlabel=new JLabel();
		jlabel.setIcon(image);
		jlabel.setBounds(0,0,1000,600);
		jpanel.add(jlabel);
		jframe.setVisible(true);
		
	}
}
