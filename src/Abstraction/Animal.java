package Abstraction;

public abstract class Animal {
    public   String FoodType;
    public String animalType;

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String foodType) {
        FoodType = foodType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Animal(String foodType, String animalType) {
        FoodType = foodType;
        this.animalType = animalType;
    }

    void sleep(){
        System.out.println("sleep nicely");
    }


}
