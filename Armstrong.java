class Armstrong  
{
	public static void main(String[] args) 
	{
		int n=153,temp=n,temp2=n,count=0,sum=0;
        while (n!=0)
        {
			int last=n%10;
			count++;
			n /=10;
        }
		while (temp!=0)
		{
			int last = temp%10;
			int pro=1;
			for (int i=1;i<=count ;i++ )
			{
				pro *=last; 
			}
			sum += pro;
			temp /=10;
		}
		if (sum == temp2)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}


		
	}
}
