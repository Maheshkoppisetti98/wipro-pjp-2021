class sample{
public static void main(String args[]){
String s=args[0];
String s1=args[1];
char a=s.charAt(0);
char b=s1.charAt(0);
if(a<b){
System.out.print(a+","+b);
}
else{
System.out.print(b+","+a);
}
}
}