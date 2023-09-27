import java.util.*;
public class CompositeNum{
public static void main(String [] args){
Scanner input=new Scanner(System.in);
System.out.print("A=");
int a=input.nextInt();
System.out.print("B=");
int b=input.nextInt();
for(int i=a+1;i<=b;i++)
{
 int c=0;
 for(int j=1;j<=b;j++)
 {
 if(i%j==0)
 c++;
 }
 if(c>2)
 System.out.print(i+" ");
}
}
}