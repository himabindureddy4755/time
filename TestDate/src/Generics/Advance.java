package Generics;

public class Advance<t> {
	t ob;
	public Advance(t ob)
	{
		this.ob=ob;
	}
	public void show()
	{
		System.out.println(ob.getClass().getName());
		
	}
	public t getob(){
		return ob;
	}
}
