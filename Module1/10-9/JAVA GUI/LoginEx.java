

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;
import javax.swing.text.PasswordView;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class LoginEx implements ActionListener
{
	JFrame jf;
	JLabel l1,l2,l3,l4;
	JTextField f1;
	JPasswordField jp;
	JButton b1,b2;
	JPanel panel;
	public LoginEx() 
	{
		jf = new JFrame();
		 
		 l1 = new JLabel("USER NAME");
		 l1.setBounds(77, 92, 115, 28);
		 
		 l2 = new JLabel("PASSWORD");
		 l2.setBounds(77, 139, 115, 28);
		 
		 l3 = new JLabel("Login form");
		 l3.setForeground(Color.WHITE);
		 l3.setFont(new Font("Verdana", Font.BOLD, 35));
		 
		 l4 = new JLabel(" Click here to create a new account");
		 l4.addMouseListener(new MouseInputListener() {
			
			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e)
			{
			 RegiEx rg = new RegiEx();
			// e.setSource(l4);
			 //l4.setVisible(true);
			//rg.setVisible(true);
			 //rg.pack();
				
			}
		 });
		 l4.setForeground(Color.BLUE);
		 l4.setFont(new Font("Tahoma", Font.ITALIC, 14));
		 l4.setBounds(113, 250, 300, 14);
		
		 
		 f1 = new JTextField();
		 f1.setBounds(215, 94, 191, 24);
		 jp = new JPasswordField();
		 jp.setBounds(215, 141, 191, 24);
		 b1 = new JButton("Close");
		 b1.addActionListener(this);
		 b1.setBackground(new Color(105,105,105));
		 b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		 b1.setBounds(56, 200, 150, 30);
		
			
		
		 b2 = new JButton("LogIn");
		
		 b2.setBackground(new Color(105,105,105));
		 b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		 b2.setBounds(250, 200, 150, 30);
		 b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					
				
					
					String host="jdbc:mysql://localhost:3306/";
					String db="info";
					String url=host+db;
					
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=(Connection) DriverManager.getConnection(url, "root", "");
						
						
						String name=f1.getText();
						String ch=jp.getText();
					//	String pass = ch.toString();
					
							
						String sql="insert into student values(null,'"+name+"','"+ch+"')";
						
						Statement stmt=(Statement) con.createStatement();
						
						int noofinsert=stmt.executeUpdate(sql);
						
						if(noofinsert!=0 && name!=null && ch!=null) 
						{
							//JOptionPane.showMessageDialog(b1, this,"welcome" +f1, noofinsert);
							
							jf.setVisible(false);
							
						}
						else
						{
							System.out.println("error");
						}
						
						
						
						
						
					}
					catch(Exception e2)
					{
						System.out.println(e2);
					}
					
					
					
					
					
					
					
				}
			});
			
			
	
		 panel = new JPanel();
		 panel.setBackground(Color.black);
		 panel.setBounds(0, 11, 500, 50);
		
			
		 
		 jf.add(l1);jf.add(l2);jf.add(f1);jf.add(jp);jf.add(b1);jf.add(b2);jf.add(panel);panel.add(l3);	jf.add(l4);
		 jf.getContentPane().setBackground(Color.lightGray);
		 jf.setTitle("LOGIN FORM");
		 jf.setLayout(null);
		 jf.setSize(500, 500);
		 jf.setVisible(true);
		 

		
	}
	
	

	public static void main(String[] args)
	{
		
		new LoginEx();
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		b1 = (JButton)e.getSource();
		jf.dispose();
	
		
	}

	


}
