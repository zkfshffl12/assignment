public class App {

    public static void ifnum() {
        int ifnum=10;  
        if (ifnum>0) {
            System.out.println("양수입니다");
        }else if (ifnum ==0){
            System.out.println("0입니다");
        }else{
            System.out.println("음수입니다");
        }//if문문
    }

    public static void switchnum() {
        int day=3;
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
        }//switch문
    }

    public static void whilenum() {
        int count=3;
        while (count>0) {
            System.out.println(count);
            count--;
        }//while문        
    }

    public static void dounum() {
        
        
        int num3=0;
        do{
            System.out.println(num3);
            num3++;
        }while(num3<3); //do while문
    }

    public static void fornum() {
        int[] numbers2=new int[5];
        String[] names2=new String[3];   
        System.out.println(numbers2.length);
        System.out.println(names2.length);
    }   //배열 생성과 선언언

    public static void arraynum() {
        int[] scores3={90,80,70};
        String[] fruits3={"apple","banana","Orange"};
        System.out.println(scores3[0]);
        System.out.println(fruits3[1]);
        //배열 초기화   
    }

    public static void fornum2() {
        int[] arr={1,2,3};
        System.out.println(arr[0]); //1
        arr[1]=10;
        System.out.println(arr[1]); //10 //요소접근   
    }

    public static void fornum3() {
        int[] data=new int[4];
        System.out.println(data.length); //배경길이   
    }

    public static void fornum4() {
        
        int[] nums={1,2,3,4,5};
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }//반복문과 배열
    }

    public static void main(String[] args) {
        ifnum();
        switchnum();
        whilenum();
        dounum();
        fornum();
        arraynum();
        fornum2();
        fornum3();
        fornum4();
    }
}