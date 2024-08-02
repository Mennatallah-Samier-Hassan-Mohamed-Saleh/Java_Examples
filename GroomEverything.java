public class GroomEverything {
    public static void main(String[] args) {
        Groomable[] groomer = {
                new Wolf(17.01, 3),
                new Poodle("riche", 99, "Lux brand","rich brand"),
                new Car("Yuhina", "Spark",2037)
        };

        for (Groomable g : groomer) {  //groom everything
            g.groom();
            //g.pay();
        }
    }
}