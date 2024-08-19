package view;

import controller.Controller4;

public class Main4 
{

	public static void main(String[] args) 
	{
		Controller4 c = new Controller4();
		
		int n = 56;
		String re = "";
		
		String resultado = c.ConvBin(n, re);
		
		System.out.println(n + " é " + resultado + " em binario." );
		
		
	}
	
}
