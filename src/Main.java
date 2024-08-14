import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка (N): ");
        int n = scanner.nextInt();
        System.out.print("Введите верхнюю границу значений элементов (M): ");
        int m = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextInt(m + 1)); // генерируем числа от 0 до M включительно
        }
        System.out.println("Вот случайный список:: " + numbers);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(numbers);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}