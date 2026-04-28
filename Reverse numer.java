class Main{
    public static void main(String[] args)
    {
        int num=1234,rev=0,dig;
        while(num!=0)
        {
            dig=num%10;
            rev=rev*10+dig;
            num/=10;
        }
        System.out.println(rev);
    }
}
