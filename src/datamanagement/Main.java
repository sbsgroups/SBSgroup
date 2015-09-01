package datamanagement;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.*;
// test comment new thing
public class Main 
{
    Connection con;
    Statement st;
    ResultSet rs;
    JFrame f=new JFrame("User Login");
    JLabel l=new JLabel("UserName");
    JLabel l1=new JLabel("Password");
    JTextField t=new JTextField(10);
    JTextField t1=new JTextField(10);
    JButton b= new JButton("Login");   
    
    public Main()
    {
        connect();
        frame();
    }
    public void connect()
    {
        try
        {
        String driver="sun.jdbc.odbc.JdbcOdbcDriver";
        Class.forName(driver);
        String db="jdbc:odbc:login";
        con =DriverManager.getConnection(db);
        st=con.createStatement();
        }
        catch(Exception ex)
        {
            
        }
    }
    public void frame()
    {
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JPanel p=new JPanel();
        p.add(l);
        p.add(l1);
        p.add(t);
        p.add(t1);
        p.add(b);
        f.add(p);
        
        
        
    }

    public static void main(String[] p) 
    {
        new Main();
        new cgCTL().execute();
    }
}
