import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class myen extends Applet implements ActionListener
{
Button B;

public void init()
{
	setLayout(null);
	B = new Button ("Click");
	B.setBounds(250,250,50,30);
	add(B);
	B.addActionListener(this);	
// addActionListener is a method, this keyword is referd the object you have uses

}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource() == B)
	{
		B.setLabel("Clicked");
		setBackground(Color.cyan);
	}
 
}

}

/*
<applet code ="myen.class" height = 500 width = 500>
</applet>
*/	