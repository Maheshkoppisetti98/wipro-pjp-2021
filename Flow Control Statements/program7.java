class sample{
public static void main(String args[]){
String a=args[0];
char b=a.charAt(0);
int ascii=b;
int temp;
if(b >= 'a' && b<= 'z') {
	temp = (int) b;
        temp = temp - 32;
        b = (char) temp;
      //b = (char)(32+ascii+'0');
}
else if(b>='A' && b<='Z'){
temp = (int) b;
        temp = temp + 32;
        b = (char) temp;
}
System.out.print(b);
}

}