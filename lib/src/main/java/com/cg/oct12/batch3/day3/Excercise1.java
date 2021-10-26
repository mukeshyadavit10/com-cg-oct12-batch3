package com.cg.oct12.batch3.day3;

public class Excercise1
{
	public static void main(String[] args) {
		int arr[] = {13,5,11,2,7,10};
		int min=Integer.MAX_VALUE;
		int m_min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				m_min=min;
				min= arr[i];
				
			}
			else if(arr[i]<m_min)
				m_min=arr[i];
		}
		System.out.println("Second Smallest="+m_min);
	}

}
 