package statistic_from_file.file_reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CreateMapFromString {
    public String[] splittedAndSortedString(String text) {
        return (String[]) Arrays.stream(text.split(" ")).sorted().toArray();
    }

    public void createMapFromArray(String[] sortedString) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < sortedString.length; i++) {
            int j = 1;
            if (sortedString[i + 1] != null && sortedString[i].equals(sortedString[i + 1])) {
                resultMap.put(sortedString[i], j);
            }
        }
    }
}
