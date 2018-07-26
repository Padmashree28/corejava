import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("hello.txt");
		BufferedReader b=new BufferedReader(fr);
		String line=b.readLine();
		int flag=0;
		while(line!=null) {
			if(line.contains("java")) {
				flag=1;
				break;
			}
			line=b.readLine();		}
		if(flag==1) {
			System.out.println("java found");
		}
		else {
			System.out.println("java not found");
		}

	}

}
