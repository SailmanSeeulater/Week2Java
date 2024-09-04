public class MerkleManager {

    public static volatile String userInput;
    public static String userInputMerkleRoot;
    public static String merkleRoot = null;
    public static int strikes = 0;



   public void manage() {

       MerkleThread merkle1 = new MerkleThread();
       RogueThread rogue1 = new RogueThread();
       MonitorThread monitor1 = new MonitorThread();
       Thread merkle = new Thread(merkle1);
       Thread rogue = new Thread(rogue1);
       Thread monitor = new Thread(monitor1);

       merkle.start();
       rogue.start();
       monitor.start();

     // Util sUtil = new Util();


       while (true) {

           System.out.println("Enter a word");
      // userInput = sUtil.promptUser("Enter a word");



       }
   }


   public static synchronized String grabWord(){

           String temp = userInput;
           userInput = null;

           return temp;

          }














       }











