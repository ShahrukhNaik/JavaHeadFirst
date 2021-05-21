public class hi extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hii");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
