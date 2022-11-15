package assignment4;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
String s1="nap";
String s2="pan"	;	
		
char[]a=s1.toCharArray();		
		
char []b=s2.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
boolean status=true;
if(a.length!=b.length) {
	status=false;
}  
boolean result=Arrays.equals(a, b);
if(result) 
	System.out.println("anagram");

else
	System.out.println("not anagram");

}
}