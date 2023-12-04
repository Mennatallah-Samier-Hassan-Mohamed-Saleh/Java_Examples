import java.util.Arrays;
public class Wolf extends Canine implements Groomable, Comparable<Wolf>{
    protected int rank;

    public Wolf(double size , int rank){
        super(size);
        this.rank=rank;
    }

    public int getRank(){
        return rank;
    }

    public void bark(){ //3 times the default Canine bark
        for (int i = 1 ; i<=3; i++ ){
            super.bark();
        }
    }
    public void groom(){
            System.out.println("Grom from wolf");
    }

    public int compareTo(Wolf anotherWolf){
        return -(rank - anotherWolf.rank);

    }

    public String toString(){
        return "Rank : " + rank + " Size: " + size;
    }
    public static void main(String [] args){
        Wolf alpha = new Wolf(17.1, 1);
        Wolf another = new Wolf(20,10);
        System.out.println(another.compareTo(alpha));
        Wolf[] test= new Wolf [2];
        test[0]=alpha;
        test[1] = another;
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        alpha.bark();
    }
    
}
