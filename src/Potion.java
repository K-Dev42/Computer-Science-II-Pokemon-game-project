public class Potion extends Item{
    protected int healingValue;


    public Potion(String name, int cashValue, int healingValue){
        super(name,cashValue);
        this.healingValue = healingValue;
    }

    @Override
    public void use(Pokemon pokemon){
        pokemon.hp += healingValue;
        this.hasBeenUsed = true;
        System.out.println(pokemon.name + " used a potion and heal " + this.healingValue + " HP!");
    }

    public int getHealingValue(){
        return this.healingValue;
    }

    public void setUsageToTrue(){
        this.hasBeenUsed = true;
    }


}
