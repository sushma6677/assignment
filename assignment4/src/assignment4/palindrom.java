package assignment4;

import java.util.Arrays;

public class palindrom {

	public static void main(String[] args) {
int a=2552;
int orginalno=a;
int revno=0;int remainder;
while(a>0) {
	remainder=a%10;
	revno=revno*10+remainder;
	a=a/10;
}
if(orginalno==revno) {
	System.out.println(revno + "palindrom");
}
else {
	System.out.println(revno +  "not palindrom");
}
		
	}
}
	


