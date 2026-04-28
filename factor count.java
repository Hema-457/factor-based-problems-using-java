class Main{
    public static void main(String args[])
    {
        int n=230,i,count=0;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            count+=1;
        }
        System.out.println(count);
        
    }
}
