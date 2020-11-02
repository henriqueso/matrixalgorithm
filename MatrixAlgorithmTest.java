public class MatrixAlgorithmTest {
    
    public static void main(String[] args) {
        testMatrix_3_3();
        testMatrix_4_4();
        testMatrix_4_3();
        testMatrix_10_10();
        testGetLeftValue();
        testGetUpperLeftValue();
        testGetDownLeftValue();
    }

    public static void testMatrix_3_3() {
        int[][] nums = {
            {1, 3, 3},
            {2, 1, 4},
            {0, 6, 4}
        };

        int v = new MatrixAlgorithm().maxPathSum(nums);

        System.out.println("Expected 12. Value: " + v);
    }

    public static void testMatrix_4_4() {
        int[][] nums = {
            {1, 3, 1, 5},
            {2, 2, 4, 1},
            {5, 0, 2, 3},
            {0, 6, 1, 2}
        };

        int v = new MatrixAlgorithm().maxPathSum(nums);

        System.out.println("Expected 16. Value: " + v);
    }

    public static void testMatrix_4_3() {
        int[][] nums = {
            {1, 3, 1},
            {2, 2, 4},
            {5, 0, 2},
            {0, 6, 1}
        };

        int v = new MatrixAlgorithm().maxPathSum(nums);

        System.out.println("Expected 13. Value: " + v);
    }

    public static void testMatrix_10_10() {
        int[][] nums = {
            {1, 3, 1, 5, 2, 2, 4, 1, 0, 2},
            {2, 2, 4, 1, 1, 5, 2, 2, 4, 1},
            {5, 0, 2, 3, 2, 2, 4, 1, 1, 5},
            {3, 2, 4, 1, 0, 5, 2, 2, 2, 0},
            {6, 3, 1, 5, 1, 4, 8, 1, 3, 1},
            {1, 4, 2, 4, 0, 3, 9, 2, 4, 0},
            {0, 1, 3, 3, 1, 2, 7, 1, 6, 1},
            {0, 3, 4, 6, 0, 1, 5, 2, 1, 0},
            {7, 6, 0, 1, 1, 5, 3, 1, 0, 1},
            {0, 6, 1, 2, 0, 6, 1, 2, 2, 4}
        };

        int v = new MatrixAlgorithm().maxPathSum(nums);

        System.out.println("Expected 45. Value: " + v);
    }

    public static void testGetLeftValue() {
        int[][] nums = {
            {1, 2},
            {3, 4}
        };

        int v = new MatrixAlgorithm().getLeftValue(nums, 1, 1);

        System.out.println("Expected 3. Value: " + v);
    }

    public static void testGetUpperLeftValue() {
        int[][] nums = {
            {1, 2},
            {3, 4}
        };

        int v = new MatrixAlgorithm().getUpperLeftValue(nums, 1, 1);

        System.out.println("Expected 1. Value: " + v);
    }

    public static void testGetDownLeftValue() {
        int[][] nums = {
            {5, 6},
            {7, 8}
        };

        int v = new MatrixAlgorithm().getDownLeftValue(nums, 0, 1);

        System.out.println("Expected 7. Value: " + v);
    }
}
