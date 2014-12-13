//Complete the code in the class BlockTower to draw a tower of blocks
//that looks like the one at the link below.  Each block has a width of 40
//and a height of 30. There are three rows.
//The upper left-hand corner of the bottom row is at (20, 70)

//Create a custom color for the topmost color where red = 125, green=125, blue = 255.
//For all the other colors, use predefined colors.
//The colors from top to bottom are: custom color, RED, PINK, BLUE, MAGENTA, CYAN,

//For the draft, draw the first rectangle in the bottom row.

//For the final, draw the whole tower.

public class BlockTower
{
   public static void main(String[] args)
   {
       //bottom row
       Rectangle boxBL = new Rectangle(20, 70, 40, 30);
       boxBL.setColor(Color.BLUE);
       boxBL.fill();
       
       Rectangle boxBM = new Rectangle(60, 70, 40, 30);
       boxBM.setColor(Color.MAGENTA);
       boxBM.fill();
       
       Rectangle boxBR = new Rectangle(100, 70, 40, 30);
       boxBR.setColor(Color.CYAN);
       boxBR.fill();
       
       Rectangle boxML = new Rectangle(40, 40, 40, 30);
       boxML.setColor(Color.RED);
       boxML.fill();
       
       Rectangle boxMR = new Rectangle(80, 40, 40, 30);
       boxMR.setColor(Color.PINK);
       boxMR.fill();
       
       Rectangle boxT = new Rectangle(60, 10, 40, 30);
       boxT.setColor(new Color(125, 125, 255));
       boxT.fill();
   }
}
