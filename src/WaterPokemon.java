public class WaterPokemon extends Pokemon {
    protected boolean usedDiveInPreviousTurn;



    public WaterPokemon(String name, int hp, int attack, double eva){
        super(name, hp, attack, eva);
        this.usedDiveInPreviousTurn = false;
    }


    public void useDive(){
        this.usedDiveInPreviousTurn = true;
        System.out.println(this.name + " used Dive!");
    }


    @Override
    public void takeDamage(int damage){
        if (this.usedDiveInPreviousTurn == true){
            System.out.println(this.name + " is underwater so it does not take any damage!");
        } else {
            super.takeDamage(damage);
        }
    }


    @Override
    public void sayName(){
        System.out.println("I am " + this.name + "! I am a water Pokemon!");
    }

    @Override
    public void attacks(Pokemon attackedPokemon){
        if (usedDiveInPreviousTurn == false){
            useDive();
        } else {
            this.usedDiveInPreviousTurn = false;
            attackedPokemon.takeDamage(this.attack);
        }




    }



}
