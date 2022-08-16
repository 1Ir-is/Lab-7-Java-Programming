import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            if (a == 1) throw new FirstException();
            else if(a==2) throw new SecondException();
            else if(a==3) throw new ThirdException();
            else{
                System.out.println("No Exception");
            }
        }catch (Exception e) {
            System.out.println(e.getClass() +" Message:"+e.getMessage());
        }
    }
}
class FirstException extends  Exception{

}
class SecondException extends Exception{
}
class ThirdException extends Exception{

}
