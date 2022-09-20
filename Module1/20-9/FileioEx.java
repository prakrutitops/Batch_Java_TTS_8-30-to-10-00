import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileioEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		try 
		{
			FileOutputStream fout =new FileOutputStream("E://a.txt");
			fout.write(10);
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			
		}
		
	}
}
