public class Dog1 extends Canine{
    protected String name;

    public Dog1(String name, double size){
        //super used to refer to amameber of the super class
        //super() call to super class's constructor
        // must be the first line of the child's constructor
        super(size);
        this.name = name;
    }

    public void fetch(){
        System.out.println("Run");
        System.out.println("Clinch");
        System.out.println("Return");
    }
    public void groom(){}

    public String toString(){
        return ("Name: " + name + ", Size: " + size);
    }

    public boolean equals(Object o) {
        if (!(o instanceof Dog1)) {
            return false;
        }
        Dog1 doggy = (Dog1) o;
        return ((doggy.size == size) && (doggy.name.equals(name)));
     }

    public static void main(String[] args)
    {
        Dog1 spot = new Dog1("Spot", 9.6);
        spot.bark();
        Dog1 dog1 = new Dog1("Spot", 9.600001);
        Dog1 dog2 = new Dog1("Spot", 9.6);
        System.out.println(dog1.equals(dog2));
    
    }
    
}
