class Solution {
    int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    maxArea=Math.max(maxArea, dfs(grid,i,j));
            }
        }
        return maxArea;
    }
    private int dfs(int[][] grid, int row, int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0) return 0;
        grid[row][col]=0;
        int sum=1;
        for(int d=0;d<4;d++){
            int next_x=row+dir[d][0];
            int next_y=col+dir[d][1];
            sum+=dfs(grid,next_x,next_y);
        }
        return sum;
    }
}
