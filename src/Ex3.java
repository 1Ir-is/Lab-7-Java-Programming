import java.io.IOException;
public class Ex3 {
    public static void main(String[] args) {
        try{
            if (true)  throw new B();
            throw new IOException();

        }catch(B b){

        }catch (A a){

        }catch (NullPointerException e){

        }catch (IOException e){

        }
    }
}

