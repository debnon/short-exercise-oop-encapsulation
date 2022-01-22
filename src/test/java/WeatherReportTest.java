import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherReportTest {

    @Test
    public void checkTemperatureCheckReturnsCorrectValueFor15() {

        // arrange
        WeatherReporter testWeatherReporter = new WeatherReporter("London", 15);

        String desiredTempResult = "Ahhh...it's just right \uD83D\uDE0A!";

        // act
        String actualTempResult = testWeatherReporter.checkTemp();

        // assert
        assertEquals(desiredTempResult, actualTempResult);
    }

    @Test
    public void checkTemperatureCheckReturnsCorrectValueForLondon() {

        // arrange
        WeatherReporter testWeatherReporter = new WeatherReporter("London", 15);

        String desiredLocationResult = "🌦";

        // act
        String actualLocationResult = testWeatherReporter.checkLocation();

        // assert
        assertEquals(desiredLocationResult, actualLocationResult);
    }
}
