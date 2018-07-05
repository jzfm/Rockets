package Domain;

public class Propeller {

    private int initialPotency = 0;
    private int actualPotency = 0;
    private int maxPotency;

    public Propeller(int maxPotency) throws Exception {
            this.maxPotency = maxPotency;
    }

    public void setMaxPotency(Integer potency){
        this.maxPotency = potency;
    }

    public void changePotency(int power) {
        this.actualPotency = getPotency() + power;
        if(this.actualPotency < 0){
            this.actualPotency = 0;
        }
        if(this.actualPotency > this.maxPotency){
            this.actualPotency = this.maxPotency;
        }
    }

    public int getPotency(){ return actualPotency; }

    public int getMaxPotency(){ return  maxPotency;}
}

