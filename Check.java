class Check 
{
	public static void main(String[] args) 
	{
		int n=142;
		int pro=1;
		while(n!=0)
		{
			int last = n%10;
			pro = pro*last;
			n = n/10;
		}
			if(pro%2==0)
			{
				
				System.out.println("product of the digits is even");
			}
			else
			{
				
				System.out.println("product of the digits is odd");
			}
		
		
		
	}
}
