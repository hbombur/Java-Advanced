package MaxElement;

import java.util.Scanner;

public class MaxElement {
    Scanner scanIn = new Scanner(System.in);

    private int scanningCountOfElement() {
        System.out.println("Введите размер массива:");
        int result = scanIn.nextInt();
        return result;
    }

    private String[] getArrayOfString(int countOfElement) {
        String[] arrayOfString = new String[countOfElement];
        String scanString = scanIn.nextLine();
        arrayOfString = scanString.split(" ");
        if (arrayOfString.length != countOfElement) {
            return null;
        }
        return  arrayOfString;
    }

    private void foundMaxString(String[] arrayOfString) {
        String maxString = "";
        for (String word: arrayOfString) {
            if (word.length() > maxString.length()) {
                maxString = word;
            }
        }
        System.out.println("Наибольшее слово из введенных: " + maxString);
    }

    public void maxElement() {
        int countOfElement = scanningCountOfElement();
        String[] arrayOfString = getArrayOfString(countOfElement);
        while (arrayOfString == null) {
            System.out.println("Введите через пробел слова в количестве, указанном ранее:");
            arrayOfString = getArrayOfString(countOfElement);
        }
        foundMaxString(arrayOfString);
//        scanIn.close();
    }

}
