package LessonFirst;

public class LessonFirstHomeWork {
    public static float doHomeWorkThird(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean doHomeWorkFour(int a, int b){
        boolean result = false;
        if ((a+b >= 10) && (a+b <= 20)){
            result = true;
        }
        return result;
    }
    public static void doHomeWorkFive(int a){
        if (a >= 0){
            System.out.println("Метод получил положительное число " + a);
        } else System.out.println("Метод получил отрицательное число " + a);
    }
    public static boolean doHomeWorkSix(int a){
        boolean isNumMoreNull = false;
        if (a <= 0){
            isNumMoreNull = true;
        }
        return isNumMoreNull;
    }

    public static void doHomeWorkSeven(String str){
        System.out.println("Привет, " + str + "!");
    }

    public static void doHomeWorkEight(int a){

        if (a%4 == 0){
            if (a % 100 == 0){
                if (a % 400 == 0){
                    System.out.println("Введенный на проверку год, " + a + ", високосный");
                } else System.out.println("Введенный на проверку год, " + a + ", не високосный");
            } else System.out.println("Введенный на проверку год, " + a + ", високосный");
        } else System.out.println("Введенный на проверку год, " + a + ", не високосный");
    }
}
