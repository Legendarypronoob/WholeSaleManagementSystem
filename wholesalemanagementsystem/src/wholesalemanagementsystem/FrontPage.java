package wholesalemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrontPage extends Utility{
	
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

	public FrontPage() {
		jframe=new JFrame();
		jframe.setTitle("UserType");//
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		
		
        
		jbutton=new JButton("Merchant");//as a merchant
		jbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
				new LogIn();//login
		}});
		jbutton.setSize(420,40);
		jbutton.setLocation(450,328);
		jpanel.add(jbutton);
		jbutton1=new JButton("Company Agent");//as a company agent
		jbutton1.addActionListener(new ActionListener() {//@fuad company agent interface
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
			//	new CompanyAgent();
		}});
		jbutton1.setSize(420,40);
		jbutton1.setLocation(450,388);
		jpanel.add(jbutton1);
		
		JLabel jlabel = new JLabel("What would you like to enter the app as?");
		jlabel.setBounds(450, 303, 261, 14);
		jpanel.add(jlabel);
		
		
		
		image=new ImageIcon("FrontPage.jpg");
		jlabel=new JLabel();
		jlabel.setIcon(image);
		jlabel.setBounds(0,0,image.getIconWidth(),image.getIconHeight()); 
		jpanel.add(jlabel);
		jframe.setVisible(true);
	}
}
