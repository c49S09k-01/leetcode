package com.csk.leetcode.array;

//自己写的 没问题

/**
 * Created by 24866 on 2017/5/9.
 * Input:
 nums =
 [[1,2],
 [3,4]]
 r = 1, c = 4
 Output:
 [[1,2,3,4]]
 Explanation:
 The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.

 Input:
 nums =
 [[1,2],
 [3,4]]
 r = 2, c = 4
 Output:
 [[1,2],
 [3,4]]
 Explanation:
 There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.

 Note:
 1. The height and width of the given matrix is in range [1, 100].
 2. The given r and c are all positive.
 */
public class MatrixReshape {
    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        int[][] temp = new MatrixReshape().matrixReshape(nums,1,4);
        for(int i = 0;i <temp.length;i++) {
            for (int j = 0; j < temp[i].length; j++)
                System.out.print(temp[i][j] + "   ");
            System.out.println();
        }
    }
    public int[][] matrixReshape(int[][] nums, int r, int c) {
         if(r * c != nums.length * nums[0].length)
            return nums;
        int m = 0,n = 0;
         int[][] temp = new int[r][c];
         for(int i = 0;i < r;i++)
             for(int j = 0;j < c;j++){
                 if(n == nums[0].length){
                     m++;
                     n = 0;
                 }
                 temp[i][j] = nums[m][n++];
             }
         return temp;
    }

    //别人写的 很精髓 比我少一个 for 循环
    public int[][] matrixReshape_(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r*c != n*m) return nums;
        int[][] res = new int[r][c];
        for (int i=0;i<r*c;i++)
            //精髓的一批
            res[i/c][i%c] = nums[i/m][i%m];
        return res;
    }
}
