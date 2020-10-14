import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


//make sure db doesnt contains null values    :  if((t1.length()!=0) || (t2.length()!=0))
//no duplicate ids      
//we are not considering that name should be string id must be integer,because it will be entered by admin who will not type any unuseful values

class AddLibrarian extends JFrame implements ActionListener
{
	JButton b1 = new JButton("Add");
	JButton b2 = new JButton("Back");
	JTextField id = new JTextField();
	JTextField name = new JTextField();
	String t1,t2;
	AddLibrarian()
	{
	//layout
	JLabel l=new JLabel("Add Librarian",JLabel.CENTER);
	l.setBounds(100,20,200,100);
	l.setFont(new Font("Courier New", Font.BOLD, 18));
	JLabel l1=new JLabel("ID");
	JLabel l2=new JLabel("NAME");
	l1.setBounds(100,100,200,100);
	l2.setBounds(100,150,200,100);
	add(l);
	add(l1);
	add(l2);
	
	
	id.setBounds(250,130,200,30);
	name.setBounds(250,180,200,30);
	
	add(id);
	add(name);
	
	b1.setBounds(150,250,100,30);
	b2.setBounds(350,250,100,30);	
	add(b1);
	add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	setLayout(null);
	setVisible(true);
	setSize(600,600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==b1)
		{
			t1=id.getText();
			t2=name.getText();
			if((t1.length()!=0) || (t2.length()!=0))			
			{
			try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");

			Statement s=c.createStatement();
			//int x = s.executeUpdate("insert into emp "+" values(101,'xyz')");
			int x = s.executeUpdate("insert into emp values('"+t1+"','"+t2+"')");
			
			//System.out.println(x);
			ResultSet result1=s.executeQuery("select * from emp11");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}

		}
		if(a.getSource()==b2)
		{
			new ThirdGui();
		}
		
	}
}
