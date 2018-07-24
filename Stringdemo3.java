
public class Stringdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Deloitte";
		for(int i=0;i<name.length();i++) {
			if(name.indexOf('e',i)==-1) 
				break;
				
			
			if(i==name.indexOf('e',i))
				System.out.println(i);
		}

	}
}

