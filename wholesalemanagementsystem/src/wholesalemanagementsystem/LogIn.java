package wholesalemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LogIn {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabel1,jlabel2,jlabelsetext;
	protected JTextField jtextfield;
	protected JPasswordField jpasswordfield;

	
	public LogIn() {
		
		
		jframe=new JFrame();
		jframe.setTitle("LogIn");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        jframe.setVisible(true);
		
		jlabel1 = new JLabel("SignUp");
		jlabel1.addMouseListener(new MouseAdapter() {
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
		jlabel1.setBounds(394, 333, 46, 14);
		jpanel.add(jlabel1);
		
		jlabel2 = new JLabel("LogIn");
		jlabel2.addMouseListener(new MouseAdapter() {
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
		jlabel2.setBounds(521, 333, 46, 14);
		jpanel.add(jlabel2);
		
		jtextfield = new JTextField();
		jtextfield.setBounds(428, 212, 123, 20);
		jpanel.add(jtextfield);
		jtextfield.setColumns(10);
		
		jpasswordfield = new JPasswordField();
		jpasswordfield.setBounds(428, 273, 123, 20);
		jpanel.add(jpasswordfield);
		jframe.setBounds(0,0,1000,600); 
		
		jlabelsetext=new JLabel();
		jlabelsetext.setText("asdas ");
		jlabelsetext.setBounds(0,0,1000,600);
		jpanel.add(jlabelsetext);
		
		
		
		jlabel=new JLabel();
		jlabel.setIcon(new ImageIcon("E:\\Git\\WholeSaleManagementSystem\\wholesalemanagementsystem\\Resources\\LogIn.png"));
		jpanel.add(jlabel);
		
	}
}


	