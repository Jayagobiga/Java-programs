import java.util.*;
class special
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String n=s.nextLine();
int len=n.length();
char a[]=new char[len];
int k=0;
for(int i=0;i<len;i++)
{
a[i]=n.charAt(i);
if(a[i]>=65 && a[i]<=90||a[i]>=97 && a[i]<=122||a[i]>=48 && a[i]<=57)
{
}
else
{
k++;
System.out.println(a[i]);
}
}
System.out.println("NUMBER OF SPECIAL CHARACTERS="+k);
}
}