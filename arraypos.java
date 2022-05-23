import java.util.*;
class arraypos{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
boolean flag=false;
int pos=-1;
System.out.print("Enter the array size:");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter the array elements:");
for (int i=0;i<size;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter the key to find position:");
int key=sc.nextInt();
for (int i=0;i<size;i++){
 if(arr[i]==key){
 flag=true;
 pos=i;
 break;
 }
}
if (flag==true){
System.out.println("Position of the key is:"+(pos+1));
//System.out.printf("position of the key is: %d",pos);
}
else {
System.out.println("Position is not found, Incorrect key");
}
}
}
