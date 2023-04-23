public class Mammals {
    public int energyLevel;

    public int displayEnergy() {
        System.out.println("Energy Level: " + energyLevel);
        return energyLevel;
    }

    public Mammals(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}


