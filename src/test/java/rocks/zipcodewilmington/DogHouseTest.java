package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void add() {
        Dog dog = new Dog("Jared", new Date(), 1);
        Dog dog2 = new Dog("Jensen", new Date(), 2 );
        Dog dog3 = new Dog("Misha", new Date(), 3);

        DogHouse.add(dog);
        DogHouse.add(dog2);
        DogHouse.add(dog3);

        int expected = 3;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);

        DogHouse.clear();
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void remove() {
        Dog dog = new Dog("Jared", new Date(), 1);
        Dog dog2 = new Dog("Jensen", new Date(), 2 );
        Dog dog3 = new Dog("Misha", new Date(), 3);

        DogHouse.add(dog);
        DogHouse.add(dog2);

        DogHouse.remove(2);

        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);

        DogHouse.clear();
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDog() {
        Dog dog = new Dog("Jared", new Date(), 1);
        Dog dog2 = new Dog("Jensen", new Date(), 2 );
        Dog dog3 = new Dog("Misha", new Date(), 3);

        DogHouse.add(dog);
        DogHouse.add(dog2);

        DogHouse.remove(dog2);

        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);

        DogHouse.clear();
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void getDogByID() {
        Dog dog = new Dog("Jared", new Date(), 1);
        Dog dog2 = new Dog("Jensen", new Date(), 2 );
        Dog dog3 = new Dog("Misha", new Date(), 3);

        DogHouse.add(dog);
        DogHouse.add(dog2);
        DogHouse.add(dog3);

        DogHouse.getDogById(1).getName();
        String expected = "Jared";
        String actual = DogHouse.getDogById(1).getName();
        Assert.assertEquals(expected, actual);

        DogHouse.clear();
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
            Dog dog = new Dog("Jared", new Date(), 1);
            Dog dog2 = new Dog("Jensen", new Date(), 2);
            Dog dog3 = new Dog("Misha", new Date(), 3);

            DogHouse.add(dog2);
            int expected = 1;
            int actual = DogHouse.getNumberOfDogs();
            Assert.assertEquals(expected, actual);

            DogHouse.clear();
    }
}
