/**
 * Created by Joshua on 2017-06-14.
 */
public class Maze {
    /**
     * Recursive Thinking
     * 현재 위치에서 출구까지 가는 경로가 있으려면
     * 1) 현재 위치가 출구이거나 혹은
     * 2) 이웃한 셀들 중 하나에서 현재 위치를 지나지 않고 출구까지 가는 경로가 있거나
     */

    private static int N=8;
    private static int[][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0}
    };

    private static final int PATHWAY_COLOUR = 0;
    private static final int WALL_COLOUR = 1;
    private static final int BLOCKED_COLOUR = 2;
    private static final int PATH_COLOUR = 3;

    public static boolean findMazePath(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N) {
            return false;
        } else if (maze[x][y] != PATHWAY_COLOUR) {
            return false;
        } else if (x == N-1 && y == N-1) {
            maze[x][y] = PATH_COLOUR;
            return true;
        } else {
            maze[x][y] = PATH_COLOUR;
            if (findMazePath(x-1, y) || findMazePath(x, y+1) || findMazePath(x+1, y) || findMazePath(x, y-1)) {
                return true;
            }
            maze[x][y] = BLOCKED_COLOUR;
            return false;
        }
    }

    public static void main(String[] args) {
        printMaze();
        findMazePath(0, 0);
        printMaze();
    }

    private static void printMaze() {
        System.out.println("------------------------start");
        for(int i = 0; i < N; i++) {
            System.out.print("[");
            for(int j = 0; j < N; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.print("]\n");
        }
        System.out.println("------------------------end");
    }
}
