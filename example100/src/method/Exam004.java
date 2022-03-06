package method;

public class Exam004 {

    public static String returnUpper(String str){
        String ret = str.toUpperCase();
        return ret;
    }

    public static void main(String[] args){
        String inputStr = "korea";
        System.out.println(returnUpper(inputStr));
    }

}
