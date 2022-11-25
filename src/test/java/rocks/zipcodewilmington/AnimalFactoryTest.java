package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog() {
        Dog dog = AnimalFactory.createDog("Dean", new Date(2000,10,23));
        String dogName = "Dean";
        Date birthday = new Date(2000, 10,23);

        String actualDog = dog.getName();
        Date actualBirthday = new Date(2000, 10,23);
        Assert.assertEquals(dogName, actualDog);
        Assert.assertEquals(birthday, actualBirthday);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat() {
        Cat cat = AnimalFactory.createCat("Castiel", new Date(2000, 3,12));
        String name = "Castiel";
        Date birthday =new Date(2000, 3,12);

        String actualCat = cat.getName();
        Date acutalBirthday = new Date(2000,3,12);
        Assert.assertEquals(name,actualCat);
        Assert.assertEquals(birthday,acutalBirthday);
    }
}
