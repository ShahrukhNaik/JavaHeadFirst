public class pharseomatic{
    public static void main(String[] args) {
        //make three sets of words to choose..
        String[] wordListOne={"24/7","multi-ier","30,000 foot","B-to-B","win-win","frontend",
            "web-based","pervasive", "smart", "sixsigma","critical-path", "dynamic"};
        String[] wordListTwo={"empowered", "sticky",
            "value-added", "oriented", "centric", "distributed",
            "clustered", "branded","outside-the-box", "positioned",
            "networked", "focused", "leveraged", "aligned",
            "targeted", "shared", "cooperative", "accelerated"};
        String[] wrodListThree={"process", "tippingpoint",
            "solution", "architecture", "core competency",
            "strategy", "mindshare", "portal", "space", "vision",
            "paradigm", "mission"};

        //find out how many words are in each list.
        int oneLength=wordListOne.length;
        int twoLength=wordListTwo.length;
        int threeLength=wrodListThree.length;

        //generate three random numbers..
        int rand1=(int)(Math.random()*oneLength);
        int rand2=(int)(Math.random()*twoLength);
        int rand3=(int)(Math.random()*threeLength);

        //now building pharse...
        String pharse=wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wrodListThree[rand3];

        System.out.println("What we need is a "+pharse);        

    }
}