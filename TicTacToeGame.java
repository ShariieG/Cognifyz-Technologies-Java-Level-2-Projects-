import java.util.Scanner;

public class TicTacToeGame
{
    public static void main(String [] args){
        String playerX, playerY;
        int playCol, playRow, playagain;
        boolean win=false, boardstatus = false;
        Scanner input = new Scanner(System.in);

        String [] [] arrayBoard = {
                {"00","01","02"},
                {"10","11","12"},
                {"20","21","22"}
            };

        displayBoard(arrayBoard);

        System.out.println("Player 1. Enter two alphabets to represent your move: eg(Aa, Bb, Cc, Dd, etc) ");
        playerX= input.next();

        System.out.println("Player 2. Enter two alphabets to represent your move: eg(Aa, Bb, Cc, Dd, etc) ");
        playerY= input.next();

        String [] players = new String[2];
        players[0] =playerX;
        players[1] = playerY;

        do{
            for(int i=0 ; i<players.length ; i++){
                System.out.println("It is your turn: " +players[i]);

                do{
                    System.out.println("Choose a column: (0, 1, or 2)");
                    playCol= input.nextInt();
                }while(playCol!=0 && playCol!=1 && playCol!=2);

                do{
                    System.out.println("Choose a row: (0, 1, or 2) ");
                    playRow= input.nextInt();
                } while(playRow!=0 && playRow!=1 && playRow!=2);

                boardstatus= boardStatus(arrayBoard,  playerX,  playerY);
                if(boardstatus == true){
                    System.out.println("The board is full. Thank you for playing");
                    break;
                }

                if(arrayBoard[playCol][playRow].equalsIgnoreCase(playerX) 
                || arrayBoard[playCol][playRow].equalsIgnoreCase(playerY)){
                    System.out.println("Postion already taken. Try again");

                    System.out.println("Choose a column: (0, 1, or 2)");
                    playCol= input.nextInt();

                    System.out.println("Choose a row: (0, 1, or 2) ");
                    playRow= input.nextInt();
                }

                arrayBoard[playCol][playRow] = players[i];
                displayBoard(arrayBoard);

                win=Win(arrayBoard);
                if(win==true){
                    System.out.println(players[i] + " You have won!!");
                    break;
                }

                boardstatus= boardStatus(arrayBoard,  playerX,  playerY);
                if(boardstatus == true){
                    System.out.println("The board is full. Thank you for playing");
                    break;
                }

            }

        }while(win==false && boardstatus == false);

        do{
            System.out.println("Do you wanna play again: 1.Yes 2. No");
            playagain= input.nextInt();
        }while(playagain != 1 && playagain != 2);
        playAgain(playagain);

    }

    public static void playAgain(int answer){
        if(answer == 1){
            main(new String []{});
        }
        else{
            System.out.println("Thank you for playing again. I hope you enjoyed ...");
        }
    }

    public static boolean boardStatus(String [][] arrayBoard, String playerX, String playerY){

        for(int i=0 ; i<arrayBoard.length ; i++){
            for(int j=0 ; j<arrayBoard[i].length ; j++){

                if(arrayBoard[i][j]!= playerX && arrayBoard[i][j]!= playerY){
                    return false;
                }
            }
        }

        return true;
    }

    public static void displayBoard(String [] []arrayBoard){
        int counter = 1;
        for(int i=0 ; i<arrayBoard.length ; i++){
            for(int j=0 ; j < arrayBoard[i].length ; j++){
                System.out.print(arrayBoard[i][j]);
                if(counter==3){
                    System.out.println();
                    counter=0;
                }
                counter++;
            }

        }
    }

    public static boolean Win(String [][]arrayBoard){

        if(arrayBoard[0][0].equalsIgnoreCase( arrayBoard[0][1]) && 
        arrayBoard[0][0].equalsIgnoreCase(arrayBoard[0][2]) &&
        arrayBoard[0][1].equalsIgnoreCase(arrayBoard[0][2])){
            return true;
        }
        else if(arrayBoard[1][0].equalsIgnoreCase(arrayBoard[1][1]) && 
        arrayBoard[1][0].equalsIgnoreCase(arrayBoard[1][2]) &&
        arrayBoard[1][1].equalsIgnoreCase(arrayBoard[1][2])){
            return true;
        }
        else if(arrayBoard[2][0].equalsIgnoreCase(arrayBoard[2][1]) && 
        arrayBoard[2][0].equalsIgnoreCase(arrayBoard[2][2])&&
        arrayBoard[2][1].equalsIgnoreCase(arrayBoard[2][2])){
            return true;
        }
        else if(arrayBoard[0][0].equalsIgnoreCase(arrayBoard[1][0]) && 
        arrayBoard[0][0].equalsIgnoreCase(arrayBoard[2][0]) &&
        arrayBoard[1][0].equalsIgnoreCase(arrayBoard[2][0])){
            return true;
        }
        else if(arrayBoard[0][1].equalsIgnoreCase(arrayBoard[1][1]) && 
        arrayBoard[0][1].equalsIgnoreCase(arrayBoard[2][1]) &&
        arrayBoard[0][1].equalsIgnoreCase(arrayBoard[2][1])){
            return true;
        }
        else if(arrayBoard[0][2].equalsIgnoreCase(arrayBoard[1][2])&& 
        arrayBoard[0][2].equalsIgnoreCase(arrayBoard[2][2]) &&
        arrayBoard[1][2].equalsIgnoreCase(arrayBoard[2][2])){
            return true;
        }
        else if(arrayBoard[0][0].equalsIgnoreCase(arrayBoard[1][1]) && 
        arrayBoard[0][0].equalsIgnoreCase(arrayBoard[2][2]) &&
        arrayBoard[1][1].equalsIgnoreCase(arrayBoard[2][2])){
            return true;
        }
        else if(arrayBoard[0][2].equalsIgnoreCase(arrayBoard[1][1]) && 
        arrayBoard[0][2].equalsIgnoreCase(arrayBoard[2][0]) &&
        arrayBoard[1][1].equalsIgnoreCase(arrayBoard[2][0])){
            return true;
        }
        else{
            return false;
        }
    }
}