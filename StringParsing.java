public class StringParsing {
    public static void main(String []args) {
        String chant = "Java Is The Best!";
        String[] tokens = chant.split(" ");
        for (String x : tokens) {
            System.out.println(x);
        }
    }
    
}
