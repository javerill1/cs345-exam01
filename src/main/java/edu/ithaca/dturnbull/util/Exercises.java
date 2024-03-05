package edu.ithaca.dturnbull.util;

public class Exercises {

    private String name;
    private String description;
    private String difficultyLevel;
    private boolean weighted;
    private String bodyPart;
    private boolean machine;
    private int sets;
    private int repetitions;

    /**
     * Constructor for creating a new exercise object.
     * @param name The name of the exercise
     * @param description The description of the exercise
     * @param difficultyLevel The difficulty level of the exercise
     * @param weighted If the exercise is weighted or not
     * @param bodyPart What body part the exercise uses
     * @param machine If the machine uses a machine or not
     * @param sets How many sets you have for an exercise
     * @param repetitions How many repetitions you have for an exercise
     */
    public Exercises(String name, String description, String difficultyLevel, boolean weighted, String bodyPart, boolean machine, int sets, int repetitions) {
        this.name = name;
        this.description = description;
        this.difficultyLevel = difficultyLevel;
        this.weighted = weighted;
        this.bodyPart = bodyPart;
        this.machine = machine;
        this.sets = sets;
        this.repetitions = repetitions;
    }

    // Getters for the instance variables
        // put getters here
    
    
}
