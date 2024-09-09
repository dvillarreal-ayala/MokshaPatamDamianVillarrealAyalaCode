import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: Damian Villarreal-Ayala
 * for AT Computer Science: Adventures in Algorithms
 *
 */

public class MokshaPatam {

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int snakesAndLadders(int boardsize, int[][] snakes, int[][] ladders)
    {
        int[] paths = new int[boardsize];
        return -1;
    }

    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        Queue<Integer> queue = new LinkedList<>();
        //Starting position
        queue.add(0);

        boolean[] visited = new boolean[boardsize];

        int numMoves = 0;

        //Continue running until path to the end is finished
        while(!queue.isEmpty())
        {
            int queueSize = queue.size();

            while(queueSize > 0)
            {
                queueSize = queueSize - 1;
                int currentSpace = queue.remove();

                if(currentSpace == boardsize - 1)
                {
                    return numMoves;
                }
            }
        }



        return 0;
    }
}
