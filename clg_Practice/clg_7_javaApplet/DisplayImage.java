import java.awt.*;  
import java.applet.*;  
  
  
public class DisplayImage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"sonoo.jpeg");  
  }  
    
  public void paint(Graphics g) {  
    for(int i=0;i<500;i++){  
      g.drawImage(picture, i,10, this);  
  
      try{Thread.sleep(100);}catch(Exception e){}  
    }  
  }   
  }

/* <applet code="DisplayImage.class" width="500" height="1000">  
</applet>
*/