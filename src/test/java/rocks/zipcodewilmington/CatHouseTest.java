package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addID() {
        Cat cat = new Cat("Jared", new Date(), 1);
        Cat cat2 = new Cat("Jensen", new Date(), 2 );
        Cat cat3 = new Cat("Misha", new Date(), 3);

        CatHouse.add(cat);
        CatHouse.add(cat2);
        CatHouse.add(cat3);
        int expected = 3;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);

        CatHouse.clear();
    }
    // TODO - Create tests for `void remove(Integer id)`
        @Test
    public void removeID() {
        Cat cat = new Cat("Jared", new Date(), 1);
        Cat cat2 = new Cat("Jensen", new Date(), 2);
        Cat cat3 = new Cat("Misha", new Date(), 3);

        CatHouse.add(cat);
        CatHouse.add(cat2);
        CatHouse.add(cat3);

        CatHouse.remove(1);
        int expected = 2;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
        CatHouse.clear();
        }
    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeCat() {
        Cat cat = new Cat("Jared", new Date(), 1);
        Cat cat2 = new Cat("Jensen", new Date(), 2);
        Cat cat3 = new Cat("Misha", new Date(), 3);

        CatHouse.add(cat);
        CatHouse.remove(cat);

        int expected =0;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByID() {
        Cat cat = new Cat("Jared", new Date(), 1);
        Cat cat2 = new Cat("Jensen", new Date(), 2);
        Cat cat3 = new Cat("Misha", new Date(), 3);

        CatHouse.add(cat);
        CatHouse.add(cat2);
        CatHouse.add(cat3);

        CatHouse.getCatById(1).getName();
        String expected = "Jared";
        String actual = CatHouse.getCatById(1).getName();
        Assert.assertEquals(expected,actual);

        CatHouse.clear();
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCats() {
        Cat cat = new Cat("Jared", new Date(), 1);
        Cat cat2 = new Cat("Jensen", new Date(), 2);
        Cat cat3 = new Cat("Misha", new Date(), 3);

        CatHouse.add(cat2);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);

        CatHouse.clear();
    }
}
