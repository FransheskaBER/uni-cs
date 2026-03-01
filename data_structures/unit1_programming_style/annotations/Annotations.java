package unitone.annotations;

public class Annotations {
    /*
     * Annotations are special labels that give the Java compiler extra info
     * about what you intend to do. They also help catch mistakes.
     * 
     * Key ideas:
     * Always start with @
     * Always start with a capital letter @Override
     * Always above what they describe
     * Help catch bugs
     * They are metadata - meaning just info about the code, not the code itself
     */

    // The 2 most common annotations: @Override and @Deprecated

    /* 
    @Override:
    What it does: tells the compiler "I'm replacing a method from my parent class"
    why it helps: If you make a type or get the method signature wrong, the compiler
    lets you know with an error

    @Deprecated:
    what it does: tells other devs "this code is old and shouldn't be used in new projects"
    why it helps: warns people of outdated code so they can use the newer version instead
    */

    // parent class
    public class Animal {
        public void makeSound() {
            System.out.println("Some generic sound");
        }
    }

    // child class
    public class Dog extends Animal {

        @Override // this tells Java: "I am replacing the parent's method"
        public void makeSound() {
            System.out.println("Woof");
        }
    }
    

    public class Calculator {
        
        // old method - i want people stop using it
        @Deprecated
        public int add(int a, int b) {
            return a + b;
        }

        // new improved method with better name
        public int addNumbers(int a, int b) {
            return a + b;
        }
    }
}
