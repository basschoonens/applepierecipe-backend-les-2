public class Main {

    public static void main(String[] args) {

        // Hier heb ik printIngredients uit ApplePieRecipe aangeroepen in het idee dat ik dan de lijst zou kunnen printen. Helaas is het me wat ik ook probeer niet gelukt de hele lijst te printen. Met wat ik nu heb genoteerd geeft hij als resultaat het allerlaatste ingredient uit ApplePieRecipe in de terminal weer (15 gram paneermeel). Het is me niet helemaal duidelijk waarom alleen die wordt geprint in de terminal. Helaas is het met debuggen niet duidelijker geworden//

        ApplePieRecipe lijstIngredienten = new ApplePieRecipe();
        lijstIngredienten.printIngredients();

        ApplePieRecipe recept = new ApplePieRecipe();
        recept.voorverwarmen();
        recept.loskloppen();
        recept.mengen();
        recept.schillen();
        recept.invetten();
        recept.bodemBedekken();
        recept.appelsToevoegen();
        recept.deegRollen();
        recept.deegStroken();
        recept.oven();

    }
}