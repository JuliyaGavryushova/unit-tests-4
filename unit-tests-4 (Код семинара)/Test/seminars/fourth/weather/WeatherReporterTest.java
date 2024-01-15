package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {
    @Test
    void generateReporterTest() {
        WeatherService weatherService = mock(WeatherService.class);
        when(weatherService.getCurrentTemperature()).thenReturn(26);
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);

        String result = weatherReporter.generateReport();

        assertThat(result).isEqualTo("Текущая температура: " + 26 + " градусов.");
    }

}