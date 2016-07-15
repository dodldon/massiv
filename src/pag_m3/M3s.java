package pag_m3;

/**
 * Массивы, многомерный массив<br>массив в массиве<br>
 * тип массива[][] имя;<br>
 * левй индекс определяет строку;правый индекс определяет столбец
 */
public class M3s {

    public static void main(String args[]) {
       
        int mm[][] = new int[2][3]; //две строки, три столбца
         /*
        //в ручную      
        mm[0][0] = 0; //нулевая стр, нуль стол
        mm[0][1] = 1; //нулевая стр, перв стол      
        mm[0][2] = 1; //нулевая стр, втор стол
        System.out.print(mm[0][0] + " " + mm[0][1] + " " + mm[0][2] + "\t");
        System.out.println();
        mm[1][0] = 2; //первая стр, нуль стол     
        mm[1][1] = 2;
        mm[1][2] = 2;
        System.out.println(mm[1][0] + " " + mm[1][1] + " " + mm[1][2]);
         */
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mm[i][j]);

            }
            System.out.println();
        }
    }
}
