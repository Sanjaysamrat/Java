import java.util.*;
class odd{
public static void main(String[] args){
Scanner num=new Scanner(System.in);
System.out.print("Enter a number:");
int i=num.nextInt();
//Using Bit AND(&) Operator
if ((i&1)==1) {
System.out.printf("%d is a odd number.",i);
}
else {
System.out.printf("%d is a even number",i);
}
}
}
