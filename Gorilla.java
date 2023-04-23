public class Gorilla extends Mammals {
    
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public void throwSomething() {
        System.out.println("Gorilla has thrown something!");
        energyLevel -= 5;        
    }

    public void eatBananas() {
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("Gorilla has climbed a tree!");
        energyLevel -= 10;
    }

}