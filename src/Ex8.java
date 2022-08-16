import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8 {
    static Scanner sc = new Scanner(System.in);
    static int[] myArray = {3, 2 ,4, 6 , 4};
    public static void main(String [] args){
        try{
            firstMethod();
        }catch (Exception e){
            System.out.println(e.getClass() + " "+ e.getMessage());
        }
    }
    public static void firstMethod(){
        try{
            secondMethod();
        }catch (InputMismatchException e){

        }
    }

    private static void secondMethod() {
        System.out.println("Enter your option:");
        int myInt = sc.nextInt();
        System.out.println(myArray[myInt]);
    }
}