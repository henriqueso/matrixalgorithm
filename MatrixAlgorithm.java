public class MatrixAlgorithm {
    
    public int maxPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int[][] dp = new int[grid.length][grid[0].length];

        int leftValue, downLeftValue, upperLeftValue, max = 0;

        for (int column = 0; column < dp[0].length; column++) {
            for (int row = 0; row < dp.length; row++) {

                leftValue = getLeftValue(dp, row, column);
                downLeftValue = getDownLeftValue(dp, row, column);
                upperLeftValue = getUpperLeftValue(dp, row, column);

                if ( isFirstColumn(column) ) {
                    dp[row][column] = grid[row][column];

                } else {
                    
                    if ( isFirstRow(row) ) {
                        dp[row][column] = grid[row][column] 
                                        + Math.max(leftValue, downLeftValue);

                    } else if ( isLastRow(row, grid) ) {
                        dp[row][column] = grid[row][column] 
                                        + Math.max(leftValue, upperLeftValue);
                    
                    } else {
                        dp[row][column] = grid[row][column] 
                                        + Math.max(leftValue, Math.max(downLeftValue, upperLeftValue));

                    }

                    if ( isLastColumn(column, grid) ) {
                        max = Math.max(max, dp[row][column]);
                    }
                }
            }
        }

        return max;
    }

    private Boolean isFirstRow(int row) {
        return row == 0;
    }

    private Boolean isFirstColumn(int column) {
        return column == 0;
    }

    private Boolean isLastRow(int row, int[][] grid) {
        return row == grid.length - 1;
    }

    private Boolean isLastColumn(int column, int[][] grid) {
        return column == grid[0].length - 1;
    }

    public int getLeftValue(int[][] grid, int row, int column) {
        if (column == 0) return 0;
        return grid[row][column - 1];
    }

    public int getDownLeftValue(int[][] grid, int row, int column) {
        if (column == 0 || row == grid.length -1) return 0;
        return grid[row + 1][column - 1];
    }

    public int getUpperLeftValue(int[][] grid, int row, int column) {
        if (column == 0 || row == 0) return 0;
        return grid[row - 1][column - 1];
    }
}
