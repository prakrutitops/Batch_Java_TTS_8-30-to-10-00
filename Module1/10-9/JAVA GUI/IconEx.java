import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class IconEx 
{
	public IconEx() 
	{
		// TODO Auto-generated constructor stub
		Frame frame =new Frame();
		Image icon = Toolkit.getDefaultToolkit().getImage("E:\\icon.png");    
		frame.setIconImage(icon);
		frame.setLayout(null);     
		frame.setSize(400,400);     
		frame.setVisible(true);     
	}
	public static void main(String[] args)
	{
		
		new IconEx();
		
	}
}
