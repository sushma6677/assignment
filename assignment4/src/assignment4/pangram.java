package assignment4;

public class pangram {
	public static void containallletter(String str) {
		str=str.toLowerCase();
		boolean flag=true;
		for(char ch='a';ch<='z';ch++) {
			if(!str.contains( str.valueOf(ch))) {
				flag=false;
				break;
			}
		}if(flag) {
			System.out.println("pangram");
		}else
			System.out.println("not pangram");
	}
	public static void main(String[] args) {
String str="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

containallletter(str);
	}

}
