public abstract class Item {
    private String name;
    private int cashValue;
    protected boolean hasBeenUsed;


    public Item(String name, int cashValue){
        this.name = name;
        this.cashValue = cashValue;
        this.hasBeenUsed = false;
    }

    public String getName(){
        return this.name;
    }

    public int getCashValue(){
        return this.cashValue;
    }

    public boolean getHasBeenUsed(){
        return this.hasBeenUsed;
    }

    public abstract void use(Pokemon pokemon);


}