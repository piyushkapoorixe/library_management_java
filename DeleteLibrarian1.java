import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


class DeleteLibrarian1 extends JFrame implements ActionListener
{
	JButton b1 = new JButton("Delete");
	JButton b2 = new JButton("Back");
	JTextField id = new JTextField();
	
	String t1;
	DeleteLibrarian1()
	{
	//layout
	JLabel l=new JLabel("Delete Librarian",JLabel.CENTER);
	l.setBounds(100,20,200,100);
	l.setFont(new Font("Courier New", Font.BOLD, 18));
	JLabel l1=new JLabel("ID");
	
	l1.setBounds(100,100,200,100);
	
	add(l);
	add(l1);
	
	
	
	id.setBounds(250,130,200,30);
	
	
	add(id);
	
	
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
			
			
			try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");

			Statement s=c.createStatement();
			
			int x = s.executeUpdate("delete from emp11 where id='"+t1+"' ");
			
			//System.out.println(x);
			ResultSet result1=s.executeQuery("select * from emp11");
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		if(a.getSource()==b2)
		{
			new ThirdGui();
		}
	}
}
