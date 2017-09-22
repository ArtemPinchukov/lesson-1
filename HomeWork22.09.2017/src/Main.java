public class Main {
    public static void main(String[] args) {
        // Задача: найти максимальное значение в массиве
        /*int[] arr = {1, 3, 8, 2, -5};
        int imax = 0;
        for (int i = 1; i < arr.length; i++) {// length - применяется тоглько для массивов и вытягивает количество элементов в массиве
            if (arr[i] > arr[imax]) {
                imax = i;
            }
        }
        System.out.println("Максимальное число");
        System.out.println(arr[imax]);
        System.out.print("Максимальное число ");//если использовать без ln
        System.out.println(arr[imax]);*/



        //Исключительная ситуация №1
        /*int[] arr = {1, 3, 8, 2, -5};
        int imax = 0;
        for (int i = 1; i < arr.length; i++) {// length - применяется тоглько для массивов и вытягивает количество элементов в массиве
            if (arr[i] > arr[imax]) {
                imax = i;
            }
        }
        System.out.print("Максимальное число ");//если использовать без ln
        System.out.println(arr[imax]);
        try {
            arr[10]=20;//не существующий элемент массива
        }
        catch (Exception e){
            System.out.println("Error");
        }*/



        //Исключительная ситуация №2
        /*int[] arr = {1, 3, 8, 2, -5};
        int imax = 0;
        for (int i = 1; i < arr.length; i++) {// length - применяется тоглько для массивов и вытягивает количество элементов в массиве
            if (arr[i] > arr[imax]) {
                imax = i;
            }
        }
        System.out.print("Максимальное число ");//если использовать без ln
        System.out.println(arr[imax]);
        try {
            arr[10]=20;//не существующий элемент массива
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Вы не можете обратиться к элементу с данным индексом "+e1.getMessage());
        }
        catch (Exception e){
            System.out.println("Error");
        }*/



        //Исключительная ситуация №3
        /*int[] arr = {1, 3, 8, 2, -5};
        int imax = 0;
        for (int i = 1; i < arr.length; i++) {// length - применяется тоглько для массивов и вытягивает количество элементов в массиве
            if (arr[i] > arr[imax]) {
                imax = i;
            }
        }
        System.out.print("Максимальное число ");//если использовать без ln
        System.out.println(arr[imax]);
        try {
            int a=5/0;
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Вы не можете обратиться к элементу с данным индексом "+e1.getMessage());
        }
        catch (Exception e){
            System.out.println("Error");
        }*/


        //Задача про депозит в банке.
        Deposit dep=new Deposit();
        dep.setPinCode(3456);
        dep.add(100.2f);
        try {
            dep.getMoney(3);
            dep.printMyBalance();
        } catch (MyException e) {
            System.out.println(e.getError());
        }
    }

}
