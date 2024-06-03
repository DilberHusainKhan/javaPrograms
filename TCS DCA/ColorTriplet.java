import java.util.Scanner;

/*
 * Given a string str which consists of only 3 letters representing the color,(H) Hue, (S) Saturation, (L) 
 * Lightness, called HSL colors. The task is to count the occurrence of ordered triplet “H, S, L” in a 
 * given string and give this count as the output.
 */
public class ColorTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next().toUpperCase();
        sc.close();
        System.out.println(colorTriplet(color));
    }    
    public static int colorTriplet(String color){
        // char[] ch = color.toCharArray();
        int result = 0;
        int hue_coutn =0;
        int light_count =0;
        int len = color.length();

        for(int i=0;i<len;i++){
            if(color.charAt(i)=='L'){
                light_count++;
            }
        }
        for(int i=0;i<len;i++){
            if(color.charAt(i)=='L')
                light_count--;
            if(color.charAt(i)=='H')
                hue_coutn++;
            if(color.charAt(i)=='S')
                result +=hue_coutn*light_count; 
        }
        return result;
    }
}
