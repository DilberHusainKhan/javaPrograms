import java.awt.*;
import java.applet.*;
public class house extends Applet
{
Font f1;
public void init(){
f1 = new Font("Arial",Font.BOLD, 30);
setBackground(Color.cyan);
}

public void paint(Graphics g)
{
g.setFont(f1);
g.drawString("My House", 365,60);
g.drawRect(250,250,500,200);
g.drawRect(250,250,200,200);
g.drawRect(300,300,100,150);
g.drawRect(550,320,100,60);
g.drawLine(250,250,355,100);
g.drawLine(355,100,450,250);
g.drawLine(355,100,650,100);
g.drawLine(650,100,750,250);
}
}
/*
<applet code="house.class" height = 1000 width = 1000>
</applet>
*/