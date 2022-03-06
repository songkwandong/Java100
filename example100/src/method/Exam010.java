package method;

import java.util.Arrays;

public class Exam010 {
    public static String[] capitalMethod(String a, String b){
        String a_ = a.toUpperCase();
        String b_ = b.toLowerCase();

        String[] ret = {a_, b_};
        return ret;
    }

    public static void main(String[] args) {
        String[] result= capitalMethod("korea", "USA");
        System.out.println(Arrays.toString(result));
    }
}
