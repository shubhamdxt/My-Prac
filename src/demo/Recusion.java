package demo;

public class Recusion {
	static int fact(int n,int k,String s)
	{
		System.out.println("n="+n+"  k="+k+"  "+s);
		if(n==0) return 1;
		if(k==0)return 1;
		
		
		return n*fact(n-1,k,"n fact")+k*fact(n,k-1,"k fact");
	}

	public static void main(String[] args) {
		System.out.println(fact(2,2,"start"));
	}
}
