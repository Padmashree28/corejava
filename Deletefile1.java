import java.io.File;
import java.io.IOException;

public class Deletefile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\sql\\MynewFile1");
		if(f.exists()) {
			System.out.println("file exists");
		boolean dstatus=f.delete();
		if(dstatus) 
			System.out.println("successfully deleted");
		else
			System.out.println("not deleted");
		}
			else {
				System.out.println("file does not exist");
				boolean f1=f.createNewFile();
				if(f1) 
					System.out.println("file created");
					else
						System.out.println("file not created");
						
				
		}
	}
}


