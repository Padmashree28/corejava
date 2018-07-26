import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writefiledemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo=new FileOutputStream("hello.txt");
		fo.write('b');
	fo.write('a');
	fo.write('n');
	fo.write('a');
	fo.write('n');
	fo.write('a');
	fo.close();
	System.out.println("file successfully created!!!");
	

	}

}
