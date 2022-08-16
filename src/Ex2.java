import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {3,2,5,1,4,5};
        int myInt;
        try {
            System.out.println("Enter number: ");
            myInt = sc.nextInt();
            System.out.println(array[myInt]);
        }
        catch (Exception e){
            System.out.println(e.getClass() + "Message" + e.getMessage());
        }
    }
}
