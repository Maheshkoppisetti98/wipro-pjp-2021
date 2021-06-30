class sample{
public static void main(String args[]){
String a=args[0];
char b=a.charAt(0);
if(b=='R'){
System.out.print("Red");
}
else if(b=='B'){
System.out.print("Blue");
}
else if(b=='G'){
System.out.print("Green");
}
else if(b=='O'){
System.out.print("Orange");
}
else if(b=='Y'){
System.out.print("Yellow");
}
else if(b=='W'){
System.out.print("White");
}
else{
System.out.print("Invalid Code");
}
}
}