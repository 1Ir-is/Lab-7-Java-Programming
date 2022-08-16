public class Ex1 {
    public static void main(String[] args){
        try{
            throw new C();
        }catch(A a){
            System.out.println(a.getMessages());
        }
    }
}
class A extends Throwable{
    public String getMessages(){
        return "A Exception";
    }
}
class B extends A{
    public String getMessages(){
        return "B Exception";
    }

}
class C extends B{
    public String getMessages(){
        return "C Exception";
    }

}