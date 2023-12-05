public class Wolf extends Canine implements Groomable {
   protected int rank;

   public Wolf(double size, int rank) {
       super(size);
       this.rank = rank;
   }

   public int getRank() {
       return rank;
   }


   public void groom() {
       System.out.println("lick");
   }

   public void pay() {
       System.out.println("Grrrr! Warning, don’t try and chase me for payment. I'm a wolf. Run Run Run!");
   }
};