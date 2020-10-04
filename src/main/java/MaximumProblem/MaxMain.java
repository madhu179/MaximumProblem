package MaximumProblem;

public class MaxMain <A,B,C extends Comparable> {
	A a;
	B b;
	C c;
	MaxMain()
	{
		
	}
	
	MaxMain(A a,B b,C c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public <E> E FindMaximum()
	{
		return FindMaximum(a,b,c);
	}
	
	public  <E extends Comparable> E FindMaximum(A a2,B b2,C c2) {
     E max = (E) a2;
     if(((E)b2).compareTo(max)>0)
    	 max=(E) b2;
     if(((E)c2).compareTo(max)>0)
    	 max=(E) c2;
     return(max);
    }

}
