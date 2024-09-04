public class RogueThread implements Runnable {



    public void run(){

   Util Util2 = new Util();

   while(true){

       Util2.sleepRandomTime();
       String aNewWord = RogueThread.grabWord();

       if (aNewWord != null){
        MerkleManager.strikes++;
        System.out.println("STRIKE !");
        System.out.println("Rogue grabbed a word");

       }

   }

    }






}
