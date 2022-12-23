import java.util.ArrayList;
import java.util.Random;

public class CreateProjectName {

    private static int changeFromStrToInt(String str) {
        int result = 0;

        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return -1;
            }

            result += result * 10 + (str.charAt(i) - 48);
        }

        return result;
    }

    public static void main(String[] args) {
        int times = changeFromStrToInt(args[0]);

        if (times == -1) return;

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

        System.out.println(result);
        
    }
}
