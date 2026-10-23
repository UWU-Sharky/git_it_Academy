package src.com.anarky.app;

import java.util.Arrays;
import java.util.List;

/*
 * Сервис с «бизнес»-логикой: обработка аргументов командной строки.
 * В будущем именно сюда будет добавляться новая логика,
 * а Main останется тонкой обёрткой над вводом/выводом.
 */
public class ArgService {

    /**
     * Обрабатывает аргументы и возвращает готовый к выводу результат.
     *
     * @param args аргументы командной строки
     * @return строка с обработанным результатом
     * @throws IllegalArgumentException если аргументы не переданы
     */
    public String processArgs(String[] args) {
        if (args == null || args.length == 0) {
            throw new IllegalArgumentException(
                    "Аргументы не переданы. Использование: java -jar app.jar <аргумент1> <аргумент2> ...");
        }

        List<String> arguments = Arrays.asList(args);
        return formatResult(arguments);
    }

    private String formatResult(List<String> arguments) {
        StringBuilder sb = new StringBuilder();
        sb.append("Передано аргументов: ").append(arguments.size()).append("\n");

        for (int i = 0; i < arguments.size(); i++) {
            sb.append("  [").append(i).append("] ").append(arguments.get(i)).append("\n");
        }

        return sb.toString();
    }
}