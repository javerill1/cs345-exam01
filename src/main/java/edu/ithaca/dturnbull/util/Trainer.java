package edu.ithaca.dturnbull.util;

public class Trainer {

    private String name;
    private String age;
    private String gender;
    private double height;
    private double weight;

    /**
     * Constructor for creating a new trainer object/user.
     * @param name The name of the trainer
     * @param age The age of the trainer
     * @param gender The gender (male/female) trainer
     * @param height The height of the trainer
     * @param weight The weight of the trainer
     */
    public Trainer(String name, String age, String gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    // Getters for the instance parameters
    public String getName() { return name; }
    public String getAge() { return age; }
    public String getGender() { return gender; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    
    
}

