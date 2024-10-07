public class Main {
    //HI SENSEI
    public static void main(String[] args) {
        // Создание и инициализация массива из 15 дробных чисел
        double[] numbers = {1.5, 2.3, -3.4, -2.1, 4.5, 3.2, -6.1, 7.8, 1.1, -5.6, 8.9, 6.3, 2.4, -1.7, 9.5};

        // Вывод сгенерированного массива
        System.out.print("Сгенерированный массив: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        // Цикл "for each" для подсчета суммы и количества положительных чисел после первого отрицательного
        for (double num : numbers) {
            if (num < 0) {
                foundNegative = true;
            } else if (foundNegative && num > 0) {
                sum += num;
                count++;
            }
        }

        // Вычисление и вывод среднего арифметического
        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Положительные числа после первого отрицательного отсутствуют.");
        }
    }
} //END OF PROGRAM