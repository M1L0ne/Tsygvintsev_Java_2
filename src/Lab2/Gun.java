package Lab2;

public class Gun {
    private int bullets;

    public Gun(int bullets) {
        this.bullets = bullets;
    }
    public Gun() {
        this.bullets = 5;
    }

    public void fire() {
        if (bullets > 0) {
            bullets--;
            System.out.println("Бах!");
        }
        else {
            System.out.println("Клац!");
        }
    }
}
