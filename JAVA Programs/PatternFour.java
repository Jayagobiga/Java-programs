import java.util.*;
class PatternFour
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter value");
int n=input.nextInt();
for(int i=1;i<n;i++){
for(int j=1;j<=i;j++){
System.out.print(i);
}
System.out.println();
}
for(int i=n;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print(i+"");
}
System.out.println();
}
}
}
