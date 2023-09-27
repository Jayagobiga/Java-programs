import java.util.*;
public class SimpleInterest{
public static void main(String [] args){
Scanner input=new Scanner(System.in);
System.out.print("enter the principe amount:");
int p=input.nextInt();
System.out.print("enter the no of years:");
int n=input.nextInt();
System.out.print("Is customer senior citizen(y/n):");
char s=input.next().charAt(0);
int r=10;
int q=12;
int interest;
if(s=='y'){
interest=p*n*q/100;
}
else{
interest=p*n*r/100;
}
System.out.println("Interest:" +interest);
}
}
