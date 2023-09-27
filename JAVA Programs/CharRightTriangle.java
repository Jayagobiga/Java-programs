import java.util.*;
class CharRightTriangle
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter the character to be printed:");
char c=input.next().charAt(0);
System.out.println("Max number of time printed:");
int n=input.nextInt();
for(int i=1;i<=n;i++)
{
 for(int j=1;j<=i;j++)
 {
 System.out.print(c);
 }
 System.out.println();
}
}
}