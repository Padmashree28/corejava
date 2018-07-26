import java.io.*;

public class WriteFilechar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("hello.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("First line");
		bw.newLine();
		bw.write("second line");
		bw.newLine();
		bw.write("third line");
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("file successfully created!!!");
		

	}

}
