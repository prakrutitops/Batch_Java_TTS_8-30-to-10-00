import javax.swing.JOptionPane;

public class ShowInputDialogEx 
{
	public static void main(String[] args) 
	{
		
		String name = JOptionPane.showInputDialog("Enter your Name");
	
		System.out.println("Welcome "+name);
	}
}
