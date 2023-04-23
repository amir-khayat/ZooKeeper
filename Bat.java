public class Bat extends Mammals {
    
    public Bat(){
        super(300);
    }

    public void fly() {
        System.out.println("Brrrrrrrb!");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("khash khash krrk");
        energyLevel += 25;
    }

    public void attackTown() { 
        System.out.println("AH! AH! AH!");
        energyLevel -= 100;
    }
}