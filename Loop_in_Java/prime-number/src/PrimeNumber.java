public class PrimeNumber {
    public static void main(String[] args) {
        int check = 2;

        int time = 1;

        ac:
        while (time <= 20) {
            for (int i = 2; i < check; i++) {
                if (check % i == 0) {
                    check++;
                    continue ac;
                }
            }
            System.out.println(check);
            check++;
            time++;
        }
    }
}
