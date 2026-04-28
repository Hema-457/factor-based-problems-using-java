class Main{
 public static void main(String args[])
 {
     int a=220,b=284;
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
     if(sum1==b&&sum2==a)
     {
        System.out.println("ambicable pair");
     }
     else
     System.out.println("not ambicable pair");
 }
}
    
