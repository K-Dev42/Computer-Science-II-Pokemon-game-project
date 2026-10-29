public class Potion extends Item{
    private int healingValue;


    public Potion(String name, int cashValue, int healingValue){
        super(name,cashValue);
        this.healingValue = healingValue;
    }

    @Override
    public void use(Pokemon pokemon){
        pokemon.hp += healingValue;
        this.hasBeenUsed = false;
        System.out.println(pokemon.name + " used a potion and heal " + this.healingValue + " HP!");
    }
}
