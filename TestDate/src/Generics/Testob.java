package Generics;
public class Testob {
	public void main(String[] args){
		Advance<String> g1=new Advance<String>("himani");
		g1.show();
		System.out.println(g1.getob());
		Advance<Integer> g2=new Advance<Integer>(new Integer(20));
		g2.show();
		System.out.println(g2.getob());
	}

}


