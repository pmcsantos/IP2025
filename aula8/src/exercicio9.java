void main() {
    int[][] matrix = {{1,2,3,-2},{-1,3,3,2},{0,3,2,1}};
    Position[] array = MatrixHelper.findAll(matrix,2);
    IO.println(Arrays.toString(array));
}