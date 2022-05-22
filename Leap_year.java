import java.util.*;
class leap_year1{
public static void main(String[] args)
{
Scanner num=new Scanner(System.in);
System.out.print("Enter a number:");
int i=num.nextInt();
//using ternary operation
String str=((i%4==0 && i%100!=0) || i%400==0)?"leap year":"not a leap year";
System.out.println(str);
}
}
