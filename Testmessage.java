
public class Testmessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twitterfeedreader tfr=new Twitterfeedreader();
		//Message m=tfr.pollfornewmsg();
		System.out.println(tfr.pollfornewmsg().getMsgid());
		//System.out.println(m.getMsgsrc());
		//System.out.println(m.getMsgtype());
//System.out.println(m.getMsg());
	}

}
