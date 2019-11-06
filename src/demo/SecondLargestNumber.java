package demo;

// This is give the wrong output right now
public class SecondLargestNumber {

	public static void main(String[] args) {
	
		
		int a[]= {10,20,5,4,90,4,88,58};
		int size=a.length;
		for(int i=1;i<size;i++) {
			
			for(int j=i+1;j<size;j++) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	//}
	int b=a[size-2];
	System.out.println(b);
}
}
