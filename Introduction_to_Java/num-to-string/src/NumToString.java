import java.util.Scanner;

public class NumToString {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            int hNum = num / 100;
            int tNum = (num % 100) / 10;
            int uNum = (num % 100) % 10;

            String hString = null, tString = null, uString = null;

            if (hNum > 0) {
                switch (hNum) {
                    case 1:
                        hString = "One hundred and ";
                        break;
                    case 2:
                        hString = "Two hundred and ";
                        break;
                    case 3:
                        hString = "Three hundred and ";
                        break;
                    case 4:
                        hString = "Four hundred and ";
                        break;
                    case 5:
                        hString = "Five hundred and ";
                        break;
                    case 6:
                        hString = "Six hundred and ";
                        break;
                    case 7:
                        hString = "Seven hundred and ";
                        break;
                    case 8:
                        hString = "Eight hundred and ";
                        break;
                    case 9:
                        hString = "Nine hundred and ";
                        break;
                }
            } else {
                hString = "";
            }

            if (tNum == 0) {
                tString = "";
                switch (uNum) {
                    case 0:
                        uString = "";
                        break;
                    case 1:
                        uString = "One.";
                        break;
                    case 2:
                        uString = "Two.";
                        break;
                    case 3:
                        uString = "Three.";
                        break;
                    case 4:
                        uString = "Four.";
                        break;
                    case 5:
                        uString = "Five.";
                        break;
                    case 6:
                        uString = "Six.";
                        break;
                    case 7:
                        uString = "Seven.";
                        break;
                    case 8:
                        uString = "Eight.";
                        break;
                    case 9:
                        uString = "Nine.";
                        break;
                }
            } else if (tNum == 1) {
                uString = "";
                switch (uNum) {
                    case 0:
                        tString = "Ten.";
                        break;
                    case 1:
                        tString = "Eleven.";
                        break;
                    case 2:
                        tString = "Twelve.";
                        break;
                    case 3:
                        tString = "Thirteen.";
                        break;
                    case 4:
                        tString = "Fourteen.";
                        break;
                    case 5:
                        tString = "Fifteen.";
                        break;
                    case 6:
                        tString = "Sixteen.";
                        break;
                    case 7:
                        tString = "Seventeen.";
                        break;
                    case 8:
                        tString = "Eighteen.";
                        break;
                    case 9:
                        tString = "Nineteen.";
                        break;
                }
            } else {
                switch (tNum) {
                    case 2:
                        tString = "Twenty ";
                        break;
                    case 3:
                        tString = "Thirty ";
                        break;
                    case 4:
                        tString = "Forty ";
                        break;
                    case 5:
                        tString = "Fifty ";
                        break;
                    case 6:
                        tString = "Sixty ";
                        break;
                    case 7:
                        tString = "Seventy ";
                        break;
                    case 8:
                        tString = "Eighty ";
                        break;
                    case 9:
                        tString = "Ninety ";
                        break;
                }
                switch (uNum) {
                    case 0:
                        uString = "";
                        break;
                    case 1:
                        uString = "One.";
                        break;
                    case 2:
                        uString = "Two.";
                        break;
                    case 3:
                        uString = "Three.";
                        break;
                    case 4:
                        uString = "Four.";
                        break;
                    case 5:
                        uString = "Five.";
                        break;
                    case 6:
                        uString = "Six.";
                        break;
                    case 7:
                        uString = "Seven.";
                        break;
                    case 8:
                        uString = "Eight.";
                        break;
                    case 9:
                        uString = "Nine.";
                        break;
                }
            }
            System.out.printf("%s%s%s\n", hString, tString, uString);
        }
    }
}
