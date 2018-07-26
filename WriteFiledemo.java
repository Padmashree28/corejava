import java.io.*;
public class WriteFiledemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo=new FileOutputStream("hello.txt");
		DataOutputStream dos=new DataOutputStream(fo);
		dos.writeBytes("hello");
		dos.writeBytes("world");
		
		
//		byte a[]= {'h','e','l','l','o'};
////		fo.write('b');
////		fo.write('a');
////		fo.write('n');
////		fo.write('a');
////		fo.write('n');
////		fo.write('a');
//		fo.write(a);
		dos.close();
		fo.close();
		System.out.println("file successfully created!!!");
        

}
}
