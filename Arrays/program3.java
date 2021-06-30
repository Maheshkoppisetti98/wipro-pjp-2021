class Sample{
public static void main(String args[]){
int[] a=new int[10];
for(int i=0;i<10;i++){
a[i]=Integer.parseInt(args[i]);
}
int s=Integer.parseInt(args[10]);
int f=0;
for(int i=0;i<10;i++){
if(a[i]==s){
System.out.print(i);
f=1;
}
break;
}
if(f==0){
System.out.print(-1);
}
}
}
