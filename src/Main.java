import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        //Задание 2
        int friday = 5;
        for (int dayNumber = friday; dayNumber <= 31; dayNumber+= 7) {
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет.");
        }


        //Задание 3
        int nowYear = LocalDate.now().getYear();
        int startYear = nowYear - 200;
        int endYear = nowYear + 100;
        for (int b = startYear; b <= endYear; b++) {
            if (b % 79 == 0) {
                System.out.println("В " + b + " году была (будет) комета.");
            }
        }

    }

}
