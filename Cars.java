// @SuppressWarnings("InitializerMayBeStatic")
class Cars{
    String name;
    int speed;
    void accelerate(int speed_limit){
        speed += speed_limit;
    }
    void brake(){
        System.out.println("car was braked");
    }
}