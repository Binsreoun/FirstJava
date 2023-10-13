package week03;

//
//우리가 클래스를 만들기 위해서는 4가지 STEP 이 필요합니다.
//
//1. 만들려고 하는 설계도를 선언합니다.(클래스 선언)
//2. 객체가 가지고 있어야할 속성(필드)을 정의합니다.
//3. 객체를 생성하는 방식을 정의합니다.(생성자)
//4. 객체가 가지고 있어야할 행위(메서드)를 정의합니다.
//
public class Car {
    //필드
    //고유데이터
    String company;
    String model = "Gv80";
    String color;
    double price;

    //상태데이터
    double speed;
    char gear; //(P,R,N,D)
    boolean lights =true;

    //객체데이터
    Tire tire = new Tire();
    Door door;
    Handel handel;

    //생성자
    public Car() {

    }

    //매서드

   double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    double brakePedal(){
        speed=0;
        return speed;
    }

    char changeGear(char type){
        gear = type;
        return gear;
    }

    boolean onOffLight(){
        lights = !lights;
        return lights;
    }

    void horn(){
        System.out.println("빵빵");
        System.out.println("빵빵");
    }


}
