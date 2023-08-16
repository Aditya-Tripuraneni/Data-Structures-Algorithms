import java.util.*;

/* 
! -------------------------------------- Notes --------------------------------------
* Stacks are really good for backtracking algorithms. 
* They are good to keep in mind when working later on in backtracking algorithms
! -----------------------------------------------------------------------------------

*/


public class Main {
    public static void main(String[] args) {
        System.out.println("First line to be printed in the stacks main java file. ");

        Dog milo = new Dog("Milo", 5, "Double-Doodle");

        Dog oslo = new Dog("Oslo", 2, "Golden-Doodle");

        Dog max = new Dog("Max", 2, "Golden-Retriever");

        Stack<Dog> dogStack = new Stack<Dog>(); //LIFO datastructure so last in is the first out 

        dogStack.push(milo); //adds milo as the first one on the stack (bottom one)

        dogStack.push(oslo); //adds Oslo as the new first on the stack, and make milo the second one

        dogStack.push(max); // adds max as the first one, oslo becomes second, and milo becomes third

        // ! our DS now looks like this 1. Max, 2. Oslo, 3. Milo 
        //The last one we added was Max, and that is going to be the first one we pull out when we try to "pop" the stack

        System.out.println(dogStack);  //[Dog@24d46ca6, Dog@4517d9a3, Dog@372f7a8d] because it contains Dog type objects so it stores the objects

        for (int i = 0; i < dogStack.size(); i ++ ){
            System.out.println(dogStack.get(i).getName()); //prints out each of the names in the stack 

            // order would be -- > Milo, Oslo, Max
        }

    

        System.out.println(dogStack.pop().getName());  //removing the top dog on the stack --> Outputs: Max
        //Max would be the first one removed from the stack since he was the last one added, hence this is why its a LIFO DS

        System.out.println(dogStack); //! only contains mILO AND oslo [Dog@24d46ca6, Dog@4517d9a3]

        System.out.println(dogStack.peek().getName()); // --> Oslo , this shows us the top object in our stack in this case Oslo




         

        sortStackByAge(dogStack);



    }

    /*
     * This exercise is to sort a stack based on the dogs age in ascending order. 
     * When peaking this stack, it should return the youngest dog, and the oldest dog should be in the bottom of the stack
     */
    public static Stack<Dog> sortStackByAge(Stack<Dog> dogStack){

        Dog[] dogsAge = new Dog[dogStack.size()]; 

        for (int i = 0; i < dogStack.size(); i ++){ 
            dogsAge[i] = dogStack.get(i);
        }

        dogStack.clear();

        Arrays.sort(dogsAge, Comparator.comparing(Dog::getAge)); // Sorts by dog age

        for (int i = dogsAge.length -1; i >= 0; i --){ 
            dogStack.push(dogsAge[i]);
        }
        
        System.out.println("Printing out the youngest dog: " + dogStack.peek().getAge());

        return dogStack;
    }
}

