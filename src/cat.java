 public class cat extends animal{

    public static void main(String[] args) {
        animal cat=new animal();
        cat.setName("고양이");
        cat.setSound("야옹");

        System.out.println(cat.getName()+"의 소리는 "+cat.getSound()+"입니다.");

    }
    
} 