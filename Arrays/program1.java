class Sample{
public static void main(String args[]){
int[] a=new int[10];
int sum=0;
for(int i=0;i<a.length;i++){
a[i]=Integer.parseInt(args[i]);
sum+=a[i];
}
int avg=sum/a.length;
System.out.print(sum+" is sum and "+avg+" is average of the array");
}
}