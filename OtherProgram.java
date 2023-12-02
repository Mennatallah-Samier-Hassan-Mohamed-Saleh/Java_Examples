public class OtherProgram {
    public static void main(String[] args)
    {
        String[] lullabies = {"Wheels on the bus", "Twinkle, Twinkle Little star",
        "Itsy Bitsy Spider","Swing Low Sweet Chariot","Amazing Graze"};
        //System.out.println(ArraySearch.ArraySearchfun(lullabies,"Wheels on the bus"));
        //System.out.println(ArraySearch.ArraySearchfun(lullabies,"Menna"));
         System.out.println(Overloading.ArraySearch(lullabies,"Wheels on the bus"));

        int[] weekHighs = {80, 70, 75, 69, 72, 74, 90};
        //System.out.println(ArraySearch.searchIntArray(90, weekHighs));
        System.out.println(Overloading.ArraySearch(weekHighs, 90));
        System.out.println("90"); //calls println(String)
        System.out.println(90); //calls println(int)
        System.out.println(90L); //calls println(long)
        System.out.println(90.0F); //calls println(float)
        System.out.println(90.0); //calls println(double)
        System.out.println('9'); //calls println(char)
        System.out.println(true); //calls println(boolean)
        int[] array={5,4,3,2,1};
        changeArray2(array);
    }
    public static void changeArray1( int[] array) {
        for(int i: array) {
            i = 1;
            System.out.println(array[0]);
            System.out.println(array[1]);
            System.out.println(array[2]);
            System.out.println(array[3]);
            System.out.println(array[4]);
        }
    }
    
    public static void changeArray2( int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = 1;
            System.out.println(array[0]);
            System.out.println(array[1]);
            System.out.println(array[2]);
            System.out.println(array[3]);
            System.out.println(array[4]);
        }
    }
    
    
}
