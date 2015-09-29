public class quiz2
{
    public static void main( String... args )
    {
        int num = 100;
        for (int i = 1; i <= num; i++)
        {
            boolean flag = false;

            if (i % 3 == 0)
            {
                flag = true;
                System.out.print("Fizz");
            }
           else if (i % 5 == 0)
            {
                flag = true;
                System.out.print("Buzz");
            }
            
        else  if( (i % 5 == 0) && (i % 3 == 0) )
            {
                flag = true;
                System.out.print("FizzBuzz");
            }

            

            if (flag == false) 
            System.out.print(i);
            System.out.println();
        }
    }
}
