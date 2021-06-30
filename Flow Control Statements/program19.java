class Sample{ 
    public static void main(String args[]) 
    {       
	int c=0;
        for(int i=5;i<100;i++){
		if(c==5)
                break;
		else if(i%2==0 && i%3==0 && i%5==0){
			System.out.print(i+" ");
			c+=1;
		}
	}
    }
}
