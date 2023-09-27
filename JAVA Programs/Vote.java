import java.util.*;
public class Vote
{
public static void main(String [] args)
{
Scanner input=new Scanner(System.in);
System.out.print("enter the age:");
int n=input.nextInt();
int m=18-n;
if(n>=18)
System.out.println("Eligible to vote");
else
System.out.println("You are eligible to vote after " +m+ " years");
}
}




