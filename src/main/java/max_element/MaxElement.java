package max_element;

import java.util.Scanner;

public class MaxElement {
    Scanner scanIn;
    boolean errorFlag = false;

    public MaxElement(Scanner scanner){ this.scanIn = scanner; }

    private int scanningCountOfElement() {
        System.out.println("Введите размер массива:");
        return scanIn.nextInt();
    }

    private String[] getArrayOfString(int countOfElement) {
        String[] arrayOfString;
        String scanString = "";

        System.out.println("Введите через пробел слова в количестве, указанном ранее:");
        scanString = scanIn.nextLine();
        scanString += scanIn.nextLine();
        arrayOfString = scanString.split(" ");
        if (arrayOfString.length != countOfElement) {
            return null;
        }
        return arrayOfString;
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
                System.out.println("Неверное количество слов");
                arrayOfString = getArrayOfString(countOfElement);
        }
        foundMaxString(arrayOfString);
    }

}
