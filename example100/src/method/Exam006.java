package method;

public class Exam006 {

    // Call by value --> 값에 의한 호출 , 값에 의해서 (메서드를) 호출
    // 메서드로 인자값을 넘길 때 해당 값을 복사하여 넘기는 방식
    // 따라서 sum() 메서드 내부에서는 복사된 값으로 처리를 한다.

    public static void sum(int a){
        a += 400;
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a = 100;
        sum(a);
        System.out.println(a);
    }
}
