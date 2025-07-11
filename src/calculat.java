public class calculat {

//  public static void add(int num1, int num2){
//     int add=num1+num2;
//     System.out.println("값은 :"+add);
//  }

//  public static void sub(int num1, int num2){
//     int sub=num1-num2;
//     System.out.println("값은 :"+sub);
//  }

//  public static void mul(int num1, int num2){
//     int mul=num1*num2;
//     System.out.println("값은 :"+mul);
//  }

 public static void div(int num1, int num2){
    double div=num1/num2;
    System.out.println("값은 :"+div);
 }

    public static void main(String[] args) {
        System.out.println("계산기 프로그램 시작");
        int num1=10;
        int num2=12;
        // add(num1, num2);
        // sub(num1, num2);
        // mul(num1, num2);
        div(num1, num2);
        System.out.println("계산기 프로그램 종료");

        try {
            int result=num1/num2;
            System.out.println("값은 :"+result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }finally{
            System.out.println("계산기 프로그램 종료");
        }
    }
}