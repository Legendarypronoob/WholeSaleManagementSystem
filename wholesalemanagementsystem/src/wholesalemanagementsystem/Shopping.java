package wholesalemanagementsystem;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Shopping extends Utility{
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
	protected static JLabel jlabel3;
	protected static JLabel jlabel4;
	protected static JLabel jlabel5;
	protected static JLabel jlabel6;
	protected static JLabel jlabel7;
	protected static JLabel jlabel8;
	protected static JLabel jlabelsearch;
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
	protected static ImageIcon imagesearch;
	protected static JTextArea textArea;
	protected static JDesktopPane desktopPane;
	
	private JLabel jlabel2;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	Shopping(){
		
		jframe =new JFrame();
		jframe.setTitle("Shopping");
		jframe.setSize(new Dimension(1016,638));
		jpanel =new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		image=new ImageIcon("Shopping.jpg");
		image1=new ImageIcon("GoToCart.jpg");
		image2=new ImageIcon("AddToCart.jpg");
		
		

	        
	     

	        
		
		
		
		textArea = new JTextArea();
		textArea.setBounds(327, 134, 281, 22);
		jpanel.add(textArea);
		
		
		jlabel1=new JLabel();
		jlabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				productid.add(123);//adding products to cart
				productid.add(2345);
				
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
		jlabel1.setIcon(image2);
		jlabel1.setText("Add to Cart");
		jlabel1.setSize(100, 30);
		jlabel1.setLocation(780, 520);
		jpanel.add(jlabel1);
		jlabel2 = new JLabel();
		jlabel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
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
		jlabel2.setIcon(image1);
		jlabel2.setText("Go To Cart");
		jlabel2.setBounds(638, 520, 100, 30);
		jpanel.add(jlabel2);
		
		imagesearch=new ImageIcon("Search.png");
		jlabelsearch=new JLabel("Search");//search
		jlabelsearch.setIcon(imagesearch);
		jlabelsearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		jlabelsearch.setLocation(638, 126);
		jlabelsearch.setSize(40, 40);
		jpanel.add(jlabelsearch);
		
		imageback=new ImageIcon("Back.png");
		jlabelback=new JLabel("Back");//back
		jlabelback.setIcon(imageback);
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
		
		
		
		
		jlabel=new JLabel();
		jlabel.setAutoscrolls(true);
		jlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlabel.setIcon(new ImageIcon("F:\\Git\\WholeSaleManagementSystem\\wholesalemanagementsystem\\Shopping.jpg"));
		jlabel.setBounds(0,0,1000,600);
		jpanel.add(jlabel);
		
		jframe.setVisible(true);
		
	}
}
