package wholesalemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrontPage extends Database{
	
	

	public FrontPage() {
		jframe=new JFrame();
		jframe.setTitle("UserType");//
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		jlabel=new JLabel();
		image=new ImageIcon("FrontPage.jpg");
		jlabel.setIcon(image);
        jlabel.setBounds(0,0,image.getIconWidth(),image.getIconHeight()); 
        jpanel.add(jlabel);
		
        
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
		jbutton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
			//	new CompanyAgent();for company agent
		}});
		jbutton1.setSize(420,40);
		jbutton1.setLocation(450,388);
		jpanel.add(jbutton1);
		
		
		
		jframe.setVisible(true);
	}

}
