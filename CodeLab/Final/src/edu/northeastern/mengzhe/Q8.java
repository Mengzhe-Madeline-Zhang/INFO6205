package edu.northeastern.mengzhe;

public class Q8 {
    private static int h;
    private static int w;

    public static int numIslands(char[][] grid){
        h = grid.length;
        if (h == 0)
            return 0;
        w = grid[0].length;
        boolean[][] visited = new boolean[h][w];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    getResult(grid, visited, i, j);
                    ++count;
                }
            }
        }
        return count;
    }

    public static void getResult(char[][] grid, boolean[][] visited, int x, int y) {
        if (x < 0 || x >= h || y < 0 || y >= w || visited[x][y] || grid[x][y] != '1')
            return;
        visited[x][y] = true;
        getResult(grid, visited, x + 1, y);
        getResult(grid, visited, x - 1, y);
        getResult(grid, visited, x, y + 1);
        getResult(grid, visited, x, y - 1);

    }

    public static void main(String[] args) {
        char[][] grid1={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        char[][] grid2={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};

        System.out.println(numIslands(grid1));
        System.out.println(numIslands(grid2));
    }
}
/**
 * Run Result

 1
 3

 *
 * ***/