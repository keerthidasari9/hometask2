package com.epam.hometask2;

public class gift {
			int choco,cha,t;
			gift(int ch,int ca)
			{
				cha=ca;
				choco=ch;
			}
			int totalWeight()
			{
				Chocolates ch1=new Chocolates(choco);
				Candy c=new Candy(cha);
				t=ch1.Weight_meth()+c.Weight_meth();
				return t;
			}
}
