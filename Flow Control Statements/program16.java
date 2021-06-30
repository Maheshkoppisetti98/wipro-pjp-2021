import java.util.Scanner;
class Sample{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
try{
int b=Integer.parseInt(args[0]);
for(int i=1;i<=b;i++){
for(int j=1;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}
}
catch(Exception e){
System.out.print("Please enter an integer number");
}}}