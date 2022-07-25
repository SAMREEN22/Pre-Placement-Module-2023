class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int num=1;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int dir=0;
        while(left<=right && top<=bottom){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    res[top][i]=num++;
                }
                top++;;
            }
            if(dir==1){
                for(int i=top;i<=bottom;i++){
                    res[i][right]=num++;
                }
                right--;
            }
            if(dir==2){
                for(int i=right;i>=left;i--){
                    res[bottom][i]=num++;
                }
                bottom--;
            }
            if(dir==3){
                for(int i=bottom;i>=top;i--){
                    res[i][left]=num++;
                }
                left++;
            }
            dir++;
            dir%=4;
        }
        return res;
    }
}
