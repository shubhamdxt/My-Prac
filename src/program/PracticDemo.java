package program;

public class PracticDemo {
	static int min;
	int min_index;
	int temp;
	public static void main(String[] args) {
		
		int array []= {10,-6,4,-8,-2,1,-3,9};
		
		for(int i=0;i<array.length-1;i++) 
		{
		  int min_index=i;
		  for(int j=i+1;j<array.length;j++)
		  {
			 if(array[j]<array[min_index]) 
			 {
			   min_index=j;	 
			 }  
		  }
		  int temp=array[min_index];
		  array[min_index]=array[i];
		  array[i]=temp;
		   min=array[min_index];
		}
		for(int i=0;i<array.length;i++) 
		{
		System.out.print(array[i] +" ,");
	    }
	}

}
