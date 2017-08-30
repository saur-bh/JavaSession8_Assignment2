package com.session.acadglid;

import java.util.Scanner;

public class WithRunnable implements Runnable{


	public void run() {
		System.out.print("Runnable : Enter the number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int flag=0;
		try {

			for(int i = 2; i<= number/2;i++) {    // start loop from 2 as prime number is greater than 1 and shoudl be divided by 1


				if(number%2==0) {     // If number %2 == 0 then not prime

					flag = 1;
				}

				Thread.sleep(1000);   // implement of thread.sleep 
			}

			if(flag==0) {

				System.out.println(" Message from Runnable ; Enter number is prime number");
			}



		}
		catch (Exception e){

			System.out.println("Message from Runnable; Number is not prime" );
		}

	}
}
