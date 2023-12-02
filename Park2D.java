import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Park2D {
    public static void main ( String[] args)
    {
        int[] threes = {3, 6, -3, -6};
int i = 0;
while (i < threes.length) {
   threes[i] = threes[i] * 3;
   Syte
   i++;
}
        double[][] array2d = new double[2][];
        // Fill first row with new 3-element array.
        array2d[0]=new double[3];
        array2d[0][0]=80.0;
        array2d[0][1]=70.0;
        array2d[0][2]=75.0;

        // Fill second row with a new 4-element array.
        array2d[1]=new double[4];
        array2d[1][0]=69.0;
        array2d[1][1]=72.0;
        array2d[1][2]=74.0;
        array2d[1][3]=90.0;

        final double MIN_TEMP = 75;
        final double MAX_TEMP = 90;
        for ( int row=0; row <array2d.length;row++)
        {
            for (int col=0;col <array2d[row].length;col++)
            {
                if(array2d[row][col]>=MIN_TEMP && array2d[row][col]<=MAX_TEMP)
                {
                    System.out.println("Go to the park");
                }

            }
        }
/* 
        for (int col = 0; col < array2d[0].length; col++) {
            for (int row = 0; row < array2d.length; row++) {
                if ((array2d[row][col] >= MIN_TEMP) && (array2d[row][col] <= MAX_TEMP)) {
                    System.out.println("Go to the park.");
                }
            }
        }
        */
        
    }
    
}
