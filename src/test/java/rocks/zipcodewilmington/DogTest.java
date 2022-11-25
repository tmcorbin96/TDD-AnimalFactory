package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthday() {
        String name = "Misha";
        Date birthday = new Date(2000,10,1);
        Integer id = 11012000;

        Dog dog = new Dog(name,birthday,id);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(birthday,actual);
    }

    @Test
    public void setName() {
        String name = "Misha";
        Date birthday = new Date(2000, 10,1);
        Integer id = 11012000;

        Dog dog = new Dog(name,birthday,id);
        String actual = dog.getName();
        Assert.assertEquals(name, actual);
    }

    @Test
    public void setID() {
        String name = "Misha";
        Date birthday = new Date(2000,10,1);
        Integer id = 11012000;

        Dog dog = new Dog(name,birthday, id);
        Integer actual = dog.getId();
        Assert.assertEquals(id, actual);
    }

    @Test
    public void speakTest() {
        String name = "Misha";
        Date birthday = new Date(2000,10,1);
        Integer id = 11012000;
        String expectedSpeak = "bark!";

        Dog dog = new Dog(name, birthday, id);
        String actual = dog.speak();
        Assert.assertEquals(expectedSpeak, actual);
    }

    @Test
    public void setMeal() {
        String name = "Misha";
        Date birthday = new Date(2000, 10,1);
        Integer id = 11012000;

        Dog dog = new Dog(name,birthday,id);
        Food food = new Food();
        dog.eat(food);
        Integer meals = dog.getNumberOfMealsEaten();
        Integer actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(meals,actual);
    }
    @Test
    public void dogAnimalInheritance() {
        String name = "Misha";
        Date birthday = new Date(2000,10,1);
        Integer id = 11012000;

        Dog dog = new Dog(name,birthday,id);
        Assert.assertEquals(dog instanceof Animal, true);
    }

    @Test
    public void dogMammalInheritance() {
        String name = "Misha";
        Date birthday = new Date(2000, 10,1);
        Integer id = 11012000;

        Dog dog = new Dog(name, birthday, id);
        Assert.assertEquals(dog instanceof Mammal, true);
    }
}
