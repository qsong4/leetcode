package Medium;

/**
 * Created by songqingyuan on 5/7/17.
 */
public class updateBoard {
    public char[][] updateBoard(char[][] board, int[] click) {
        if(board[click[0]][click[1]]=='M'){
            board[click[0]][click[1]]='X';
        }
        else{
            int count = numM(board, click);

            if(count>0){
                board[click[0]][click[1]]=(char)(count + '0');
            }
            else{

                board[click[0]][click[1]]='B';
                for(int i=click[0]-1;i<=click[0]+1;i++){
                    for(int j=click[1]-1;j<=click[1]+1;j++){
                        if(i>=0&&i<board.length&&j>=0&&j<board[0].length){
                            if(board[i][j]=='E') updateBoard(board, new int[] {i, j});
                        }
                    }
                }
            }
        }
        return board;
    }
    public int numM(char[][] board, int[] click){
        int count = 0;
        for(int i=click[0]-1;i<=click[0]+1;i++){
            for(int j=click[1]-1;j<=click[1]+1;j++){
                if(i>=0&&i<board.length&&j>=0&&j<board[0].length){
                    if(board[i][j]=='M') count++;
                }
            }
        }
        return count;
    }
}
