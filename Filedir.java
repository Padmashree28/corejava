import java.io.*;
public class Filedir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:\\sql\\folder1");
		if(f.isDirectory()) 
			System.out.println("directory");
			else 
				System.out.println("not a directory");
			
		
		

	}

}
