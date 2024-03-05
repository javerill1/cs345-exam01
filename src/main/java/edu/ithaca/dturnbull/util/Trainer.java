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

    /**
     * The trainer can create/add a new exercise to the list of existing exercises
     * @param name The name of the exercise
     * @param description The description of the exercise
     * @param difficultyLevel The difficulty level of the exercise
     * @param weighted If the exercise is weighted or not
     * @param bodyPart What body part the exercise uses
     * @param machine If the exercise uses a machine or not
     * @param sets How many sets the exercise has
     * @param repetitions How many repetitions the exercise has
     * @return The added exercise
     */
    public Exercises addExercise(String name, String description, String difficultyLevel, boolean weighted, String bodyPart, boolean machine, int sets, int repetitions) {
        Exercises exerciseToAdd = new Exercises(name, description, difficultyLevel, weighted, bodyPart, machine, sets, repetitions); // create that new exercise
        allExercises.add(exerciseToAdd); // add the exercise the list of exercises
        return exerciseToAdd; // return the exercise that has been added to the list of exercises
    }

    /**
     * The trainer can edit an exercise from the list of available exercises
     * @param name The name of the exercise
     * @param description The description of the exercise
     * @param difficultyLevel The difficulty level of the exercise
     * @param weighted If the exercise is weighted or not
     * @param bodyPart What body part the exercise uses
     * @param machine If the exercise uses a machine or not
     * @param sets How many sets the exercise has
     * @param repetitions How many repetitions the exercise has
     * @return The edited exercise
     */
    public Exercises editExercise(String name, String description, String difficultyLevel, boolean weighted, String bodyPart, boolean machine, int sets, int repetitions) {
        
        for (Exercises exerciseToEdit : allExercises) { // Iterate through the list of exercises
            if (exerciseToEdit.getName().equals(name)) { // ONLY check to see if the name for the actual and edited exercise match
                exerciseToEdit.setDescription(description);
                exerciseToEdit.setDifficultyLevel(difficultyLevel);
                exerciseToEdit.setWeighted(weighted);
                exerciseToEdit.setBodyPart(bodyPart);
                exerciseToEdit.setMachine(machine);
                exerciseToEdit.setSets(sets);
                exerciseToEdit.setRepetitions(repetitions);
                
                return exerciseToEdit; // Return the edited exercise
            }
        }
        return null; // Return null if the exercise does not exist
    }

    /**
     * The trainer can remove an exercise from the list of exercises
     * @param name The name of the exercise
     * @param description The description of the exercise
     * @param difficultyLevel The difficulty level of the exercise
     * @param weighted If the exercise is weighted or not
     * @param bodyPart What body part the exercise uses
     * @param machine If the exercise uses a machine or not
     * @param sets How many sets the exercise has
     * @param repetitions How many repetitions the exercise has
     * @return The removed exercise
     */
    public Exercises removeExercise(String name, String description, String difficultyLevel, boolean weighted, String bodyPart, boolean machine, int sets, int repetitions) {
        Exercises exerciseToRemove = new Exercises(name, description, difficultyLevel, weighted, bodyPart, machine, sets, repetitions); // create and input the attributes of the exercise you would like to remove from the list of existing exercises

        for (Exercises exercise : allExercises) { // Iterate through the list to find the exercise
            if (exercise.equals(exerciseToRemove)) { // Check to see if the all the attributes of the exercises match 
                allExercises.remove(exercise); // Remove the exercise
                return exercise; // Return the removed exercises
            }
        }
        return null; // Return null if the exercise was not found in the list
    }
    
}

