//Return the path required to reach from point A to B in a Maze by going down, right and diagonal as well
public class MazeDiagonalPath {
    public static void main(String[] args) {
        path("", 3, 3);
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'V', r - 1, c);
        }

        if (c > 1) {
            path(p + 'H', r, c - 1);
        }

        if (r > 1 && c > 1) {
            path(p + 'D', r - 1, c - 1);
        }
    }
}
