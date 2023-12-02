// I worked on the assignment alone, using only course-provided materials.
public class Pond {
    public static void main(String[] args) {
        Frog frogOne = new Frog("Peepo");
        Frog frogTwo = new Frog("Pepe", 10, 15);
        Frog frogThree = new Frog("Peepaw", 4.6, 5);
        Frog frogFour = new Frog("Tidy", 20, 10);

        Fly flyOne =  new Fly(1 , 3);
        Fly flyTwo =  new Fly(6);
        Fly flyThree =  new Fly(2 , 5);

        frogOne.setSpecies("1331 Frogs");
        System.out.println(frogOne);
        frogOne.eat(flyTwo);
        System.out.println(flyTwo);
        frogOne.grow(8);
        frogOne.eat(flyTwo);
        System.out.println(flyTwo);
        System.out.println(frogOne);
        System.out.println(frogFour);
        frogThree.grow(4);
        System.out.println(frogThree);
        System.out.println(frogTwo);

    }
}
