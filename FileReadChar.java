import java.io.*;
public class FileReadChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader fr=new FileReader("hello.txt");
BufferedReader b=new BufferedReader(fr);
String line=b.readLine();

while(line!=null) {
	System.out.println(line);
	line=b.readLine();
}
fr.close();
	}

}
