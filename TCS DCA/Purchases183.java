import java.util.Scanner;

// A man invests a certain amount on monthly basis in a bank. He withdraws that money once in 4 years which is a leap year, to make a big scale purchase .He starts next investment exactly 183 days after the purchase .

// Initially, he makes a note of his purchase date
// Given the date(dd) and month(mm) of his purchase. The task here is to help him find the date and month to start his investment.

// His next investment date is calculated from the next day of his purchase.
// Display the date as on 183rd day.

public class Purchases183{
    public static void main(String[] args) {
        int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};
        String [] month = {"january","february","march","april","may","june","july",
                            "august","september","october","november","december"}; 
        Scanner sc  = new Scanner(System.in);
        int dd = sc.nextInt();
        String mm = sc.next();

        int td= dd;
        int count =0;
        int tm = 0;
        boolean flag = false;
        for(int i=0;i<12;i++){
            if(mm.equalsIgnoreCase(month[i])){
                tm = i; 
                flag = true;
            }
        }
        if(flag){
        if(tm ==0 ){
            td = day[0]-td;
            count = td+183;
        }else{
            td = day[tm]-td;
            count = day[tm-1]+Math.abs(td);
        }
            System.out.println(count);
            int resultDate = count/12;
            String mont = month[count%12];
            System.err.println("Date "+resultDate+" "+mont);
        }else{
            System.out.println("Invalid Input");
        }
    }
}