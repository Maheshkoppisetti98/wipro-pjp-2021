class Example{
public static void main(String args[]){
if(args.length>1){
for(int i=0;i<args.length;i++){
System.out.print(args[i]);
if(i!=args.length-1){
System.out.print(",");
}
}
}
else{
System.out.print("No values");
}
}
}
