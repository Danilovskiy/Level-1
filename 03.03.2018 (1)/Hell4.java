package DIT1;

public class Hell4 {
    //Создать программу, конвертирующую более широкий тип к более узкому. Создать ситуацию, в которой часть данных более широкого типа теряется.
    public static void main (String [] args){
        long w = 457723442;
        byte d = (byte) w;
        System.out.println (d);
    }
}
