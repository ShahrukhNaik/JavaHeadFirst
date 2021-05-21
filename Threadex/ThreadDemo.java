
public class ThreadDemo{
    public static void main(String[] args) {
        hi objhi=new hi();
        hello objHello=new hello();

        objhi.run();
        try{Thread.sleep(10);}catch(Exception e){}
        objHello.run();
        
    }
}