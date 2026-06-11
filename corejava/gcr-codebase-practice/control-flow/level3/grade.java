import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int marks_chemistry = input.nextInt();
        int marks_physics = input.nextInt();
        int marks_maths = input.nextInt();
        
        int percentage = (marks_chemistry + marks_physics + marks_maths)/300*100;
        if(percentage >= 80){
            System.out.println("level 4 above agency-normalized standards");
        }
        else if(percentage >= 70 && percentage < 79){
            System.out.println(" level 3 at agency-normalized standards");
        }
        else if(percentage >= 60 && percentage < 69){
            System.out.println("level 2 below but approaching agency-normalized standards");
        }
        else if(percentage   >= 50 && percentage < 59   ){
            System.out.println("level 1 well below agency-normalized standards");
        }
        else if(percentage >= 40 && percentage < 49){
            System.out.println("level 1- too below agency-normalized standards");
        }

        else{
            System.out.println("remedial");
        }
        input.close();
    }
    
}

