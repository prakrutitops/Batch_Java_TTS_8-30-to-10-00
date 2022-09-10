import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx implements ActionListener
{
	JFrame frame;
	JComboBox comboBox;
	String city[]= {"Baroda","Surat","Rajkot"};
	JButton btn;
	public ComboBoxEx() 
	{
		// TODO Auto-generated constructor stub
		frame= new JFrame();
		
		comboBox = new JComboBox<>(city);
		comboBox.setBounds(217, 30, 128, 20);
		
		btn=new JButton("Submit");
		btn.setBounds(171, 65, 89, 23);
		
		
		btn.addActionListener(this);
		
		frame.add(comboBox);
		frame.add(btn);
		
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new ComboBoxEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
		{
			System.out.println("Your city is : "+comboBox.getItemAt(comboBox.getSelectedIndex()));
			String city =comboBox.getItemAt(comboBox.getSelectedIndex()).toString();
			try 
			{
				FileOutputStream fout = new FileOutputStream("E://prakruti.txt");
				String text="Your City is : ";
				fout.write(text.getBytes());
				fout.write(city.getBytes());
			} 
			catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			finally 
			{
				System.out.println("Success");
			}
			
			
		}
	}
}
