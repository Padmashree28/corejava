import java.io.File;

public class Filelist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:\\sql\\MyNewFile1");
		if(f.canRead()){
			System.out.println("readable");
		}
		else {
			System.out.println("not readable");
		}
		if(f.canWrite())
			System.out.println("writable");
		else
			System.out.println("not writable");
		//String[] allfiles=f.list();
		//for(int i=0;i<allfiles.length;i++)
			//System.out.println("all files:" +allfiles[i]);

	}

}
