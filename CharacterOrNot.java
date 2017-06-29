package code;
import java.util.*;
public class CharacterOrNot {
	public static void main(String args[]){
		Scanner s=new Scanner (System.in);
		System.out.println("enter any character:");
		char c=s.next().charAt(0);
		if((c>='A'&&c<='z')||(c>='a'&&c<='z')){
			System.out.println("it is an alphabet");
		}
		else{
			System.out.println("it is not an alphabet");
		}
			
		}
	}


