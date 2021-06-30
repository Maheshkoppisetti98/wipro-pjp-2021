class sample{

    public static void main(String[] args) {

        //int num = Integer.parseInt(args[0]);
        boolean flag = false;
	for(int j=10;j<=100;j++){
	flag=false;
        for(int i = 2; i <= j/2; ++i)
        {
            if(j% i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(j);
        }
    }
}