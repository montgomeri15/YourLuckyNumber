import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!" + " My name is Alina.");
        System.out.println("Твой счастливый номер сегодня (Math.random): " + luckyNumber(1, 10));
        luckiNumberWithRandom();
    }

    /**Вариант с Math.random()*/
    private static int luckyNumber(int min, int max){
        //Чтобы диапазон начинался с указанного минимума, добавляем min,
        //а чтобы в диапазон входил максимум, добавляем 1
        int result = min + (int)(Math.random() * ((max - min) + 1));
        return result;
    }

    /**Вариант с классом java.util.Random*/
    private static void luckiNumberWithRandom(){
        Random random = new Random();
        //Добавляем 1, т. к. текущий диапазон от 0 до 9
        int result = random.nextInt(10) + 1;
        System.out.println("Твой счастливый номер сегодня (java.util.Random): " + result);
    }
}