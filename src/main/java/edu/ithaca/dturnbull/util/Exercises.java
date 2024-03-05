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
     * @param machine If the exercise uses a machine or not
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

    // Getters for the instance parameters
        public String getName() { return name; }
        public String getDescription() { return description; }
        public String getDifficultyLevel() { return difficultyLevel; }
        public boolean isWeighted() { return weighted; }
        public String getBodyPart() { return bodyPart; }
        public boolean isMachine() { return machine; }
        public int getSets() { return sets; }
        public int getRepetitions() { return repetitions; }

    /**
     * Checks to see what the difficulty level is
     * @param difficulty the difficulty level
     * @return true if the diffuculty is beginner/intermediate/advanced, false otherwise.
     */
    public boolean selectDifficultyLevel(String difficulty) {
        if (difficulty.equals("beginner")) {
            System.out.println("Beginner difficulty level selected.");
            return true;
        }
        else if (difficulty.equals("intermediate")) {
            System.out.println("Intermediate difficulty level selected.");
            return true;
        }
        else if (difficulty.equals("advanced")) {
            System.out.println("Advanced difficulty level selected.");
            return true;
        }
        else {
            System.out.println("Invalid difficulty level selected.");
            return false;
        }
    }

    /**
     * Checks to if the exercise is weighted or not
     * @param weighted if the exercise is weighted or not
     * @return true if the exercise is weighted, false otherwise.
     */
    public boolean selectWeighted(boolean weighted) {
        if (weighted == true) {
            System.out.println("This exercise is performed with weights.");
            return true;
        } 
        else {
            System.out.println("This exercise is performed without weights.");
            return false;
        }
    }

    /**
     * Checks to see what body part the exercise uses
     * @param bodyPart what body part the exercise uses
     * @return the body part is in the database, invalid otherwise
     */
    public String selectBodyPart(String bodyPart) {
        if ("legs".equals(bodyPart)) {
            return bodyPart;
        }
        else if ("arms".equals(bodyPart)) {
            return bodyPart;
        }
        else if ("core".equals(bodyPart)) {
            return bodyPart;
        }
        else if ("chest".equals(bodyPart)) {
            return bodyPart;
        }
        else if ("back".equals(bodyPart)) {
            return bodyPart;
        }
        else if ("shoulders".equals(bodyPart)) {
            return bodyPart;
        }
        else if ("neck".equals(bodyPart)) {
            return bodyPart;
        }
        else {
            return "Invalid body part selected";
        }
    }

    /**
     * Checks to if the exercise uses a machine or not
     * @param machine if the uses a machine or not
     * @return true if the exercise uses a machine, false otherwise
     */
    public boolean selectMachine(boolean machine) {
        if (machine == true) {
            System.out.println("This exercise is performed with a machine.");
            return true;
        } 
        else {
            System.out.println("This exercise is performed without a machine.");
            return false;
        }
    }

    /**
     * Sets the description for an exercise
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the difficulty Level for an exercise
     */
    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    /**
     * Sets if the exercise is weighted or not
     */
    public void setWeighted(boolean weighted) {
        this.weighted = weighted;
    }

    /**
     * Sets the body part for an exercise
     */
    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    /**
     * Sets if the exercise uses a machine or not
     */
    public void setMachine(boolean machine) {
        this.machine = machine;
    }

    /**
     * Sets the sets for an exercise
     */
    public void setSets(int sets) {
        this.sets = sets;
    }

    /**
     * Sets the repetitions for an exercise
     */
    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }
    
}
