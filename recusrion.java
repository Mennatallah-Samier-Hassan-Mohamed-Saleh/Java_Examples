public class recusrion {
    public static int gcd(int x, int y){
        if ( y == 0){ //base case
            return x;
        }
        else //recursive call
        {
            int reminder = x%y;
            return gcd(y,reminder);

        }
    }
    public static void main(String[] args)
    {
        int x = 1482;
        int y = 819;
        System.out.println("Result: " + gcd(x,y));
    }
}
