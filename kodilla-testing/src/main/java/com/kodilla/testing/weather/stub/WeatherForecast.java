package com.kodilla.testing.weather.stub;

import java.awt.geom.Arc2D;
import java.util.Collections;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatureList) {

        this.temperatures = temperatureList;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateMean() {
        double result = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            result += temperature.getValue();
        }
        result = result / temperatures.getTemperatures().entrySet().size();
        return result;
    }

    public double calculateMedian() {
        double median = 0;
        List<Double> valueList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            valueList.add(temperature.getValue());
        }
        Collections.sort(valueList);
        if (valueList.size() % 2 == 0) {
            median = (valueList.get((valueList.size() / 2)) + valueList.get((valueList.size() / 2) - 1)) / 2;
        } else {
            median = valueList.get(valueList.size() / 2);
        }
        return median;
    }
}
