package assignment4;

public class maxchar {
public static char max(char[]s) {
	
	int []a=new int [26];
	int max=-1;
	char result=0;
	int len=s.length;
	for(int i=0;i<len;i++) {
		if(s[i]!=' ') {
		a[s[i]-'a']++;
	}
	}
	for(int i=0;i<26;i++) {
		if(max<a[i]) {
			max=a[i];
			result=(char)(i+'a');
		}
	}
	return result;
	
}
	public static void main(String[] args) {
char s[]="books are good".toCharArray();
System.out.println("maximum occuring char is  "+(maxchar.max(s)));
	}

}
