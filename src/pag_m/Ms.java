package pag_m;

/**
 * Массивы, индексация и инициализация
 */
public class Ms {

    public static void main(String args[]) {
        int[] m = new int[3];//индекс массива =0,1,2
        //циклом
        for (int i = 0; i < 3; i++)
        System.out.println("индекс "+i+" = "+i );
        //ручном
        m[0] = 0;// инициализация массива с индексот 0 нулём
        m[1] = 1;// инициализация массива с индексот 1 еденицей
        m[2] = 2;// инициализация массива с индексот 2 двойкой

        System.out.println("индекс m[" + 0 + "]=" + m[0]);
        System.out.println("индекс m[" + 1 + "]=" + m[1]);
        System.out.println("индекс m[" + 2 + "]=" + m[2]);
        
    }
}
