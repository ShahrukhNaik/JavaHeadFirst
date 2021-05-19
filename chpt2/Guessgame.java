public class Guessgame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1=new Player();
        p2=new Player();
        p3=new Player();

        int guessp1=0;
        int guessp2=0;
        int guessp3=0;

        boolean p1isRight=false;
        boolean p2isRight=false;
        boolean p3isRight=false;

        int targetno=(int) (Math.random()*10);
        System.out.println("Im thinking of a number between 0 and 9");
        
        while(true){

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1=p1.number;
            System.out.println("Player one guessed "+guessp1);
            guessp2=p2.number;
            System.out.println("Player one guessed "+guessp2);
            guessp3=p3.number;
            System.out.println("Player one guessed "+guessp3);

            if(guessp1==targetno){
                p1isRight=true;
            }
            if(guessp2==targetno){
                p2isRight=true;
            }
            if(guessp3==targetno){
                p3isRight=true;
            }

            if(p1isRight||p2isRight||p3isRight){
                System.out.println("We have a Winner");
                System.out.println("Player one got it right? "+p1isRight);
                System.out.println("Player two got it right? "+p2isRight);
                System.out.println("Player three got it right? "+p3isRight);
                System.out.println("Game is over.");
                break;//game over,so break out of the loop
            }else{
                //we must keep going because bcuz nobody will got it right!
                System.out.println("Players will have to try again.");
            }//end if/else
        }//end loop
    }//end mehtod.
}//end class.
