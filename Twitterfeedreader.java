
public class Twitterfeedreader implements socialfeedreader {

	@Override
	public Message pollfornewmsg() {
		Message m1=new Message();
		m1.setMsgid(1);
		m1.setMsgsrc("twitter");
		m1.setMsgtype("string");
		m1.setMsg("hello all");
		return m1;
		
	}
	

}
