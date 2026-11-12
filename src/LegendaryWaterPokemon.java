public class LegendaryWaterPokemon extends WaterPokemon implements Legendary {

    public LegendaryWaterPokemon(String name, int hp, int attack, double eva){
        super(name,hp,attack,eva);
        this.usedDiveInPreviousTurn = false;
    }
        

    @Override 
    public void attacksWithLegendaryAttack(Pokemon attackedPkm){
        if (Math.random() < 0.7) {
            attackedPkm.takeDamage(this.attack * 2);
            System.out.println("Legendary attacked has been used!");
        } else {
            System.out.println("The legendary attack misses");
        }
    }

    @Override 
    public void attacks(Pokemon attackedPkm){
        if (usedDiveInPreviousTurn == false){
            useDive();
        } else {
            this.usedDiveInPreviousTurn = false;
            this.attacksWithLegendaryAttack(attackedPkm);
        }
    }



}
