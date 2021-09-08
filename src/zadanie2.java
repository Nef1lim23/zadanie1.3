public class zadanie2 {
    public static void main(String[] args) {
        int score = 100;
        int transfer = 11000;
        int bonus;
        if (transfer > 1000) {
            bonus = transfer / 100;

        } else {
            bonus = 0;
        }
        score += transfer + bonus;
        System.out.println("Ваш бонус пополнения составляет: " + bonus);
        System.out.println("Ваш счет после пополнения составляет: " + score);
    }

}
