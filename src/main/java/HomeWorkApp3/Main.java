package HomeWorkApp3;

public class Main {
    public static void main(String[] args) {
        printArray();
        System.out.println();
        arrayOneHundred();
        System.out.println();
        arrayMultiply();
        System.out.println();
        squareArray(5);
        System.out.println();
        printVariableArray(7, 5);
        System.out.println();
        findMinAndMax(10);
        System.out.println();
        System.out.println(isThereBalance(5));
        System.out.println();
        moveArray(-1);
    }

    // Задание массива из 0 и 1, замена 0 на 1 и наоборот
    private static void printArray() {
        int[] simpleArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.print(simpleArray[i] + " ");
        }
        for (int i = 0; i < simpleArray.length; i++) {
            if (simpleArray[i] == 1) {
                simpleArray[i] = 0;
            } else {
                simpleArray[i] = 1;
            }
        }
        System.out.println();
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.print(simpleArray[i] + " ");
        }
        System.out.println();
    }

    // Массив от 1 до 100
    private static void arrayOneHundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Умножение элементов массива со значением меньше 6 на 2
    private static void arrayMultiply() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Квадратный массив с диагональными элементами, равными 1. Другие элементы равны 0
    private static void squareArray(int size) {
        int[][] square = new int[size][size];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                if ((i == j) || (i + j == square.length - 1)) {
                    square[i][j] = 1;
                    System.out.print(square[i][j] + " ");
                } else {
                    square[i][j] = 0;
                    System.out.print(square[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Генерация одномерного массива размером len и каждым элементом, равным initialValue
    private static void printVariableArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Поиск минимального и максимального элемента массива
    private static void findMinAndMax(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальное значение:" + max);
        System.out.println("Минимальное значение:" + min);
    }

    // Метод возвращает true, если в массиве есть место, когда сумма элементов левой части равна сумме элементов правой части. Иначе - false
    private static boolean isThereBalance(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // position - позиция элемента, элементы до которого включительно будет суммироваться, образуя левую часть
        // Элементы, расположенные правее position, суммируются, образуя правую часть
        for (int position = 1; position < array.length; position++) {
            int left = 0;
            for (int i = 0; i < position; i++) {
                left = left + array[i];
            }
            int right = 0;
            for (int i = position; i < array.length; i++) {
                right = right + array[i];
            }
            // Тестовый вывод значений левой и правой части при каждом изменении параметра position
            // При необходимости наглядной демонстрации метода снять комментарии со всех sout в данном методе (5 шт)
//            System.out.print(left + " ");
//            System.out.print("? ");
//            System.out.print(right + " ");
            if (left == right) {
//                System.out.print(" - Баланс найден");
                return true;
            } else {
//                System.out.print(" - Баланса нет");
            }
//            System.out.println();
        }
        return false;
    }

    // При положительном числе n метод сдвигает массив вправо, а при отрицательном значении влево. Величина сдвига равна модулю числа n
    private static void moveArray(int n) {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // move - переменная, отвечающая за величину сдвига массива
        // temp - временная переменная для хранения крайнего элемента массива, который не может быть переназначен циклом
        if (n < 0) {
            for (int move = 0; move > n; move--) {
                int temp = array[0];
                for (int i = 0; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = temp;
            }
        } else if (n > 0) {
            for (int move = 0; move < n; move++) {
                int temp = array[array.length - 1];
                for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                }
                array[0] = temp;
            }
        } else if (n == 0) {
            System.out.println("Сдвига нет, тк n=0");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
