
import java.util.*;
public class MNSkip{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.print("M=");
int m=input.nextInt();
System.out.print("N=");
int n=input.nextInt();
System.out.print("K=");
int k=input.nextInt();
for(int i=m;i<=n;i=i+k+1)
{
 System.out.print(i+" ");
}
}
}