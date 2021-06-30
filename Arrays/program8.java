import java.util.Scanner;
class Sample{
public static void main(String args[]){
Scanner scn=new Scanner(System.in);
System.out.print("Enter no. of elements you want in array:");
int nn = scn.nextInt();
int n[] = new int[nn];
System.out.println("Enter all the elements:");
		for (int i = 0; i < n.length; i++)
		{
			n[i] = scn.nextInt();
		}
int sum = 0;
outer:
for (int i = 0; i < n.length; i++) {
    if (n[i] == 6) {
        for (int j = i + 1; j < n.length; j++) {
            if (n[j] == 7) {
                i = j;
                continue outer;
            }
        }
    }
    sum += n[i];
}

System.out.println(sum); // 2
}
}