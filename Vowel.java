package code;
import java.util.*;
public class Vowel {
	public static void main(String args[]){
		char c;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the character:");
		c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
			System.out.println("it is a vowel");
		}
		else{
			System.out.println("it is a consonant");
		}
		
	}

}
