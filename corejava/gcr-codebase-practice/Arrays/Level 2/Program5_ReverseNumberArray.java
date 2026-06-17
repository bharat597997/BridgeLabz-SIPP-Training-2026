import java.util.*;
public class Program5_ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp =n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        int[] arr = new int[count];
        int index=0;
        while(temp>0){
            int lastdigit = temp%10;
            arr[index]+=lastdigit;
            index++;
            temp=temp/10;

        }
        System.out.println(Arrays.toString(arr));
        input.close();
        
        
    }
}