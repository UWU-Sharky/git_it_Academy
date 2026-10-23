package src.com.anarky.app;

/**
 * Точка входа приложения.
 * Отвечает только за ввод/вывод: читает аргументы командной строки
 * и передаёт их в сервис с бизнес-логикой.
 */
public class Main {

    public static void main(String[] args) {
        ArgService argService = new ArgService();

        try {
            String result = argService.processArgs(args);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
            System.exit(1);
        }
    }
}