import java.io.*;
public class Createfile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("D:\\sql\\MynewFile1");
boolean created=f.createNewFile();
if(created==true)
	System.out.println("file successfully created");
else
	System.out.println("file not created");

	}

}
