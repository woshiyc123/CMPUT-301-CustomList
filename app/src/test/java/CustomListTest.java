import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class CustomListTest {
    static CustomList list;

    @Before
    public void setup(){
        list = new CustomList(null,new ArrayList<City>());

    }
    @Test
    public void addCityTest(){
        City c = new City("Edmonton","AB");
        int size = list.getCount();
        list.addCity(c);
        assertEquals(size+1,list.getCount() );
    }
    @Test
    public void hasCityTest(){
        City city = new City("Edmonton", "Alberta");
        City city1 = new City("Halifax","NS");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(city1));
    }
    @Test
    public void deleteCityTest(){
        City city = new City("Edmonton", "Alberta");
        int listSize = list.getCount();
        list.addCity(city);
        assertEquals(listSize+1,list.getCount());

        list.deleteCity(city);
        assertEquals(0,list.getCount());
    }

}
