public class TestPond {
    public static void main(String[] args) {

        Fly flyOne =  new Fly(1 , 19);
        flyOne.grow(19);
        System.out.println(flyOne);

        Frog frogOne = new Frog("Peepo",10,5);
        frogOne.grow(4);
        System.out.println(frogOne);


        Frog frogOne2 = new Frog("Peepo",25,10);
        frogOne2.grow(10);
        System.out.println(frogOne2);


    }
    
}
