package method;

public class Exam007 {
    public static void sum(Integer a) {
        a += 400;
        System.out.println("sum() 메서드 안에서 호출 " + a);
    }
    public static void main(String[] args) {
        // Wrapper 클래스의 Integer 클래스 타입으로 변수 a를 선언,
        // new로 객체를 생성하여 해당 주소값을 메서드로 보냄.
        Integer a = new Integer(100);
        sum(a);
        System.out.println("main() 메서드 안에서 호출 " + a);
    }
}
