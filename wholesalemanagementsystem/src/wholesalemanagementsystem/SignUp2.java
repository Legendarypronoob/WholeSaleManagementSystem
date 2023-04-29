package wholesalemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignUp2 extends Utility{
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

	SignUp2(){
		
		jframe=new JFrame();
		jframe.setTitle("SignUp");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		image=new ImageIcon("SignUp2.jpg");
		
		
        jlabel1=new JLabel("Shop Name :");//shop name
        jlabel1.setBounds(127,242,100,17);
        jpanel.add(jlabel1);
        jlabel2 =new JLabel("Shop Adress :");//shop address
        jlabel2.setBounds(127,314,100,17);
        jpanel.add(jlabel2);
        jlabel3 =new JLabel("Trade License :");//trade license
        jlabel3.setBounds(127,386,100,17);
        jpanel.add(jlabel3);
        
        
        jtextfield= new JTextField();//shop name
        jtextfield.setBounds(127,265,381,38);
        jpanel.add(jtextfield);
        jtextfield1= new JTextField();//shop address
        jtextfield1.setBounds(127,337,381,38);
        jpanel.add(jtextfield1);
        jtextfield2= new JTextField();//trade license
        jtextfield2.setBounds(127,409,381,38);
        jpanel.add(jtextfield2);
        
        
        
		jbutton=new JButton("Next");//next
		jbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
				new SignUp3();
		}});
		jbutton.setSize(113,43);
		jbutton.setLocation(719,411);
		jpanel.add(jbutton);
		imageback=new ImageIcon("Back.png");
		jlabelback=new JLabel("Back");//back
		jlabelback.setIcon(imageback);
		jlabelback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new SignUp1();
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
		jlabel=new JLabel();
		jlabel.setIcon(image);
		jlabel.setBounds(0,0,1000,600); 
		jpanel.add(jlabel);
		
		
		
		jframe.setVisible(true);
		
	}
	
}
