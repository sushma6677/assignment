package assignment4;



public class uniquechar {
public  void unique(String s) {
	
char[] s1=s.toCharArray();
for(int i=0;i<s1.length;i++) {
	boolean flag=true;
	for(int j=0;j<s1.length;j++) {
		if(s1[i]==s1[j]&&i!=j) {
			flag=false;
			break;	}
	
}if(flag) {
	System.out.print(s1[i]);
}}
}
	public static void main(String[] args) {
String s="hello geeks";
uniquechar q=new uniquechar();
q.unique(s);
	


}
}