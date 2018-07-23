abstract class person{
	public abstract boolean whatyoudo();
	public boolean doyouspeak() {
		System.out.println("everyone speaks");
		return true;
	}
	
}
 class trainer extends person{
	@Override
	public  boolean whatyoudo() {
	System.out.println("delivers lectures");
	return true;
	}
	
	
}
 class doctor extends person{
	@Override
	public  boolean whatyoudo() {
		System.out.println("cures ill");
		return true;
	}
	
}
 class pilot extends person{
	@Override
	public boolean whatyoudo()
	{
		System.out.println("drives flight");
		return true;
	}
}
	
	


