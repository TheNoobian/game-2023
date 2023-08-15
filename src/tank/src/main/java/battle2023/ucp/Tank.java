package battle2023.ucp;

public class Tank {

    int health = 5;

    public boolean isAlive() {
        return health > 0;
    }

    public void damage(int amount) {
        health = health - amount;
        return;
    }
}
