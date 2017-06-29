package code;
import java.util.*;
import java.io.*;
public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value of a,b,c:");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	if(a>b){
		if(a>c){
		System.out.println("the largest number is"+a);
			}
		else{
			System.out.println("the largest number is"+c);
		}
	}
	if(b>c){
		System.out.println("the largest number is:"+b);
	}
	}

}
