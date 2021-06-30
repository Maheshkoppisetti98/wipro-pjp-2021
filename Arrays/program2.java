class Sample{
public static void main(String args[]){
int[] a=new int[10];
int sum=0;
for(int i=0;i<a.length;i++){
a[i]=Integer.parseInt(args[i]);

}
int max=0,min=a[i];
for(int i=0;i<a.length;i++){
if(a[i]>max){
max=a[i];
}
if(a[i]<min){
min=a[i];
}
}
System.out.print(max+" is Maximun and "+min+" is Minimun number of the array");
}
}