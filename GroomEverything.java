public class GroomEverything{
    public static void main(String[] args){
        Groomable[] groomer = {
            new Wolf(10.5, 3),
            new Car("Menna", "Spark", 2023)
        };
        for (Groomable g: groomer){
            g.groom();
        }

    }
}