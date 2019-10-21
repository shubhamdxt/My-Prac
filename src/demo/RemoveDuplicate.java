package demo;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
     int [] a= {10 ,20 ,10 ,1 ,100 ,10 ,2 ,1 ,5 ,10};
      int size=a.length-1;
     for(int i=0;i<size;i++) 
     {
      for(int j=i+1;j<size;j++)
      {
    	  if(a[i]==a[j]) {
    		  for(int k=j;k<size;k++) {
    			  a[k]=a[k+1];
    		  }
    		  size--;
    		  
    		  j--;
    	  }
      }
     }
     System.out.println("Array of element after delete duplicate :");
     for(int i=0;i<size;i++) {
    	 System.out.print(a[i]+",");
     }
	}

}
