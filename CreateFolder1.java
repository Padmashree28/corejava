import java.io.*;
public class CreateFolder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("D:\\sql\\folder1");
boolean status=f.mkdir();
if(status)
	System.out.println("folder successfully created");
	else
		System.out.println("folder not created");
	}

}
