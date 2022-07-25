package exam;

public class Run{
    int speed;
    void showSpeed() {
        System.out.println("Current Speed : "+speed);
    
}
public class SimpleTesting extends Run{
    public static void main(String[] args) {
        SimpleTesting run = new SimpleTesting();
        run.showSpeed();
        run.speed = 20;
        run.showSpeed();
        
        run.speed;
    }
}
}