
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    
    public boolean equals (Object compared){
        if (this == compared) {
            return true;
        }

        //determine if object is of same type.
        if (!(compared instanceof Person)) {
            return false;

        }
        
        //typecast to Person object
        Person comparedObject = (Person) compared;
        
        //compare each parameter of the objects. Comparing objects uses the .equals method since objects are refrence types like strings.
        
        if (this.name.equals(comparedObject.name) && 
            this.birthday.equals(comparedObject.birthday) && 
            this.height == comparedObject.height && 
            this.weight == comparedObject.weight){
            return true;
        }
        return false;
    }
}
