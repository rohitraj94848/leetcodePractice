class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Set<Character>> row = new HashMap<>();
        HashMap<Integer,Set<Character>> col = new HashMap<>();
        HashMap<String,Set<Character>> square = new HashMap<>();

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){

                if(board[i][j] == '.'){
                    continue;
                }

                
                if (!row.containsKey(i)) {
                    row.put(i, new HashSet<Character>());
                }
                if(!col.containsKey(j)){
                    col.put(j,new HashSet<Character>());
                }
                String str = (i/3) + "-" + (j/3);
                if(!square.containsKey(str)){
                    square.put(str,new HashSet<Character>());
                }

                if(row.get(i).contains(board[i][j]) || 
                    col.get(j).contains(board[i][j]) ||
                    square.get(str).contains(board[i][j])){
                        return false;
                    }
                
                row.get(i).add(board[i][j]);
                col.get(j).add(board[i][j]);
                square.get(str).add(board[i][j]);

            }
        }
        return true;
    }
}