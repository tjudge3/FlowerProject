//Project 6 - tjudge
import java.awt.*;
import edu.princeton.cs.introcs.StdDraw;

public class Flower {

    /**
     *
     * @param x x coordinate of the center of this ellipse
     * @param y y coordinate of the center of this ellipse
     * @param halfWidth half the width of this ellipse
     * @param halfHeight half the height of this ellipse
     * @param count depth of the recursion, initial call passes 0
     */
    private static void flower(Color[] palette, double x, double y, double halfWidth, double halfHeight, int count){
        if(count==5){
            return;
        }
        count++;
        halfWidth/=4;
        halfHeight/=4;
        int index = (int)(Math.random()*palette.length);
        StdDraw.setPenColor(palette[index]);
        StdDraw.filledEllipse(x, y, halfWidth*4, halfHeight*4);

        flower(palette,x+halfWidth,y,halfWidth,halfHeight,count);
        flower(palette,x-halfWidth,y,halfWidth,halfHeight,count);
        flower(palette,x,y+halfWidth,halfWidth,halfHeight,count);
        flower(palette,x,y-halfWidth,halfWidth,halfHeight,count);
        flower(palette,x,y,halfWidth,halfHeight,count);
    }


    public static void main(String args[]) {
        //
        // Create a palette of colors
        //
        Color[] palette = { StdDraw.BLUE, StdDraw.BLUE, StdDraw.GREEN,
                StdDraw.BLUE, StdDraw.GRAY, StdDraw.GREEN,
                StdDraw.BLUE, StdDraw.BLUE, StdDraw.GREEN,
                StdDraw.BLUE, StdDraw.GREEN, StdDraw.GREEN, StdDraw.GREEN };
        //
        // Modify the palette so each color is somewhat transparent
        //   This allows the colors below to bleed through the colors
        //   on top.
        //
  /*      for (int i=0; i < palette.length; ++i) {
            palette[i] = Transparency..transparentColor(palette[i], 70);
        }*/

        //
        // Kick off the recursion
        // Center is at (0.5, 0.5), half-width .3, half-height .5, depth is 0
        //
        flower(palette, .8, .6, .9, .2, 0);
    }

}
