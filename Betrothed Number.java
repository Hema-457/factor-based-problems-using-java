class Main{
 public static void main(String args[])
 {
     int a=48,b=75;
     int sum1=0,sum2=0;
     for(int i=1;i<=a/2;i++)
     {
         if(a%i==0)
         {
             sum1+=i;
         }
     }
      for(int i=1;i<=a/2;i++)
     {
         if(a%i==0)
         {
             sum2+=i;
         }
     }
     if(sum1==b+1&&sum2==a+1)
     {
        System.out.println("Betrothed Number");
     }
     else
     System.out.println("Not Betrothed Number ");
 }
}
