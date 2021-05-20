public class simpleDotComTestDrive {
    public static void main(String[] args) {
        simpleDotcom dot=new simpleDotcom();
        int[] locations={2,3,4};
        dot.setLocationCells(locations);
        String userguess="2";
        String result=dot.checkYourself(userguess);
    }
}
