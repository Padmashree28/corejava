class fbreader implements socialfeedreader{

	@Override
	public Message pollfornewmsg() {
		// TODO Auto-generated method stub
		Message m2=new Message();
		m2.setMsgid(2);
		m2.setMsgsrc("fb");
		m2.setMsgtype("string");
		m2.setMsg("hii all");
		m2.setMsgsender("ragu");
		return m2;
		
	}
	
	
}


