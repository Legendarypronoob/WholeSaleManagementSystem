package wholesalemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LogIn extends Utility{
	
	

	public LogIn() {
		jframe=new JFrame();
		jframe.setTitle("LogIn");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		jlabel=new JLabel();
		image=new ImageIcon("LogIn.jpg");
		jlabel.setIcon(image);
		jlabel.setBounds(0,0,1000,600); 
		jpanel.add(jlabel);
		
		
		jlabel1=new JLabel("Password");
        jlabel1.setBounds(224,408,145,17);
        jpanel.add(jlabel1);
        jlabel2 =new JLabel("Merchant Id");
        jlabel2.setBounds(224,350,145,17);
        jpanel.add(jlabel2);
        
        
        jtextfield= new JTextField();//merchant id
        jtextfield.setBounds(395,340,381,38);
        jpanel.add(jtextfield);
        
        
        jpasswordfield=new JPasswordField();//password
        jpasswordfield.setBounds(395,403,381,38);
        jpanel.add(jpasswordfield);
         
        
		jbutton=new JButton("LogIn");//login
		jbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
				new Menu();
		}});
		jbutton.setSize(100,40);
		jbutton.setLocation(515,471);
		jpanel.add(jbutton);
		jbutton1=new JButton("SignUp");//sign up
		jbutton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
				new SignUp1();
		}});
		jbutton1.setSize(100,40);
		jbutton1.setLocation(374,471);
		jpanel.add(jbutton1);
		jbutton2=new JButton();//back
		
		
		
		jframe.setVisible(true);
	}

}
