import java.util.Scanner;

/*
 * There are ‘N’ number of companies participating in the drive. The commencement timings of the interviews of ‘N’ companies is given as start[] array elements and their respective end timings are given as end[] array elements. The task here is to find the maximum number of interviews a single candidate can attend keeping the following points in mind:
    All the interview timings are in ‘p.m’.
    • The candidate cannot attend an interview if its timings overlap with the timings of another company’s interview. Say, an interview starts at 1 p.m. and ends at 4 p.m., he cannot attend the interview of another company between 1 p.m. to 4 p.m.
    Only one candidate can be scheduled in the given time slot Assume, the input for end time(end[]) is always sorted in ascending order.

 * 
 */

public class Interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int[] start = new int[size];
        int[] end = new int[size];
        for(int i=0;i<size;i++){
            start[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            end[i] = sc.nextInt();
        }
         int count =1;
          int result = end[0];
          for(int k=0;k<size-1;k++){
            if(result<=start[k+1]){
                count++;
                result = end[k+1];
            }
          }
        System.out.println(count);
    }
}
