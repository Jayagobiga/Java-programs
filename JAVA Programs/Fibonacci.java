import java.util.*;
public class Fibonacci{
public static void main(String [] args){
Scanner input=new Scanner(System.in);
System.out.print("enter n value:");
int n=input.nextInt();
int a=0;
int b=1;
System.out.println("Fibonacci Series:");
for(int i=0;i<n;i++){
System.out.print(a+" ");
int next=a+b;
a=b;
b=next;
}
}
}
