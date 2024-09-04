import java.util.ArrayList;

public class MerkleThread implements Runnable {

public static volatile ArrayList<String> grabbedWords ;
private int iMerkleTreeInputs = 4;




   public void run(){

      Util oUtil = new Util();
      grabbedWords = new ArrayList();

      while(true){

    oUtil.sleepRandomTime();

    String sNewWord = MerkleManager.grabWord();

    if ( sNewWord != null ){
       System.out.println("Merkle grabbed a word");
       grabbedWords.add(sNewWord);
    }

    if ( grabbedWords.size() == iMerkleTreeInputs){

       MerkleManager.merkleRoot = ;

    }


      }


   }




}
