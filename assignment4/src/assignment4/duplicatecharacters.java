package assignment4;

public class duplicatecharacters {

	public static void main(String[] args) {
		String s="aabbccdd";
		char [] arr=s.toCharArray();
		//StringBuilder s3=new StringBuilder() ;
			
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;

			for(int j=1+i;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=true;
	System.out.println(arr[j]);				
	}

			}}}}
