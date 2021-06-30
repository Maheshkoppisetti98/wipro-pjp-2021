class sample{
public static void main(String[] args){
String a=args[0];
char b=a.charAt(0);
if((b>='a' && b<='z') ||(b>='A' && b<='Z') ){
System.out.print("Alphabet");
}
else if(b>='0' && b<='9'){
System.out.print("Digit");
}
else{
System.out.print("Special Character");
}
}
}