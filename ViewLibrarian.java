import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ViewLibrarian extends JFrame
{
	ViewLibrarian() 
	{		String data[][];
			data=new String[100][2];
			String []column={"Id", "Name"};
			int i=0;
		try
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","mca6");
			Statement s=c.createStatement();
			ResultSet result1=s.executeQuery("select * from emp11");
			while(result1.next())
			{	data[i][0]=result1.getString(1);
				data[i][1]=result1.getString(2);
				//System.out.println(result1.getString(1)+"="+result1.getString(2));
				i++;
			}
			//***************************Layout

			JTable vltable=new JTable(data,column);    //Count++ in resultset loop
			
			JScrollPane pane = new JScrollPane(vltable);
			add(pane);
			
			
			setVisible(true);
			setSize(300,300);
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
