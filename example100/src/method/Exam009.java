package method;

import java.util.Arrays;

public class Exam009 {
    public static int[] testMethod(){
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        return new int[] {num1, num2, num3};
    }

    public static void main(String[] args) {
        int[] result = testMethod();
        System.out.println(result[0] + " " + result[1]);
        System.out.println("result[0] + result[1] = " + (result[0] + result[1]));
        System.out.println(Arrays.toString(result)); //한방에 모든 요소를 출력, 반복문 사용 없이.
    }
}
