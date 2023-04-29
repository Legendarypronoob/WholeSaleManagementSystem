package wholesalemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Servicing1_1 extends Utility{
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

	Servicing1_1(){
		
		jframe =new JFrame();
		jframe.setTitle("Servicing");
		jframe.setSize(new Dimension(1016,638));
		jpanel =new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		image=new ImageIcon("Servicing1_1.jpg");
		
		
		jlabel1=new JLabel("Warranty valid. Please contact Merchant for further information.");//success dialogue
		jlabel1.setHorizontalAlignment(SwingConstants.CENTER);
	    jlabel1.setBounds(0,275,1000,30);
	    jpanel.add(jlabel1);
	    
	    
		jbutton=new JButton("Go to Menu");//go to menu
		jbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
				new Menu();//go to menu
		}});
		jbutton.setSize(132,43);
		jbutton.setLocation(438,308);
		jpanel.add(jbutton);
		jlabel=new JLabel();
		jlabel.setIcon(image);
		jlabel.setBounds(0,0,1000,600);
		jpanel.add(jlabel);
		
		
		
		jframe.setVisible(true);
	}
	
	
}
