public abstract class Canine {
    // Not public or private
    // can only be accessed by its sub classes and any other class within this class's package
    // Private memebers are not inherited
    // public violates encapsulation
    protected double size;
    public Canine(double size) {
        this.size = size;
    }
    public void bark(){
        System.out.println("Woof Woof");
    }

    public abstract void groom();
    
}
