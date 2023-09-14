class Armstrong1000 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
		{
			int temp=i,count=0;
			while (temp!=0)
			{
				int last = temp%10;
				count++;
				temp /=10;
			}
			int temp2=i,sum=0;
			while (temp2!=0)
			{
				int last=temp2%10;
			    int pro=1;

			for (int j=1;j<=count ;j++ )
			{
				pro *= last;
			}
			    sum +=pro;
				temp2 /=10;
			}
			if (sum == i)
			{
				System.out.println(i);
			}
		}
		// System.out.println("Hello World!");
	}
}
