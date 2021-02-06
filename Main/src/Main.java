public class Main {

    public static void main(String[] args) {

        ZeroNull(); //1
        ArrayEight(); //2
        Multby2less6(); //3
        RectangleArray(); //4
        MaxMinElement(); //5

    }
    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void ZeroNull(){
        int[] Arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for(int i = 0; i < Arr1.length; i++) {
            if (Arr1[i] == 0) {
                Arr1[i] = 1;
            } else Arr1[i] = 0;
            System.out.print(i + " ");
        }
        System.out.println("\r");
    }

    /**
     * 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static void  ArrayEight(){
        int[] eight = new int[8];
        for (int i = 1, j = 0; i < eight.length; i++) {
            eight[i] = j += 3;
            System.out.println("arr[" + i + "] = " + eight[i]);
            }
        System.out.println("\r");
        }
    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void Multby2less6(){
        int[] Arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0;i < Arr2.length;i++) {
            if (Arr2[i] < 6) Arr2[i] *= 2;
            System.out.println("arr[" + i + "] = " + Arr2[i]);
        }
        System.out.println("\r");
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static void RectangleArray(){
        int[][] rec1 = new int[10][10];
        for (int i = 0; i < rec1.length; i++) {
            for (int j = 0, jd = rec1[i].length; j < rec1[i].length; j++, jd--) {
                if (i == j || i == (jd - 1)) rec1[i][j] = 1;
                System.out.print(rec1[i][j] + " ");
            }
            System.out.print("\r\n");
        }
        System.out.println("\r");
    }
    
    /**
    /*Short variant from instructor
    */
    for (int i = 0; i < rec1.length; i++) {
        rec1[i][i] = 1;
        rec1[i][rec1.lenght - 1 - i] = 1;
    }
    /**
     * 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */
    public static void MaxMinElement(){
        int[] Arr3 = {34,2,45,6,7,3,12,4,9,66};
        int maxEl = Arr3[0], minEl = Arr3[0], findMax = 0, findMin = 0;
        for (int i = 0;i < Arr3.length;i++){
            if (Arr3[i] > maxEl) {
                maxEl = Arr3[i];
                findMax = i;
            } else if (Arr3[i] < minEl) {
                minEl = Arr3[i];
                findMin = i;
            }
        }
        System.out.println("Max[" + findMax + "] = " + maxEl);
        System.out.println("Min[" + findMin + "] = " + minEl);
        System.out.println("\r");
    }
    
    /**
    /*Short variant from instructor
    */

    /**
     * А дальше у меня просто башки не хватает уже...
     */

}
