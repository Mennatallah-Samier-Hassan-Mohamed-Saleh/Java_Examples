public class Test {
    public static void main( String[] args)
    {
        int numMonths = 10;
        int age =25;
        double speed=10;
        //age += numMonths;
        System.out.println(age);
        for ( int i=1;i<=numMonths;i=i+1)
        {

            System.out.println("Hi");
            System.out.println(i);
            System.out.println(age);
            age += 1;
            if (age <= 12)
            {
                speed += 1;
            }
            if (age >= 30)
            {
                if (speed >5)
                {
                    speed -= 1;
                }
                
            }
            
        }
System.out.println(age);
System.out.println(speed);

    }
    
}
