class Main{
    public static void main(String args[])
    {
        int n=12;
        int rev=0,temp=n;
        while(temp>0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        int square1=n*n;
        int square2=rev*rev;
        int revsquare=0;
        while(square2>0)
        {
            revsquare=revsquare*10+square2%10;
            square2/=10;
        }
        if(square1==revsquare)
        System.out.println("Adam Number");
        else
        System.out.println("Not Adam Number");
    }
}
