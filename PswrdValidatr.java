
public class PswrdValidatr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String paswrd="Padma@97";
int uc=0,d=0,sp=0,wh=0,lw=0;
if(paswrd.length()>=5 && paswrd.length()<=10) {
	char carray[]=paswrd.toCharArray();
	for(int i=0;i<paswrd.length();i++) {
		if(Character.isLowerCase(carray[i])) 
			lw++;
		
		if(Character.isDigit(carray[i]))
			d++;
		else if(Character.isUpperCase(carray[i]))
			uc++;
		else if(Character.isWhitespace(carray[i]))
			wh++;
		else sp++;
	}
	
	

if(uc>0 && lw>0 && d>0 && wh>0 && sp>0) {
	System.out.println("valid password");
}
else {
	System.out.println("invalid password");
}
	}
	}

}

