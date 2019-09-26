package demo;

public class FindBiggestSmallestNumber {

	
	public static void main(String[] args) {
		int a[] = new int[]{33,53,73,94,22,45,23,87,13,63};
        int small=a[0];
        int biggest=a[0];
        
        for(int i=1;i<a.length;i++) 
        {
        	if(a[i]>biggest) 
        	{
        	 biggest=a[i];	
        	}
        	else if(a[i]<small) {
        		small=a[i];
        	}
        }
        	 System.out.println("Largest Number is : " + biggest);
             System.out.println("Smallest Number is : " + small);
        
	}

}
