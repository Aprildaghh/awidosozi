package NameCreation;

import java.util.ArrayList;
import java.util.Random;

public class CreateName {

    public static String create(int times) {

        if (times == -1) return "";

        Random rd = new Random();
        String result = "";
        boolean flag = false;
        ArrayList chars_1 = new ArrayList();
        chars_1.add('a');
        chars_1.add('e');
        chars_1.add('i');
        chars_1.add('o');
        chars_1.add('u');
        ArrayList chars_2 = new ArrayList();

        for(int i = 97; i <= 122; ++i) {
            if (!chars_1.contains((char)i)) {
                chars_2.add((char)i);
            }
        }

        while(times-- > 0) {
            if (flag) {
                result += chars_2.get(rd.nextInt(21));
            } else {
                result += chars_1.get(rd.nextInt(5));
            }

            flag = !flag;
        }

        return result;
        
    }

    public static int StrToInt(String text) {

        int result = 0;

        for (int i = 0; i < text.length(); i++) {

            char currChar = text.charAt(i);

            result += currChar - '0';
            result *= 10;

        }
        result /= 10;

        return result;

    }
}
