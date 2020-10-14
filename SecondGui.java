import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SecondGui extends JFrame implements ActionListener
{	JButton b1 = new JButton("Login");
	JTextField username=new JTextField();
	String use,pass;
	JPasswordField password=new JPasswordField();
	public SecondGui()
	{
		setLayout(null);
		JLabel l = new JLabel("Admin Login Form",JLabel.CENTER);
		l.setBounds(100,20,200,100);
		l.setFont(new Font("Courier New", Font.BOLD, 18));
		l.setForeground(Color.BLACK);  //by default
	
		JLabel l1=new JLabel("USERNAME");
		JLabel l2=new JLabel("PASSWORD");
		l1.setBounds(100,100,200,100);
		l2.setBounds(100,150,200,100);
	
		add(l);
		add(l1);
		add(l2);
		
		username.setBounds(250,130,200,30);
		
		password.setBounds(250,180,200,30);
		
		add(username);
		add(password);
		
		
		b1.setBounds(200,250,100,30);
		
		add(b1);
		b1.addActionListener(this);
		
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent a) 
		{	
			if(a.getSource()==b1)
			{	use=username.getText();
				pass=password.getText();
				if(use.equals("piyush")&&pass.equals("kapoor"))
					{
					setVisible(false);
					ThirdGui obj = new ThirdGui();
				}
					
			}
		}
}