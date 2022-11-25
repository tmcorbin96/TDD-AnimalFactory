package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setName() {
        String expectedCatName = "Jensen";
        Date expectedBirthday = new Date (2000, 9,31);
        Integer expectedId = 10312000;

        Cat cat = new Cat(expectedCatName, expectedBirthday, expectedId);
        String actual = cat.getName();
        Assert.assertEquals(expectedCatName,actual);
    }

    @Test
    public void catSpeakTest() {
        String expectedCatName = "Jensen";
        Date expectedBirthday = new Date (2000, 9, 31);
        Integer expectedId = 10312000;
        String expectedSpeak = "meow!";

        Cat cat = new Cat(expectedCatName, expectedBirthday,expectedId);
        String actual = cat.speak();
        Assert.assertEquals(expectedSpeak,actual);
    }

    @Test
    public void setBirthdayTest() {
        Date expectedBirthday = new Date(2000, 9,31);
        String expectedName = "Jensen";
        Integer expectedId = 10312000;

        Cat cat = new Cat(expectedName,expectedBirthday, expectedId);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expectedBirthday, actual);
    }

    @Test
    public void eatTest() {
        String expectedName = "Jensen";
        Date expectedBirthday = new Date(2000,9,31);
        Integer expectedId = 10312000;

        Cat cat = new Cat(expectedName, expectedBirthday, expectedId);
        Food catFood = new Food();
        cat.eat(catFood);
        Integer expectedFood = cat.getNumberOfMealsEaten();
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expectedFood, actual);

    }

    @Test
    public void catID() {
        String expectedName = "Jensen";
        Date expectedBirthday = new Date(2000,9,31);
        Integer expectedId = 10312000;

        Cat cat = new Cat(expectedName,expectedBirthday,expectedId);
        Integer actual = cat.getId();
        Assert.assertEquals(expectedId,actual);
    }

    @Test
    public void animalInheritanceTest() {
        String expectedName = "Jensen";
        Date expectedBirthday = new Date(2000, 9,31);
        Integer expectedId = 10312000;

        Cat cat = new Cat(expectedName,expectedBirthday,expectedId);
        Assert.assertEquals(cat instanceof Animal, true);
    }

    @Test
    public void mammalInheritanceTest() {
        String expectedName = "Jensen";
        Date expectedBirthday = new Date(2000, 9,31);
        Integer expectedId = 10312000;

        Cat cat = new Cat(expectedName,expectedBirthday, expectedId);
        Assert.assertEquals(cat instanceof Mammal, true);
    }
}
