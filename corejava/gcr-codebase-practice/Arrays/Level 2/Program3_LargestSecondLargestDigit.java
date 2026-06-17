import java.util.*;
public class Program3_LargestSecondLargestDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int maxdigit =10;
        int[] arr = new int[maxdigit];

        int index =0;
        while(n>0){
            int temp =n%10;
            arr[index]+=temp;
           
            index++;
            if(index==maxdigit){
                break;
            }
            n=n/10;

        }
        int largestnumber =0;
        int secondlargestnumber=0;
        for(int i=0; i<index; i++){
            int currentdigit = arr[i];
            if(currentdigit>largestnumber){
                secondlargestnumber=largestnumber;
                largestnumber=currentdigit;
            }
             else if (currentdigit > secondlargestnumber && currentdigit != largestnumber) {
                secondlargestnumber = currentdigit;
            }
        }
        System.out.println("Largest digit: " + largestnumber);
        System.out.println("Second largest digit: " + secondlargestnumber);
    
        input.close();
    }
}
