package Stack_and_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Rotten_Oranges {

    class Solution {
        public int orangesRotting(int[][] grid) {
            if (grid == null || grid.length == 0) return 0;
            int rows = grid.length;
            int cols = grid[0].length;
            Queue<int[]> queue = new LinkedList<>();
            int count_fresh = 0;
            // Put the position of all rotten oranges in queue
            // count the number of fresh oranges
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == 2) {
                        queue.offer(new int[]{i, j});
                    } else if (grid[i][j] == 1) {
                        count_fresh++;
                    }
                }
            }
            // if count of fresh oranges is zero --> return 0
            if (count_fresh == 0) return 0;
            int count = 0;
            int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            // bfs starting from initially rotten oranges
            while (!queue.isEmpty()) {
                ++count;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int[] point = queue.poll();
                    for (int[] dir : dirs) {
                        int x = point[0] + dir[0];
                        int y = point[1] + dir[1];
                        // if x or y is out of bound
                        // or the orange at (x , y) is already rotten
                        // or the cell at (x , y) is empty
                        // we do nothing
                        if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2) continue;
                        // mark the orange at (x , y) as rotten
                        grid[x][y] = 2;
                        // put the new rotten orange at (x , y) in queue
                        queue.offer(new int[]{x, y});
                        // decrease the count of fresh oranges by 1
                        count_fresh--;
                    }
                }
            }
            return count_fresh == 0 ? count - 1 : -1;
        }
    }
}

// Output -
/*
Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
*/

// Algorithm -
/*
1. We start with a queue of all the rotten oranges.
2. We also keep a count of fresh oranges.
3. We bfs starting from initially rotten oranges and if we find a fresh orange, we increment the count of fresh oranges by
4. We also keep a variable to count how many minutes have passed.
5. We will return -1 if the fresh oranges are not rotten at the end.
*/

// Time & Space Complexity -
/*
Time Complexity: O ( n x n ) x 4

Reason: Worst-case – We will be making each fresh orange rotten in the grid and for each rotten orange will check in 4 directions

Space Complexity: O ( n x n )

Reason: worst-case –  If all oranges are Rotten, we will end up pushing all rotten oranges into the Queue data structure
*/

// New Method -

class Solution {
    public static int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;
        //Put the position of all rotten oranges in queue
        //count the number of fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
                if (grid[i][j] != 0) {
                    count_fresh++;
                }
            }
        }

        if (count_fresh == 0) return 0;
        int countMin = 0, cnt = 0;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        // bfs starting from initially rotten oranges
        while (!queue.isEmpty()) {
            int size = queue.size();
            cnt += size;
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];

                    if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 ||
                            grid[x][y] == 2) continue;

                    grid[x][y] = 2;
                    queue.offer(new int[]{x, y});
                }
            }
            if (queue.size() != 0) {
                countMin++;
            }
        }
        return count_fresh == cnt ? countMin : -1;
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int rotting = orangesRotting(arr);
        System.out.println("Minimum Number of Minutes Required " + rotting);
    }
}

// Algorithm -
/*
1. We start with a queue of all the rotten oranges.
2. We keep a count of fresh oranges.
3. We bfs through the rotten oranges and mark the adjacent oranges as rotten.
4. We increment the count of minutes by 1.
5. We keep doing this until there are no rotten oranges left in the queue.
6. If count of fresh oranges is zero, we return the minutes. Else, we return -1.
 */