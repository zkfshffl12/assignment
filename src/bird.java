import top.flyable;

public class bird implements flyable, walkable{

    @Override
    public void fly() {
        System.out.println("새가 날아갑니다.");
    }

    @Override
    public void walk() {
        System.out.println("새가 걸어갑니다.");
    }

    public static void main(String[] args) {
        try {
            bird bird=new bird();
            bird.fly(); 
            bird.walk();

            System.out.println();
        } catch (Exception e) {
            System.out.println("오류가 발생했습니다: " + e.getMessage());
        }
    }

}
