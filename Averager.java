public class Averager {
    public static void main( String[] args)
    {
        double[] weekHighs = {80,70,75,69,72,74,90};
        double highSum=0;
        for(double tempValue: weekHighs)
        {
            highSum=highSum+tempValue;
        }

        double averageHighs = highSum / weekHighs.length;
        System.out.println("Average is: " + averageHighs +" High sum is: "+highSum); 

        double sum=0;
        for( String name:args)
        {
            sum=sum+Double.parseDouble(name);
        }
        double averageSum=(args.length>0)?(sum/args.length) :0;
        System.out.println("Average is: " + averageSum); 
    }
    
}
