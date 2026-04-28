class Main{
public static void main (String[] args) 
    {
        int n=20;
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n % i == 0)
            sum+=i;
        }
        if(sum==n)
        System.out.println("Perfect Number");
        else if(sum>n)
        System.out.println("Abundant Number");
        else
        System.out.println("Deficient Number");
    }
}
