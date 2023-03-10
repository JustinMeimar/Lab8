package com.example.lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    public CustomList list;

    /**
     * this gets size of the list
     * @return
     */
    public int getCount(){
        return 0;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = new CustomList(null, new ArrayList<>());
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void deleteCityTest() {
        list = new CustomList(null, new ArrayList<City>());
        City city = new City("JUSTIN", "CITY");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void hasCityTest() {
        list = new CustomList(null, new ArrayList<City>());
        City city = new City("JUSTIN", "CITY");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(new City("JUSTIN", "CITY")));
    }

    @Test
    public void countCityTest() {
        list = new CustomList(null, new ArrayList<City>());
        list.addCity(new City("JUSTIN ", "MEIMAR"));
        assertEquals(1, list.getCount());
    }
}
