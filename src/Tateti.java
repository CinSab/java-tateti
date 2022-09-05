public class Tateti {
    private String[][] board = new String [3][3];

    String[][] showTateti() {
        System.out.println("");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf("|");
                System.out.printf(board[i][j] + "");
            }
            System.out.print("|");
            System.out.println("");
        }
        return board;
    }
    boolean isFull(){
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[0].length; j++) {
                if(this.board[i][j] == "-"){
                    return true;
                }
            }
        }
        return false;
    }
    void createTateti(){
        for(int i =0; i < board.length; i++){
            for(int j =0; j < board.length; j++){
                board[i][j] = "-";
            }
        }
    }

    public boolean putToken(int x, int y, String token){
            if(board[x][y] == "-"){
                board[x][y] = token;
                return(true);
            }else{
                return(false);
            }
    }

    boolean winner(){
        if((board[0][0] != "-") && (board[0][0] == board[0][1]) && (board[0][1] == board[0][2])){
            return(true);
        }
        if((board[1][0] != "-") &&(board[1][0] == board[1][1]) && (board[1][1] == board[1][2])){
            return(true);
        }
        if((board[2][0] != "-") &&(board[2][0] == board[2][1]) && (board[2][1] == board[2][2])){
            return(true);
        }
        if((board[0][0] != "-") &&(board[0][0] == board[1][0]) && (board[1][0] == board[2][0])){
            return(true);
        }
        if((board[0][1] != "-") &&(board[0][1] == board[1][1]) && (board[0][1] == board[2][1])){
            return(true);
        }
        if((board[0][2] != "-") &&(board[0][2] == board[1][2]) && (board[1][2] == board[2][2])){
            return(true);
        }
        if((board[0][0] != "-") &&(board[0][0] == board[1][1]) && (board[1][1] == board[2][2])){
            return(true);
        }
        if((board[2][0] != "-") &&(board[2][0] == board[1][1]) && (board[1][1] == board[0][2])){
            return(true);
        }
        return(false);
    }


}