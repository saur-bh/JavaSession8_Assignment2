
/*
 * Implement a class that checks whether a given number is a prime using
	both the Thread class and Runnable interface

	Create two class one for thread and one for runnable interface 
 */

package com.session.acadglid;

public class Assignment2  {


	public static void main(String [] agr) {


		
		WithRunnable wr=new WithRunnable();
		Thread t1=new Thread(wr);

		WithThread wt = new WithThread();
		Thread t2=new Thread(wt);
		
		
		t1.start();   //start thread one
		t2.start();
		

	}





}
