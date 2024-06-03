import java.util.*;
class Purchase{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int dd = sc.nextInt();sc.nextLine();
        String month = sc.nextLine();
        getDate(dd,month);
    }

    public static void getDate(int dd, String mm){
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] month = {"January","February","March","April","May","June","July","August",
            "September","October","November","December"};
        
        int count = 183;
        int curr_mm =0;
        for(int i=0;i<12;i++){
            if(mm==month[i])
                curr_mm=i;
        }
        int curr_dd = dd;
        while(true){
            if(count>0 && curr_dd<= days[curr_mm]){
                count -=1;
                curr_dd +=1;
            }
            if(count ==0)
                break;
             curr_mm = (curr_mm+1)%12;
                curr_dd = 1;

            }
        System.out.println(curr_dd + " " +month[curr_mm]);
    }
}