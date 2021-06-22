package second;

import java.awt.Graphics; // program uses class Graphics

import javax.swing.*; // program uses class JApplet

public class Second extends Applet
{

    // draw text on applet’s background

    @Override
    public void paint( Graphics g )
    {
        // call superclass version of method paint
        super.paint( g );
        // draw a String at x-coordinate 25 and y-coordinate 25
        g.drawString( "Welcome to Java Programming!", 25, 25 );
    } // end method paint

    public static void main(String[] args)
    {
        Second obj = new Second();

    }
}

/*
<applet code = "Second.class" width = "300" height = "300">
</applet>
*/
