public class Ex6 {
    public static void main(String [] args){
        try {
            Ex6 test = new Ex6();
        } catch (InterruptedException e) {
            System.out.println("Got interrupted...");
        }
    }
    public Ex6() throws InterruptedException{
        System.out.println("Preparing an Object");
        Thread.sleep(10000);
        System.out.println("Object is ready");
    }
}
