import java.util.Scanner;

public class xox {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-----XOX Oyununa Hoş Geldiniz!-----");
        System.out.println("2 oyuncu sıra sıra hangi boşluğu doldurmak istediğini yazıcak.");
        System.out.println("Oyuncu arada boşluk olacak şekilde doldurmak istediği kutucuğu önce satır ardından sütun olarak girmelidir.");
        System.out.println("1-Start");
        System.out.println("2-Exit");
        int start = input.nextInt();

        while(start == 1) {
            System.out.println("Oyun başladı!");

            char[][] gameTable = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
            };

            int player1Index = 0;
            int player2Index = 0;

            for (int i = 0; i < 9; i++) {
                if (i % 2 == 0) {
                    System.out.println("Sıra 1. oyuncuda!");
                    System.out.println("Satır(1-3): ");
                    int player1Row = input.nextInt();
                    System.out.println("Sütun(1-3): ");
                    int player1Column = input.nextInt();
                    int row1 = player1Row - 1;
                    int column1 = player1Column - 1;

                    if (gameTable[row1][column1] == ' ') {
                        gameTable[row1][column1] = 'X';

                        if (gameTable[0][0] == 'X' && gameTable[0][1] == 'X' && gameTable[0][2] == 'X') {
                            System.out.println("Oyun bitti! 1. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[1][0] == 'X' && gameTable[1][1] == 'X' && gameTable[1][2] == 'X') {
                            System.out.println("Oyun bitti! 1. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[2][0] == 'X' && gameTable[2][1] == 'X' && gameTable[2][2] == 'X') {
                            System.out.println("Oyun bitti! 1. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[0][0] == 'X' && gameTable[1][0] == 'X' && gameTable[2][0] == 'X') {
                            System.out.println("Oyun bitti! 1. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[0][1] == 'X' && gameTable[1][1] == 'X' && gameTable[2][1] == 'X') {
                            System.out.println("Oyun bitti! 1. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[0][2] == 'X' && gameTable[1][2] == 'X' && gameTable[2][2] == 'X') {
                            System.out.println("Oyun bitti! 1. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[0][0] == 'X' && gameTable[1][1] == 'X' && gameTable[2][2] == 'X') {
                            System.out.println("Oyun bitti! 1. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[0][2] == 'X' && gameTable[1][1] == 'X' && gameTable[2][0] == 'X') {
                            System.out.println("Oyun bitti! 1. oyuncu kazandı!");
                            break;
                        }


                        System.out.println();
                        printBoard(gameTable);
                        System.out.println();
                    }
                    else if (gameTable[row1][column1] != ' ') {
                        System.out.println("Bu kutucuk dolu! Tekrar dene!");
                        i--;
                    }

                }
                else if (i % 2 == 1) {
                    System.out.println("Sıra 2. oyuncuda!");
                    System.out.println("Satır(1-3): ");
                    int player2Row = input.nextInt();
                    System.out.println("Sütun(1-3): ");
                    int player2Column = input.nextInt();
                    int row2 = player2Row - 1;
                    int column2 = player2Column - 1;

                    if (gameTable[row2][column2] == ' ') {
                        gameTable[row2][column2] = 'O';

                        if (gameTable[0][0] == 'O' && gameTable[0][1] == 'O' && gameTable[0][2] == 'O') {
                            System.out.println("Oyun bitti! 2. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[1][0] == 'O' && gameTable[1][1] == 'O' && gameTable[1][2] == 'O') {
                            System.out.println("Oyun bitti! 2. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[2][0] == 'O' && gameTable[2][1] == 'O' && gameTable[2][2] == 'O') {
                            System.out.println("Oyun bitti! 2. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[0][0] == 'X' && gameTable[1][0] == 'X' && gameTable[2][0] == 'O') {
                            System.out.println("Oyun bitti! 2. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[0][1] == 'O' && gameTable[1][1] == 'O' && gameTable[2][1] == 'O') {
                            System.out.println("Oyun bitti! 2. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[0][2] == 'O' && gameTable[1][2] == 'O' && gameTable[2][2] == 'O') {
                            System.out.println("Oyun bitti! 2. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[0][0] == 'O' && gameTable[1][1] == 'O' && gameTable[2][2] == 'O') {
                            System.out.println("Oyun bitti! 2. oyuncu kazandı!");
                            break;
                        }
                        else if (gameTable[0][2] == 'O' && gameTable[1][1] == 'O' && gameTable[2][0] == 'O') {
                            System.out.println("Oyun bitti! 2. oyuncu kazandı!");
                            break;
                        }

                        System.out.println();
                        printBoard(gameTable);
                        System.out.println();
                    }
                    else if (gameTable[row2][column2] != ' ') {
                        System.out.println("Bu kutucuk dolu! Tekrar dene!");
                        i--;
                    }
                }
            }

            System.out.println();
            System.out.println("1-Tekrar Oyna");
            System.out.println("2-Çıkış");
            start = input.nextInt();

        }


    }

    public static void printBoard(char[][] gameTable) {

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(gameTable[r][c]);
                if (c < 2) System.out.print(" | ");
            }
            System.out.println();
            if (r < 2) System.out.println("---------");
        }
    } 
}
