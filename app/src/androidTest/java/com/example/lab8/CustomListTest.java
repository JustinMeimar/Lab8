package com.example.lab8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    public CustomList list;

    public CustomList MockCityList() {
       list = new CustomList(null, new ArrayList < > ());
        return list;
    }
    /**
     * this gets size of the list
     * @return
     */
    public int getCount(){
    }
    /**
     * this adds a city object to the list
     *for the first phase it will be empty
     * @param city
     */
    public void addCity(City city){
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
}
