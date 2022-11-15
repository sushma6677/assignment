package assignment4;

public class waptocount {


	public static void main(String[] args) {
String s="sushma505";
int vowels=0, consonant=0, specialchar=0,digits=0;
//s.toLowerCase();
//char [] s1=s.toCharArray()	;
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			vowels++;
		else 
			consonant++;
	}
		else if(ch>=0||ch<=9) 
		digits++;
		
		else 
			specialchar++;
}
		System.out.println("vowels: "+vowels);
		System.out.println("consonant: "+consonant);
		System.out.println("digits: "+digits);
		System.out.println("specialchar: "+specialchar);

}

}
