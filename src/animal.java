public class animal {

    private String name;
    private String sound;
    public static void main(String[] args) {
        System.out.println("동물소리리");
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setSound(String sound){
        this.sound=sound;
    }

    public String getSound(){
        return this.sound;
    }
}