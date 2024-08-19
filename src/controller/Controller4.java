package controller;

public class Controller4 
{

	public Controller4()
	{
		super();
	}

	public String ConvBin (int n, String re)
	{
		if (n == 0)
		{
			
			return re;
		}
		else
		{
				
			int r = n%2;
			re = String.valueOf(r) + re;
						
			return ConvBin ((int)n/2, re);
		}
	}
	
}
