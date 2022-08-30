package com.test;

public class Jump {

	public static void main(String[] args) {
		int i=1,n=100;
		while(i<=n)
		{
			for(i=1;i<=100;i++)
			{
				if(i>=50 && i<=60)
				{
					continue;
				}
				System.out.print(i+"");
			}
			
		}
			

	}

}
