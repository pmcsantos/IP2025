class MatrixHelper {

    static Position findFirst(int[][] matrix, int find) {
        for(int i=0;i < matrix.length; i++)
            for (int j=0; j<matrix[i].length; j++)
                if (matrix[i][j] == find)
                    return new Position(i,j);
        return null;
    }

    static Position findLast(int[][] matrix, int find) {
        for(int i= matrix.length-1; i >=0; i--)
            for (int j=matrix[i].length; j>=0; j--)
                if (matrix[i][j] == find)
                    return new Position(i,j);
        return null;
    }

    static int count(int[][] matrix, int find) {
        int c = 0;
        for(int i=0;i < matrix.length; i++)
            for (int j=0; j<matrix[i].length; j++)
                if (matrix[i][j] == find)
                    c++;
        return c;
    }

    static Position[] findAll(int[][] matrix, int find) {
        int size = count(matrix, find);
        Position[] array = new Position[size];
        if (array.length == 0) {
            return array;
        } else {
            int index = 0;
            for (int i = 0; i< matrix.length; i++)
                for (int j=0; j<matrix[i].length; j++)
                    if (matrix[i][j] == find) {
                        array[index] = new Position(i,j);
                        index++;
                    }
                }
        return array;
    }

}
