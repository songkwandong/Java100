package method;

//Call by reference

public class Exam008 {

    public static void sum(TestNumber a){
        System.out.println("sum() 메서드 안에서 호출 " + a);
        System.out.println(a.num);
        a.num += 400;
        System.out.println("sum() 메서드 안에서 변경 후 호출 " + a.num);
    }
    public static void main(String[] args) {
        TestNumber a = new TestNumber(100);
        sum(a);
        System.out.println("=".repeat(40));
        System.out.println("main() 메서드 안에서 호출 " + a.num);
    }
}

class TestNumber{
        int num;
        TestNumber(int num) {this.num=num;}
}