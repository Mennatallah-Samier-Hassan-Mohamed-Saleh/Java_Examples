public abstract class Canine implements Comparable<Canine>{
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

    public double getSize(){
        return this.size;
    }

    public abstract void groom();

    public int compareTo(Canine other) {
        int x = (int) (size - other.getSize());
        return -x;
    }
    
}
