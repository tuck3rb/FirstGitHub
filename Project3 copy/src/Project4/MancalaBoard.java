package Project4;

import java.util.HashMap;

public class MancalaBoard {

    boolean playerOneTurn = true;

    public static void main(String[] args) {

        HashMap boardMap = new HashMap();

        for (int i = 0; i < 14; i++){
            if (i == 6) {
                boardMap.put("Player2", 0);
            }
            else if (i == 13) {
                boardMap.put("Player1", 0);
            }
            else {
                boardMap.put(i, 4);
            }
        }

        public int getScore(int player) {
           if (player == 1) {
               return boardMap.get("Player1");
           }
           else {
               return boardMap.get("Player2");
           }
        }

        Marble[] marbles = new Marble[48];

        for (int i = 0; i < marbles.length; i++){

            int pitNum = 0;

            if (i / 4 == 0) {
                pitNum++;
            }
            marbles[i].setPit(pitNum);

//            set every four marbles to a pit, then increment to the next pit and repeat

        }
        System.out.println(marbles[2].getPit());
        System.out.println(marbles[16].getPit());

    }

}
