import java.io.*;
public class CSV
{
    public static void main(String args[])
	{
        	File f = new File("E:/abc.txt");
        
		try
		{
	        FileOutputStream fout = new FileOutputStream(f);
        
		    String s = "C:/Users/Test/videos.mp4\nC:/Users/Test/Vivek.txt\nC:/Users/desktop/javac.txt";
	        
		    char ch[] = s.toCharArray();
            
		    for(int i = 0;i<s.length();i++)
			{
                
		 	   fout.write(ch[i]);

            }
            
		    fout.close();

	        FileInputStream fin = new FileInputStream(f);
        
		    int i = fin.read();
            
		    while(i!=-1)
			{
                System.out.print((char)i);
               
		 		i = fin.read();
        	}
	
        	    fin.close();
       	}
        	
        catch(IOException e)
        {
            
		    System.out.println(e);
        }
    }
}