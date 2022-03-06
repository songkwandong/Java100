package method;

public class Exam005 {

    public void helloWorld(){
        System.out.println("Hello world");
    }

    public static void main(String[] args){
        //helloWorld(); 메인 메서드는 static 메서드만 호출 할 수 있기 떄문에 에러
        //객체 생성 후 메서드 호출.
        Exam005 ex5 = new Exam005();
        ex5.helloWorld();
    }
}
