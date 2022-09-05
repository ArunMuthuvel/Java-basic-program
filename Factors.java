class Factors
{
    public static void main(String[]args)
    {
        int num=24;
        int count=0;
        int i=1;
        while (i<=24)
        {
            if (num%i==0)
                {
                  System.out.println("The Factors of 24 is="+i);
                  count++;
                }
                 i++;
        }
    }
}
