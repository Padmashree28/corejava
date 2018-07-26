import java.io.*;
public class FileReadDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("hello.txt");
		int x=fi.read();
		while(x!=-1) {
			System.out.print((char)x);
			x=fi.read();
			
		}
fi.close();
	}

}
