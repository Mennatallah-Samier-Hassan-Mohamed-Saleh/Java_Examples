public class Powers {
    public static void main(String[] args)
    {
        final int LIMIT = 40;
        for ( int base =2; base <=5; base ++){
            System.out.println("Power of "+ base + " under " +  LIMIT);
            for (int pow = 1; pow <= LIMIT ; pow *=base ){
                System.out.println(pow);
            }
            System.out.println();

        }
    }
    
}
