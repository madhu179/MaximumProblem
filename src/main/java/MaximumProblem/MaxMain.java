package MaximumProblem;

public class MaxMain {
	public Integer FindMaximum(Integer a,Integer b,Integer c) {
     int max = a;
     if(b.compareTo(max)>0)
    	 max=b;
     if(c.compareTo(max)>0)
    	 max=c;
     return(max);
    }

	
	public Float FindMaximum(Float a,Float b,Float c) {
	     Float max = a;
	     if(b.compareTo(max)>0)
	    	 max=b;
	     if(c.compareTo(max)>0)
	    	 max=c;
	     return(max);
	    }
}
