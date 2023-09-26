import java.util.Scanner;
public class special{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char[] arr=st.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='!'||arr[i]=='@'||arr[i]=='#'||arr[i]=='$'||arr[i]=='%'||arr[i]=='^'||arr[i]=='&'||arr[i]=='*'){
		count+=1;
		System.out.print(arr[i]);
	}
}
System.out.println();
	System.out.println(count);
}
}
