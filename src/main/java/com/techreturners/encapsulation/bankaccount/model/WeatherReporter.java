package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;
    private int HOTTEMP = 30;
    private int COLDTEMP = 10;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String weatherUpdate() {

        double newTemp = convertTemperature(temperature);
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location, checkLocation(), checkTemp(), newTemp);

    }

    public String checkLocation() {
        if (location == "London") {

            return "🌦";

        } else if (location == "California") {

            return "🌅";

        } else if (location == "Cape Town") {

            return "🌤";

        }
        return "🔆";
    }

    public String checkTemp() {
        if (temperature > HOTTEMP) {

            return "It's too hot 🥵!";

        } else if (temperature < COLDTEMP) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

    private double convertTemperature(double celsius) {
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        return fahrenheit;
    }
}
