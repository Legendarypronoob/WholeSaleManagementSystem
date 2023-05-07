package wholesalemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrontPage {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabel1;
	public FrontPage() {
		
		
		jframe=new JFrame();
		jframe.setTitle("UserType");//
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        jframe.setVisible(true);
		
        jlabel1=new JLabel();
        jlabel1.setFont(new Font("Tahoma", Font.BOLD, 24));
        jlabel1.setForeground(new Color(255, 255, 255));
        jlabel1.setBounds(0,0,1000,600);
		jpanel.add(jlabel1);
		
		jlabel=new JLabel();
		jlabel.setSize(1000,600);
		jlabel.setIcon(new ImageIcon("E:\\Git\\WholeSaleManagementSystem\\wholesalemanagementsystem\\Resources\\FrontPage.png"));
		jlabel.setBounds(0,0,1000,600); 
		jpanel.add(jlabel);
		
		for(int x=1;x>=0;x--) {
			jlabel1.setText("              "+x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//jframe.dispose();
		new LogIn();
		
		
		
	}
}
