package glassgiver;

import java.util.Scanner;

public class HomeWorkApp {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;

        while (isContinue){
            System.out.println("Choose your option (1, 2, 3, 4, 5): " +
                    "\n 1. printThreeWords \n 2. checkSumSign \n 3. printColor \n 4. compareNumbers \n 5. 3resetColor \n 6. exit");
            int chooseOption = scanner.nextInt();
            switch (chooseOption){
                case 1:
                    printThreeWords();
                    break;
                case 2:
                    System.out.println("input a: ");
                    int inputA = scanner.nextInt();
                    System.out.println("input b: ");
                    int inputB = scanner.nextInt();
                    checkSumSign(inputA, inputB);
                    break;
                case 3:
                    System.out.println("input value: ");
                    int inputValue = scanner.nextInt();
                    printColor(inputValue);
                    break;
                case 4:
                    System.out.println("input a: ");
                    inputA = scanner.nextInt();
                    System.out.println("input b: ");
                    inputB = scanner.nextInt();
                    compareNumbers(inputA, inputB);
                case 5:
                    resetColor();
                    break;
                case 6:
                    isContinue = false;
                    break;
            }
        }
    }

    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign(int inputA, int inputB) {
        int a = inputA, b = inputB;
        if (a + b >= 0){
            System.out.println("The summ is positive");
        }
        else{
            System.out.println("The summ is negative");
        }
    }

    public static  void printColor(int inputValue){
        int value = inputValue;
        if (value <= 0){
            System.out.println(ANSI_RED + "red");
        }
        else if (value > 0 && value <= 100){
            System.out.println(ANSI_YELLOW + "yellow");
        }
        else if(value > 100){
            System.out.printf(ANSI_GREEN + "green");
        }

    }

    public  static void resetColor(){
        System.out.println(ANSI_RESET);
    }

    public static void compareNumbers(int inputA, int inputB) {
        int a = inputA, b = inputB;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
