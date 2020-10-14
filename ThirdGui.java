import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



class ThirdGui extends JFrame implements ActionListener
{
		JButton b1 = new JButton("Add Librarian");
		JButton b2 = new JButton("View Librarian");
		JButton b3 = new JButton("Delete Librarian");
		JButton b4 = new JButton("Logout");
		
	public ThirdGui()
	{
		setLayout(null);
		JLabel l = new JLabel("Admin Section",JLabel.CENTER);
		
		l.setBounds(200,10,200,100);
		
		l.setFont(new Font("Courier New", Font.BOLD, 25));
		//l.setForeground(Color.GRAY);
	
		add(l);
		
		
		
		b1.setBounds(200,100,200,50);
		b2.setBounds(200,150,200,50);
		b3.setBounds(200,200,200,50);
		b4.setBounds(200,250,200,50);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b4.addActionListener(this);
		b3.addActionListener(this);
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent a) 
		{	
			if(a.getSource()==b4)
			{	
					setVisible(false);
					new SecondGui();
						
			}
			if(a.getSource()==b2)
			{	
				ViewLibrarian obj = new ViewLibrarian();
			}
			if(a.getSource()==b1)
			{	
					setVisible(false);
					AddLibrarian obj = new AddLibrarian();
						
			}
			if(a.getSource()==b3)
			{	
					setVisible(false);
					DeleteLibrarian1 obj = new DeleteLibrarian1();
						
			}
			
		}
	}