package org.example.chat.Entity;

public class Cat {
    private String name;
    private String breed;
    private String favoriteMeal;
    private String birthDate;

    public Cat(String name, String breed, String favoriteMeal, String birthDate) {
        this.name = name;
        this.breed = breed;
        this.favoriteMeal = favoriteMeal;
        this.birthDate = birthDate;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getFavoriteMeal() {
        return favoriteMeal;
    }
    public void setFavoriteMeal(String favoriteMeal) {
        this.favoriteMeal = favoriteMeal;
    }
    public String getBirthDate() {
        return birthDate;
    }
}
