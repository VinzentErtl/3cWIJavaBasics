package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        int[][] playGround = new int[3][3];

        playGround[0][0] = 1;

        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround.length; col++) {
                System.out.println(playGround[row][col] + " ");
            }
            System.out.println();
            
        }
    }
}
