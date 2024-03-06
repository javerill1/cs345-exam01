# CS345 - Software Engineering at Ithaca College
## Exam 01 - Project Pitch, UML Diagrams, TDD Coding

Name: Joe Averill
Subject: gym/workout organizer

## Section 1 - Pitch 

I want to create a workout organizer that would provide the user with a formulated workout to perform in the gym. I would create my program for specific body parts like legs, shoulders, arms, and back. Each workout exercise would be assigned specific attributes to help describe their functionality. For example, let's look at the squat exercise. Would it be weighted or not? Would you use dumbbells or the barbell? Would it be on the Smith machine or not? There are so many different exercises to perform so I would try to make this program as specific as I can so the user can select what kind of workout fits his regimen. I would like this to appeal to anyone and everyone because I believe all should be working out but I think that this would appeal most to athletes because they are the target group that uses the gym most frequently. This organizer would be beneficial because it takes a lot of time to gain experience in the gym. This would allow users to instantly become familiarized with the gym and its capabilities.

## Section 2 - UML Diagrams

Link to UML Diagram file for 4 diagrams: 
https://drive.google.com/file/d/1S4Hv442XwWCR_VTLBoP98IXuYlxPGfeX/view?usp=sharing

## Section 3 - Code 
1. My use case involves the trainer adding, editing, and removing an exercise to the list of exercises. The classes and methods that are involved: Trainer(class), addExercise(), editExercise(), removeExercise()
2. The order of methods will be 1.addExercise() 2.editExercise() 3.removeExercise(). They ar ein this order because you have to add an exercise before you can edit it and you have to edit it before it is removed.
3. The integration test is in the TrainerTest file named addEditRemoveExerciseTest().
