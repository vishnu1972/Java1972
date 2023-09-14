class Check1 
{
	public static void main(String[] args) 
	{ 
		int sum=0;
		
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				
			sum = sum+i;
			
			}

			
		}
		int count=0;

		while(sum!=0)
		{
			int last=sum%10;
			if((last%2==0)&&(last!=0))
			{
				count++;
			}
			sum /=10;
		}
		
		System.out.println("count of even digits are "+count);
		
		
	}
}
