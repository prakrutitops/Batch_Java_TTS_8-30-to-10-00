import javax.swing.JFrame;

public class FrameEx3 
{
	
	JFrame frame;
	public FrameEx3() 
	{
		// TODO Auto-generated constructor stub
	
		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new FrameEx3();
	}
}
