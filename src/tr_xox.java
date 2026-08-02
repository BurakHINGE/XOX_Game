import java.util.Scanner;

public class tr_xox {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("-----XOX Oyununa Hoş Geldiniz!-----");
            System.out.println("Oyuncu doldurmak istediği kutucuğu önce satır ardından sütun olarak girmelidir.");
            System.out.println("1-Bilgisayara Karşı\n2-Çok Oyunculu\n3-Çıkış");
            int choice = input.nextInt();

            while(choice == 1) {
                System.out.println("Zorluk seviyesi seçiniz\n1-Kolay\n2-Orta\n3-Zor");
                int difficultyChoice = input.nextInt();

                System.out.println("Oyun başladı!");

                char[][] gameTable = {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
                };

                printBoard(gameTable);

                int player1Index = 0;
                int player2Index = 0;

                if (difficultyChoice == 1) {
                    
                    for (int i = 0; i < 9; i++) {
                        if (i % 2 == 0) {
                            System.out.println("Sıra oyuncuda!");
                            System.out.println("Satır(1-3): ");
                            int playerRow = input.nextInt();
                            System.out.println("Sütun(1-3)");
                            int playerColumn = input.nextInt();
                            int row1 = playerRow - 1;
                            int column1 = playerColumn - 1;

                            if (gameTable[row1][column1] == ' ') {
                                gameTable[row1][column1] = 'X';

                                if (gameTable[0][0] == 'X' && gameTable[0][1] == 'X' && gameTable[0][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[1][0] == 'X' && gameTable[1][1] == 'X' && gameTable[1][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[2][0] == 'X' && gameTable[2][1] == 'X' && gameTable[2][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][0] == 'X' && gameTable[1][0] == 'X' && gameTable[2][0] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][1] == 'X' && gameTable[1][1] == 'X' && gameTable[2][1] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][2] == 'X' && gameTable[1][2] == 'X' && gameTable[2][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][0] == 'X' && gameTable[1][1] == 'X' && gameTable[2][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][2] == 'X' && gameTable[1][1] == 'X' && gameTable[2][0] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (i == 9) {
                                    System.out.println("Berabere!");
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
                            System.out.println("Sıra bilgisayarda!");
        
                            int botRow = (int)(Math.random() * 3);
                            int botColumn = (int)(Math.random() * 3);
                            
                            while (true) {
                                if (gameTable[botRow][botColumn] == 'O' || gameTable[botRow][botColumn] == 'X') {
                                    botRow = (int)(Math.random() * 3);
                                    botColumn = (int)(Math.random() * 3);
                                    continue;
                                }
                                else {
                                    gameTable[botRow][botColumn] = 'O';
                                    break;
                                }
                            }
        
                            if (gameTable[0][0] == 'O' && gameTable[0][1] == 'O' && gameTable[0][2] == 'O') {
                                System.out.println("Oyun bitti! Bilgisayar kazandı!");
                                break;
                            }
                            else if (gameTable[1][0] == 'O' && gameTable[1][1] == 'O' && gameTable[1][2] == 'O') {
                                System.out.println("Oyun bitti! Bilgisayar kazandı!");
                                break;
                            }
                            else if (gameTable[2][0] == 'O' && gameTable[2][1] == 'O' && gameTable[2][2] == 'O') {
                                System.out.println("Oyun bitti! Bilgisayar kazandı!");
                                break;
                            }
                            else if (gameTable[0][0] == 'X' && gameTable[1][0] == 'X' && gameTable[2][0] == 'O') {
                                System.out.println("Oyun bitti! Bilgisayar kazandı!");
                                break;
                            }
                            else if (gameTable[0][1] == 'O' && gameTable[1][1] == 'O' && gameTable[2][1] == 'O') {
                                System.out.println("Oyun bitti! Bilgisayar kazandı!");
                                break;
                            }
                            else if (gameTable[0][2] == 'O' && gameTable[1][2] == 'O' && gameTable[2][2] == 'O') {
                                System.out.println("Oyun bitti! Bilgisayar kazandı!");
                                break;
                            }
                            else if (gameTable[0][0] == 'O' && gameTable[1][1] == 'O' && gameTable[2][2] == 'O') {
                                System.out.println("Oyun bitti! Bilgisayar kazandı!");
                                break;
                            }
                            else if (gameTable[0][2] == 'O' && gameTable[1][1] == 'O' && gameTable[2][0] == 'O') {
                                System.out.println("Oyun bitti! Bilgisayar kazandı!");
                                break;
                            }
                            else if (i == 9) {
                                System.out.println("Berabere!");
                            }
        
                            System.out.println();
                            printBoard(gameTable);
                            System.out.println();
                        }
                    }
                }
                else if (difficultyChoice == 2) {

                    for (int i = 0; i < 9; i++) {
                        if (i % 2 == 0) {
                            System.out.println("Sıra oyuncuda!");
                            System.out.println("Satır(1-3): ");
                            int playerRow = input.nextInt();
                            System.out.println("Sütun(1-3)");
                            int playerColumn = input.nextInt();
                            int row1 = playerRow - 1;
                            int column1 = playerColumn - 1;

                            if (gameTable[row1][column1] == ' ') {
                                gameTable[row1][column1] = 'X';

                                if (gameTable[0][0] == 'X' && gameTable[0][1] == 'X' && gameTable[0][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[1][0] == 'X' && gameTable[1][1] == 'X' && gameTable[1][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[2][0] == 'X' && gameTable[2][1] == 'X' && gameTable[2][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][0] == 'X' && gameTable[1][0] == 'X' && gameTable[2][0] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][1] == 'X' && gameTable[1][1] == 'X' && gameTable[2][1] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][2] == 'X' && gameTable[1][2] == 'X' && gameTable[2][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][0] == 'X' && gameTable[1][1] == 'X' && gameTable[2][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][2] == 'X' && gameTable[1][1] == 'X' && gameTable[2][0] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (i == 9) {
                                    System.out.println("Berabere!");
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

                            System.out.println("Sıra bilgisayarda!");
                            boolean botMoved = false;

                            if (winingMoveExist(gameTable, 'O', 'O')) {
                                System.out.println();
                                printBoard(gameTable);
                                System.out.println();
                                System.out.println("Oyun bitti! Bilgisayar kazandı!");
                                break;
                            }
                            else if (winingMoveExist(gameTable, 'X', 'O')) {
                                botMoved = true;
                            }

                            if (!botMoved) {
                                int botRow = (int)(Math.random() * 3);
                                int botColumn = (int)(Math.random() * 3);
                                
                                while (true) {
                                    if (gameTable[botRow][botColumn] == 'O' || gameTable[botRow][botColumn] == 'X') {
                                        botRow = (int)(Math.random() * 3);
                                        botColumn = (int)(Math.random() * 3);
                                        continue;
                                    } else {
                                        gameTable[botRow][botColumn] = 'O';
                                        break;
                                    }
                                }
                            }
                            System.out.println();
                            printBoard(gameTable);
                            System.out.println();
                        }
                    }  
                }
                else if (difficultyChoice == 3) {

                    for (int i = 0; i < 9; i++) {
                        if (i % 2 == 0) {
                            System.out.println("Sıra oyuncuda!");
                            System.out.println("Satır(1-3): ");
                            int playerRow = input.nextInt();
                            System.out.println("Sütun(1-3)");
                            int playerColumn = input.nextInt();
                            int row1 = playerRow - 1;
                            int column1 = playerColumn - 1;

                            if (gameTable[row1][column1] == ' ') {
                                gameTable[row1][column1] = 'X';

                                if (gameTable[0][0] == 'X' && gameTable[0][1] == 'X' && gameTable[0][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[1][0] == 'X' && gameTable[1][1] == 'X' && gameTable[1][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[2][0] == 'X' && gameTable[2][1] == 'X' && gameTable[2][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][0] == 'X' && gameTable[1][0] == 'X' && gameTable[2][0] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][1] == 'X' && gameTable[1][1] == 'X' && gameTable[2][1] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][2] == 'X' && gameTable[1][2] == 'X' && gameTable[2][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][0] == 'X' && gameTable[1][1] == 'X' && gameTable[2][2] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (gameTable[0][2] == 'X' && gameTable[1][1] == 'X' && gameTable[2][0] == 'X') {
                                    System.out.println("Oyun bitti! Oyuncu kazandı!");
                                    break;
                                }
                                else if (i == 9) {
                                    System.out.println("Berabere!");
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

                            System.out.println("Sıra bilgisayarda!");
                            boolean botMoved = false;

                            if (winingMoveExist(gameTable, 'O', 'O')) {
                                System.out.println();
                                printBoard(gameTable);
                                System.out.println();
                                System.out.println("Oyun bitti! Bilgisayar kazandı!");
                                break;
                            }
                            else if (winingMoveExist(gameTable, 'X', 'O')) {
                                botMoved = true;
                                continue;
                            }
                            else if (takeCenter(gameTable)) {
                                continue;
                            }
                            else if (takeCorner(gameTable)) {
                                continue;
                            }

                            if (!botMoved) {
                                int botRow = (int)(Math.random() * 3);
                                int botColumn = (int)(Math.random() * 3);
                                
                                while (true) {
                                    if (gameTable[botRow][botColumn] == 'O' || gameTable[botRow][botColumn] == 'X') {
                                        botRow = (int)(Math.random() * 3);
                                        botColumn = (int)(Math.random() * 3);
                                        continue;
                                    } else {
                                        gameTable[botRow][botColumn] = 'O';
                                        break;
                                    }
                                }
                            }
                            System.out.println();
                            printBoard(gameTable);
                            System.out.println();
                        }
                    }
                }
                System.out.println();
                printBoard(gameTable);
                System.out.println();

                System.out.println("1-Tekrar Oyna\n2-Ana Menü\n3-Çıkış");
                    int afterGameChoice = input.nextInt();

                    if (afterGameChoice == 3) {
                        choice = 3;
                        break;
                    }
                    else if (afterGameChoice == 2) {
                        break;
                    }
                    else if (afterGameChoice == 1) {
                        continue;
                    }
            }

            while(choice == 2) {
                System.out.println("Oyun başladı!");

                char[][] gameTable = {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
                };

                printBoard(gameTable);

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
                            else if (i == 9) {
                                System.out.println("Berabere!");
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
                System.out.println("1-Tekrar Oyna\n2-Ana Menü\n3-Çıkış");
                int afterGameChoice = input.nextInt();

                if (afterGameChoice == 3) {
                    choice = 3;
                    break;
                }
                else if (afterGameChoice == 2) {
                    break;
                }
                else if (afterGameChoice == 1) {
                    continue;
                }
            }
            if (choice == 3) {
                System.out.println("Sistemden çıkış yapılıyor...");
                break;
            }
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

    public static boolean winingMoveExist(char[][] gameTable, char symbol, char opponent) {

        if (gameTable[0][0] == symbol && gameTable[0][1] == symbol && gameTable[0][2] == ' ') {
            gameTable[0][2] = opponent;
            return true;
        }
        else if (gameTable[0][0] == symbol && gameTable[0][2] == symbol && gameTable[0][1] == ' ') {
            gameTable[0][1] = opponent;
            return true;
        }
        else if (gameTable[0][1] == symbol && gameTable[0][2] == symbol && gameTable[0][0] == ' ') {
            gameTable[0][0] = opponent;
            return true;
        }
        else if (gameTable[1][0] == symbol && gameTable[1][1] == symbol && gameTable[1][2] == ' ') {
            gameTable[1][2] = opponent;
            return true;
        }
        else if (gameTable[1][0] == symbol && gameTable[1][2] == symbol && gameTable[1][1] == ' ') {
            gameTable[1][1] = opponent;
            return true;
        }
        else if (gameTable[1][1] == symbol && gameTable[1][2] == symbol && gameTable[1][0] == ' ') {
            gameTable[1][0] = opponent;
            return true;
        }
        else if (gameTable[2][0] == symbol && gameTable[2][1] == symbol && gameTable[2][2] == ' ') {
            gameTable[2][2] = opponent;
            return true;
        }
        else if (gameTable[2][0] == symbol && gameTable[2][2] == symbol && gameTable[2][1] == ' ') {
            gameTable[2][1] = opponent;
            return true;
        }
        else if (gameTable[2][1] == symbol && gameTable[2][2] == symbol && gameTable[2][0] == ' ') {
            gameTable[2][0] = opponent;
            return true;
        }
        else if (gameTable[0][0] == symbol && gameTable[1][1] == symbol && gameTable[2][2] == ' ') {
            gameTable[2][2] = opponent;
            return true;
        }
        else if (gameTable[0][0] == symbol && gameTable[2][2] == symbol && gameTable[1][1] == ' ') {
            gameTable[1][1] = opponent;
            return true;
        }
        else if (gameTable[1][1] == symbol && gameTable[2][2] == symbol && gameTable[0][0] == ' ') {
            gameTable[0][0] = opponent;
            return true;
        }
        else if (gameTable[0][2] == symbol && gameTable[1][1] == symbol && gameTable[2][0] == ' ') {
            gameTable[2][0] = opponent;
            return true;
        }
        else if (gameTable[0][2] == symbol && gameTable[2][0] == symbol && gameTable[1][1] == ' ') {
            gameTable[1][1] = opponent;
            return true;
        }
        else if (gameTable[1][1] == symbol && gameTable[2][0] == symbol && gameTable[0][2] == ' ') {
            gameTable[0][2] = opponent;
            return true;
        }
        else if (gameTable[0][0] == symbol && gameTable[1][0] == symbol && gameTable[2][0] == ' ') {
            gameTable[2][0] = opponent;
            return true;
        }
        else if (gameTable[0][0] == symbol && gameTable[2][0] == symbol && gameTable[1][0] == ' ') {
            gameTable[1][0] = opponent;
            return true;
        }
        else if (gameTable[1][0] == symbol && gameTable[2][0] == symbol && gameTable[0][0] == ' ') {
            gameTable[0][0] = opponent;
            return true;
        }
        else if (gameTable[0][1] == symbol && gameTable[1][1] == symbol && gameTable[2][1] == ' ') {
            gameTable[2][1] = opponent;
            return true;
        }
        else if (gameTable[0][1] == symbol && gameTable[2][1] == symbol && gameTable[1][1] == ' ') {
            gameTable[1][1] = opponent;
            return true;
        }
        else if (gameTable[1][1] == symbol && gameTable[2][1] == symbol && gameTable[0][1] == ' ') {
            gameTable[0][1] = opponent;
            return true;
        }
        else if (gameTable[0][2] == symbol && gameTable[1][2] == symbol && gameTable[2][2] == ' ') {
            gameTable[2][2] = opponent;
            return true;
        }
        else if (gameTable[0][2] == symbol && gameTable[2][2] == symbol && gameTable[1][2] == ' ') {
            gameTable[1][2] = opponent;
            return true;
        }
        else if (gameTable[1][2] == symbol && gameTable[2][2] == symbol && gameTable[0][2] == ' ') {
            gameTable[0][2] = opponent;
            return true;
        }
        return false;
    }

    public static boolean takeCenter(char[][] gameTable) {
        if (gameTable[1][1] == ' ') {
            gameTable[1][1] = 'O';
            return true;
        }
        return false;
    }

    public static boolean takeCorner(char[][] gameTable) {

        if (gameTable[0][0] == ' ' || gameTable[2][0] == ' ' || gameTable[0][2] == ' ' || gameTable[2][2] == ' ') {
            
            while (true) {
                int which = (int)(Math.random() * 4);

                if (gameTable[0][0] == ' ' && which == 0) {
                    gameTable[0][0] = 'O';
                    return true;
                }
                else if (gameTable[2][0] == ' ' && which == 1) {
                    gameTable[2][0] = 'O';
                    return true;
                }
                else if (gameTable[0][2] == ' ' && which == 2) {
                    gameTable[0][2] = 'O';
                    return true;
                }
                else if (gameTable[2][2] == ' ' && which == 3) {
                    gameTable[2][2] = 'O';
                    return true;
                }
            }
        }
        return false;
    }
}