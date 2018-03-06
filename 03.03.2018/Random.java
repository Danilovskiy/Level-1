package DIT1;

public class Random {

    //Создать переменную с произвольным символом. Конвертировать символ в число, и вывести результат на консоль.
    public static void main(String[] args) {
        char ch = '9';
        int bg = Character.getNumericValue(ch);

	System.out.println (bg);
    }
}
