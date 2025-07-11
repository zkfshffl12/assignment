public class car {
    public static class Car {
        private String brand ;
    
        private String model;
    
    
        public void move() {
            System.out.println("자동차가 움직입니다.");
        }
    
        public void stop() {
            System.out.println("자동차가 멈춥니다.");
        }
    
        public void setBrand(String brand) {
            this.brand = brand;
        }
    
        public String getBrand() {
            return this.brand;
        }

        public void setModel(String model){
            this.model=model;
        }
        
        public String getModel() {
            return this.model;
        }
    
        public static void main(String[] args) {
            try {
                Car myCar = new Car();
                myCar.setBrand("kia");
                myCar.setModel("k5");
        
                System.out.println("브랜드: " + myCar.getBrand()+"모델: "+myCar.getModel());
        
                myCar.move();
                myCar.stop();
            } catch (Exception e) {
                System.out.println("자동차 객체 생성 중 오류 발생: " + e.getMessage());
            } finally {
                System.out.println("자동차 프로그램 종료");
            }
        }
    
    
    
    }
}
