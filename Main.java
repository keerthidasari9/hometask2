package com.epam.hometask2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gift g=new gift(3,4);
		gift g1=new gift(3,5);
		gift g2=new gift(3,2);
		int x[]=new int[3];
		x[0]=g.totalWeight();
		x[1]=g1.totalWeight();
		x[2]=g2.totalWeight();
		Arrays.sort(x);
		for(int i=0;i<3;i++)
		{
			System.out.print(x[i]+" ");
		}
	}

}
