package com.JavaTraining;

public class PracticeTest {

	public static void main(String[] args) {


		/*Write a program that uses console.log to print all the numbers from 1 to 100, with two exceptions. For numbers divisible by 3, print "Fizz" instead of the number, and for numbers divisible by 5 (and not 3), print "Buzz" instead. When you have that working, modify your program to print "FizzBuzz" for
		numbers that are divisible by both 3 and 5 (and still print "Fizz" or "Buzz" for numbers divisible by only one of those).*/

		for(int i=1;i<101;i++) {

			System.out.println(i);
			if((i%3==0&&i%5==0))  {
				System.out.println("sai");
			}
			if (i%5==0)				//  quotient this symbol refers / quotient
				System.out.println("Buzz");
			else if(i%3==0) {           //divisible by 3 
				System.out.println("Fizz");
			}
		}}
}




