package wholesalemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignUp1 {
	
	protected JFrame jframe;
	protected JPanel jpanel;
	protected JLabel jlabel,jlabel1,jlabelback;
	protected JTextField jtextfield,jtextfield1,jtextfield2;

	
	public SignUp1() {
		
		
		jframe=new JFrame();
		jframe.setTitle("SignUp");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
        jframe.setResizable(false);
        jframe.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        jframe.setVisible(true);
		
		jlabel1 = new JLabel("Next");
		jlabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new SignUp2();
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
		
		jlabelback=new JLabel("back");
		jlabelback.setBounds(70,70,70,70);
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
		jpanel.add(jlabelback);

		jtextfield = new JTextField();
		jtextfield.setBounds(428, 174, 123, 20);
		jpanel.add(jtextfield);
		jtextfield.setColumns(10);
		
		jtextfield1 = new JTextField();
		jtextfield1.setBounds(428, 205, 123, 20);
		jpanel.add(jtextfield1);
		jtextfield1.setColumns(10);
		
		jtextfield2 = new JTextField();
		jtextfield2.setBounds(428, 233, 123, 20);
		jpanel.add(jtextfield2);
		jtextfield2.setColumns(10);
		
		jlabel=new JLabel();
		jlabel.setIcon(new ImageIcon("SignUp1.png"));
		jframe.setBounds(0,0,1000,600); 
		jpanel.add(jlabel);
		
		
	}
}
	
	
