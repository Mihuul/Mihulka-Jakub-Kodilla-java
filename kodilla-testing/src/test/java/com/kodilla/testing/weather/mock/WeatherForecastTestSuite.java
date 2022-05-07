package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;
    static private Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeAll
    static void addToMap() {
        temperaturesMap.put("Rzeszow", 10.0);
        temperaturesMap.put("Krakow", 10.0);
        temperaturesMap.put("Wroclaw", 10.0);
        temperaturesMap.put("Warszawa", 10.0);
        temperaturesMap.put("Gdansk", 10.0);
    }
    @Test
    void testCalculateForecastWithMock() {
    //Given
    //Temperatures temperaturesMock = mock(Temperatures.class); można tak napisać zamiast @Mock ...
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
    //When
    int quantityOfSensors = weatherForecast.calculateForecast().size();
    //Then
    Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateMean() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        Double meanOfTemperatures = weatherForecast.calculateMean();
        //Then
        Assertions.assertEquals(10, meanOfTemperatures);
    }

    @Test
    void testMedian(){
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double checkMedian = weatherForecast.calculateMedian();
        //Then
        Assertions.assertEquals(10,checkMedian);
    }
}
