class Sample{
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
int s=0;
int n=a;
int r;
while(n!=0){
	r=n%10;
	s+=r;
	n=n/10;
}
System.out.print(s);
}
}