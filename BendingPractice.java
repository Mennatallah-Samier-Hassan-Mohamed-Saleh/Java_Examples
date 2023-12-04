public class BendingPractice {

    public static void main(String[] args){
        WaterBender Katara = new WaterBender("Katara",80,100,true);
        WaterBender Mermaid = new WaterBender("Mermaid Man");
        FireBender Ace = new FireBender("Ace",120,20);
        FireBender Mushu = new FireBender("Mushu");
        EarthBender WhiteBoard = new EarthBender("WhiteBoard",100,80,true);
        System.out.println(Katara);
        System.out.println(Mushu);
        System.out.println(WhiteBoard);
        System.out.println(Ace);
        System.out.println(Mermaid);

        Ace.attack(Mermaid);
        System.out.println("Ace attacking Mermaid");
        System.out.println(Ace);
        System.out.println(Mermaid);

        WhiteBoard.attack(Mermaid);
        System.out.println("WhiteBoard attacking Mermaid");
        System.out.println(WhiteBoard);
        System.out.println(Mermaid);

        System.out.println("Karata healing Mear Maid");
        Katara.heal(Mermaid);
        System.out.println(Katara);
        System.out.println(Mermaid);

        WhiteBoard.buildArmor();
        Mermaid.attack(Mushu);
        System.out.println("Mermaid attacking Mushu");
        System.out.println(Mermaid);
        System.out.println(Mushu);

        Bender[] test = new Bender[2];
        test[0]=WhiteBoard;
        test[1]=Katara;
        Mushu.flameCircle(test);
        System.out.println("Mushu attacking Katara and WhiteBoard");
        System.out.println(Mermaid);
        System.out.println(Mushu);
        System.out.println(Mushu.getFirePoints());
        
        Katara.recover(5);
        System.out.println(Katara);
        System.out.println(Mushu);
        System.out.println(WhiteBoard);
        System.out.println(WhiteBoard.getEarthPoints());
        System.out.println(Katara.getWaterPoints());
        System.out.println(Mushu.getFirePoints());
    }
    
}
