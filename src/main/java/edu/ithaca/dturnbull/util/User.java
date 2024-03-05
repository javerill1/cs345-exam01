package edu.ithaca.dturnbull.util;

public class User {

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
    public User(String name, String age, String gender, double height, double weight) {
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

    /**
     * The user inserts what they want in the exercise
     * @param difficultyLevel The difficulty level of the exercise.
     * @param weighted         Whether the exercise involves weights or not.
     * @param bodyPart         The body part targeted by the exercise.
     * @param machine          Whether the exercise requires a machine or not.
     * @return The selected exercise, or null if no matching exercise is found.
     */
    public Exercises selectExercise(String difficultyLevel, boolean weighted, String bodyPart, boolean machine) {
        for (Exercises exercise : allExercises) { // Iterates through all exercises in the database
            if (exercise.getDifficultyLevel().equals(difficultyLevel) && exercise.isWeighted() == weighted && exercise.getBodyPart().equals(bodyPart) && exercise.isMachine() == machine) { // Check if the current exercise matches the provided parameters
                return exercise; // Return exercise if matching exercise is found
            }
        }
        return null; // Return null if no matching exercise is found
    }
    
}