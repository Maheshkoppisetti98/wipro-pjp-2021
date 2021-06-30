class Sample{
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
int n=a;
int r,b=0;
while(n!=0){
	r=n%10;
	b=b*10+r;
	n=n/10;
}
System.out.print(b);
}
}