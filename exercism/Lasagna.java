public class Lasagna {
    
    final static int TOTAL_MINUTES_IN_OVEN = 40;
    
    public int expectedMinutesInOven(){
        return TOTAL_MINUTES_IN_OVEN;
    } 
    public int remainingMinutesInOven(int lasagnaInOvenInMinutes){
        return expectedMinutesInOven() - lasagnaInOvenInMinutes;
    }
    public int preparationTimeInMinutes(int numberOfLayers){
        return 2*numberOfLayers;
    }
    public int totalTimeInMinutes(int numberOfLayers, int lasagnaInOvenInMinutes){
        return preparationTimeInMinutes(numberOfLayers)+lasagnaInOvenInMinutes;
    }
}