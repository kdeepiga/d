package guvi;
import java.math.*;
public class SumOfN {
public static void main(String args[]){
long num=13;
int count=0;
while(num!=0){
	count++;
	num=num/10;
}
System.out.println(+count);

}
}