class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        if len(mat)*len(mat[0])!=r*c:
            return mat
        p=[mat[i][j] for i in range(len(mat)) for j in range(len(mat[0]))]
        return [p[i:i+c] for i in range(0,len(p),c)]
