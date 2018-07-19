
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int found=0;
		int pos=0;
		String names[]= {"hari","josh","karthick","guru"};
		for(int i=0;i<names.length;i++) {
			if (names[i].equals("guru")) {
			found=1;
			pos=i;
			break;
		}
	}
if(found==1) 
	System.out.println("guru found at " +pos + "place");

else 
	System.out.println("not found");

	}

}
