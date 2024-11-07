package statistic_from_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StatisticFromFile {

//    public static void main(String[] args) throws IOException {
        // Указываем путь к файлу
//        String filePath = "input.txt";
//
//        // Читаем слова из файла
//        List<String> words = readWordsFromFile(filePath);
//
//        // Сортируем слова в алфавитном порядке
//        Collections.sort(words);
//
//        // Подсчитываем количество повторений каждого слова
//        Map<String, Integer> wordCounts = countWordOccurrences(words);
//
//        // Выводим статистику на консоль
//        printStatistics(words, wordCounts);
//
//        // Находим слово с максимальным количеством повторений
//        Entry<String, Integer> mostCommonWord = findMostCommonWord(wordCounts);
//
//        // Выводим слово с максимальным количеством повторений
//        System.out.printf("Слово с максимальным количеством повторений: '%s' (%d)%n",
//                mostCommonWord.getKey(), mostCommonWord.getValue());
//    }

    public Map<String, Integer> createSortedMap(String filePath) throws IOException{

        List<String> words = readWordsFromFile(filePath);

        Collections.sort(words);

        Map<String, Integer> wordCounts = countWordOccurrences(words);
        return wordCounts;
    }

    private static List<String> readWordsFromFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new IllegalArgumentException("Файл не найден: " + filePath);
        }

        List<String> words = Files.readAllLines(Paths.get(filePath));
        return words;
    }

    private static Map<String, Integer> countWordOccurrences(List<String> words) {
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            wordCounts.putIfAbsent(word, 0);
            wordCounts.put(word, wordCounts.get(word) + 1);
        }

        return wordCounts;
    }

    public Entry<String, Integer> findMostCommonWord(Map<String, Integer> wordCounts) {
        Entry<String, Integer> mostCommonWord = null;

        for (Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (mostCommonWord == null || entry.getValue() > mostCommonWord.getValue()) {
                mostCommonWord = entry;
            }
        }

        return mostCommonWord;
    }
}