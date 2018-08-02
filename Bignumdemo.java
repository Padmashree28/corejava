package com.deloitte;

public class Bignumdemo {
	public Integer[] bigsmall(int num1,int num2) {
		Integer x[]=new Integer[2];
		if(num1>num2) {
			x[0]=num1;
			x[1]=num2;
		}
		else {
			x[0]=num2;
			x[1]=num1;
		}
		return x;
		
	}

}
