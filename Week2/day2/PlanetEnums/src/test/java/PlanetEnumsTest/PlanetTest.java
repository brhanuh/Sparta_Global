package PlanetEnumsTest;

import org.example.Planets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlanetTest {
    @Test
    @DisplayName("Testing planet Earth values")
    public void planetEarth(){
        //Testing the name
        String expected = "Earth";
        String actual = Planets.EARTH.getName();
        Assertions.assertEquals(expected, actual);

        //Testing mass
        double eMass = 5.97;
        double mResult = Planets.EARTH.getMass();
        Assertions.assertEquals(eMass, mResult);

        //Testing distance from sun
        double eDistance = 149.6;
        double dResult = Planets.EARTH.getDistanceFromSun();
        Assertions.assertEquals(eDistance, dResult);
    }
    @Test
    @DisplayName("Testing planet Mars values")
    public void planetMars(){
        //Testing the name
        String expected = "Mars";
        String actual = Planets.MARS.getName();
        Assertions.assertEquals(expected, actual);

        //Testing mass
        double eMass = 0.642;
        double mResult = Planets.MARS.getMass();
        Assertions.assertEquals(eMass, mResult);

        //Testing distance from sun
        double eDistance = 228.0;
        double dResult = Planets.MARS.getDistanceFromSun();
        Assertions.assertEquals(eDistance, dResult);
    }
}
