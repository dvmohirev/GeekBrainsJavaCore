package LessonFirst;

public class Main {
    public static void main(String[] args) {
        //пункт 1 и 2
        byte a = (byte) 5;
        short b = (short) 10;
        int c = 100;
        long d = 1000;
        float f = 1.2f;
        double e = 5.6;
        char symbol = 'k';
        boolean isCorrect = true;

        LessonFirstHomeWork lesFiHoWork = new LessonFirstHomeWork();
        // пунтк 3

        System.out.println(lesFiHoWork.doHomeWorkThird(5.0f, 2.4f, 6.5f , 7.0f));

        // пунтк 4
        System.out.println(lesFiHoWork.doHomeWorkFour(5, 6));

        // пунтк 5
        lesFiHoWork.doHomeWorkFive(-4);

        // пунтк 6
        System.out.println(lesFiHoWork.doHomeWorkSix(-5));

        // пунтк 7
        lesFiHoWork.doHomeWorkSeven("Рыжий");

        // пунтк 8 - Проверял так - https://docs.microsoft.com/ru-ru/office/troubleshoot/excel/determine-a-leap-year
        lesFiHoWork.doHomeWorkEight(1992);

    }
}
