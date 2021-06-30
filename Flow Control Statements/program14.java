import java.util.Scanner;
class Sample{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
try{
int b=Integer.parseInt(args[0]);
boolean flag = false;
	
	
        for(int i = 2; i <= b/2; ++i)
        {
            if(b% i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(b+" is prime number");
        
	else{
System.out.print(b+" is not a prime number");
}
}
catch(Exception e){
System.out.print("Please enter an integer number");
}
}
}