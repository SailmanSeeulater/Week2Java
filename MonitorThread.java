public class MonitorThread implements Runnable {

    public void run() {

        while (true) {

            if (MerkleManager.merkleRoot != null) {

                if (MerkleManager.merkleRoot == MerkleManager.userInputMerkleRoot) {
                    System.out.println("You win !" + MerkleManager.merkleRoot);
                    System.exit(0);
                }

                else if (MerkleManager.merkleRoot != MerkleManager.userInputMerkleRoot) {

                   System.out.println("You have Lost !");
                   System.exit(0);

                }
                else if ( MerkleManager.strikes == 3 ){
                    System.out.println("3 Strikes, game over. ");
                    System.exit(0);
                }


            }

            Util2.sleepRandomTime(1000*1);


        }


    }
}