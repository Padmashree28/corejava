
public class Wrapperclass {
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="padma@ 1997";
		char carray[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			char x=carray[i];
			if(Character.isDigit(x))
				System.out.println(x + "is a digit");
			else if(Character.isLetter(x))
				System.out.println(x + "is a letter");
			else if(Character.isWhitespace(x))
				System.out.println(x + "is a blank");	
			else 
				System.out.println(x + "is a special character");
				
		}
		
		

	}

}
