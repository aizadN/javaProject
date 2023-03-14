package objects;

public class WaterTracker {

    int consumedWater;

    int dailyWaterGoal = 2000;


    public void addWater(int milliliters){
        //This method should add the given amount of water (in milliliters) to the total water intake for the day.
        if (milliliters > 0){
            System.out.println("You just drink " + milliliters + "ml of water");
            consumedWater += milliliters;
        }
        else {
            System.out.println("Consumed amount of water can be only positive number");
        }
    }

    public int getWaterIntake(){
        //This method should return the total water intake for the day (in milliliters).
        return consumedWater;
    }

    public String getStatus(){
        //This method should return a string that describes the current status of the user's water intake. The string should be one of the following:
        //"You are hydrated!" if the user has consumed at least 2000 milliliters of water for the day.
        //"You need to drink more water." if the user has consumed less than 2000 milliliters of water for the day.
        if (consumedWater >= dailyWaterGoal){
            return "You are hydrated!";
        }
        else {
            return "You need to drink " + (dailyWaterGoal - consumedWater) + "ml of water";
        }
    }

    public void reset(){
        consumedWater = 0;
    }

    public void setWaterGoal(int waterGoalAmount){
        if (waterGoalAmount > 2000){
            System.out.println("You set a new daily water consumption limit");
            dailyWaterGoal = waterGoalAmount;
        }
        else {
            System.out.println("The amount of water should be more than 2000 ml");
        }
    }



    public static void main(String[] args) {
        WaterTracker waterTracker1 = new WaterTracker();
        waterTracker1.addWater(500);
        System.out.println(waterTracker1.getWaterIntake());
        waterTracker1.addWater(1000);
        System.out.println(waterTracker1.getWaterIntake());
        System.out.println(waterTracker1.getStatus());
        waterTracker1.addWater(500);
        System.out.println(waterTracker1.getStatus());

        waterTracker1.addWater(-500);




    }


}











