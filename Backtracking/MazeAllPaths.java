import java.nio.file.Path;

//Return the path required to reach from point (0,0) to (2,2) in a Maze with an obstacle at (1,1) by going in 
// all possible directions i.e up, down, left, right
public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        path("", board, 0, 0);
    }

    static void path(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            path(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            path(p + 'R', maze, r, c + 1);
        }

        if (r > 0) {
            path(p + 'U', maze, r - 1, c);
        }

        if (c > 0) {
            path(p + 'L', maze, r, c - 1);
        }

        maze[r][c] = true;
    }
}
