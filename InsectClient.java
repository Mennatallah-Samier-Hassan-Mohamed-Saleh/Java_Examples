public class InsectClient {
    public static void main( String args [])
    {
        System.out.println(Insect.produceRandomFact());
        Insect bug1 = new Insect(13, 31, 0);
        System.out.println(bug1.getWeight());
        System.out.println(bug1.getX());
        bug1.setX(-133);
        System.out.println(bug1.getX());
        bug1.setX(200);
        System.out.println(bug1.getX());
        System.out.println(bug1.getY());
        System.out.println(bug1.getPobulation());

        Insect bug2=new Insect(50);
        System.out.println(bug2.getWeight());
        System.out.println(bug2.getX());
        System.out.println(bug2.getY());
        System.out.println(bug2.getPobulation());

        Insect bug3=new Insect(100);
        System.out.println(bug3.getWeight());
        System.out.println(bug3.getX());
        System.out.println(bug3.getY());
        System.out.println(bug3.getPobulation());

        Insect bug4=new Insect(100);
        System.out.println(bug4.toString());
        System.out.println(bug4);
        System.out.println(bug4.getPobulation());


    }
    
}
