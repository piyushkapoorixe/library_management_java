import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;


public class TryGui
{	
	public static void main(String... s)
	{
		FirstGui obj = new FirstGui();
	}
}

class FirstGui extends JFrame implements ActionListener
{	JButton b1=new JButton("Admin Login");
	//JButton b2 = new JButton("Librarian Login");
	//JFrame f=new JFrame("lbms");
	
	public FirstGui()
	{	setLayout(null);
		JLabel l = new JLabel("Library Management System");
		
		l.setBounds(200,50,200,50);
		add(l);
		
		
		b1.setBounds(200,100,200,50);
		//b2.setBounds(200,200,200,50);
		
		add(b1);
		//add(b2);
		b1.addActionListener(this);
		
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

      
		public void actionPerformed(ActionEvent a) 
		{	
			if(a.getSource()==b1)
			{	
				setVisible(false);
				SecondGui obj = new SecondGui();
				
					
			}
		}
	}
