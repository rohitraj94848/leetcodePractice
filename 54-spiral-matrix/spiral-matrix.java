class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;


        while(startRow <= endRow && startCol <= endCol)
        {
            for(int i = startCol ; i <= endCol && startRow <= endRow && startCol <= endCol ; i++){
                result.add(matrix[startRow][i]);
            }
            startRow++;
            for(int j = startRow ; j <= endRow && startRow <= endRow && startCol <= endCol; j++){
                result.add(matrix[j][endCol]);
            }
            endCol--;

            for(int i = endCol ; i >= startCol && startRow <= endRow && startCol <= endCol; i--){
                result.add(matrix[endRow][i]);
            }
            endRow--;

            for(int j = endRow ; j >= startRow && startRow <= endRow && startCol <= endCol; j--){
                result.add(matrix[j][startCol]);
            }
            startCol++;

        }
     return result;
    }
}