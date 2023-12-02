public class Craps {
    private Die die1, die2;
    private int point;

    public Craps(){
        die1 = new Die();
        die2 = new Die();
    }

    private int toss(){
        int total=die1.roll() + die2.roll();
        System.out.println("Die One: " + die1.getFaceValue()
                            + ", Die Two: " + die2.getFaceValue());
        return total;
    }

    public void go(){
        point=toss();
        System.out.println("Point: " + point);
        if ((point == 7) || (point == 11)){
             System.out.println("Winner!");
        }
        else if((point == 2) || (point == 3) || (point == 12)){
             System.out.println("Losser!");
        }
        else
        {
            System.out.println("Entering Stage 2");
            Stage2();
        }
    }

    public void Stage2() {
        boolean endStage = false;

        while (! endStage) {
            int total = toss();
            System.out.println("Total: " + total);
            if (total == point){
                System.out.println("Winner!");
                endStage = true;
            }
            else if (total == 7){
                System.out.println("Losser!");
                endStage = true;
            } 
        }
    }

    public static void main ( String[] args){
        Craps test = new Craps();
        test.go();
    }
    
}
