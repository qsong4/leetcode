/**
 * Created by songqingyuan on 1/11/17.
 */

/**
 * The perimeter of island is equal to 4*island - 2*connected
 */
public class islandPerimeter {
    public int islandPerimeter(int[][] grid){
        int island = 0;
        int aaa = 0;
        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[i].length;j++){
                if(grid[i][j]==1){
                    island++;

                    if(j<grid[i].length-1){
                        if(grid[i][j+1]==1){
                            aaa++;
                        }
                    }
                    if(i<grid.length-1){
                        if(grid[i+1][j]==1){
                            aaa++;
                        }
                    }

                }


            }
        }
        return 4*island - 2*aaa;
    }
}
