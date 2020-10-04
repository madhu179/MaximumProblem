package MaximumProblem;

public class MaxMain <A,B,C extends Comparable>{
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
	
	public  <E extends Comparable<E>> E FindMaximum(A a2,B b2,C c2) {
	     E max = (E) a2;
	     if(((E)b2).compareTo(max)>0)
		 max=(E) b2;
	     if(((E)c2).compareTo(max)>0)
		 max=(E) c2;
	     return(max);
    }

	public <E extends Comparable<E>> E FindMaximum(E[] e) {	
	    int n = e.length;
	    for (int i = 0; i < n-1; i++){
	        for (int j = 0; j < n-i-1; j++){
	             if (e[j].compareTo(e[j+1]) > 0) {
	                  E ele = e[j];
	                  e[j] = e[j+1];
	                  e[j+1] = ele;
	             }
	         }
	    }
	    E max = e[n-1];
	    printMax(max);
	    return(max);
    }
	
	public <E> void printMax(E e)
	{
	    System.out.println("The Max is "+e);
	}

}
