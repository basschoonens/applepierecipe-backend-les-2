public class Ingredient {

    private static int amount;
    private static String unit;
    private static String name;

    public Ingredient(int amount, String unit, String name) {
        Ingredient.amount = amount;
        Ingredient.unit = unit;
        Ingredient.name = name;
    }

    public Ingredient(){

    }


    public static int getAmount() {
        return amount;
    }

    public void setAmount(int amount){
        Ingredient.amount = amount;
    }


    public static String getUnit() {
        return unit;
    }

    public void setUnit(String unit){
        Ingredient.unit = unit;
    }


    public static String getName() {
        return name;
    }

    public void setName(String name){
        Ingredient.name = name;
    }
}

