package pro.sky.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.weather.model.Weather;
import pro.sky.weather.service.WeatherService;
import pro.sky.weather.service.WeatherServiceProduction;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherServiceProduction;

    @GetMapping("/weather/{city}")
    public ResponseEntity<Weather> getWeather(@PathVariable("city") String city) {
        Weather weather = weatherServiceProduction.getWeather(city);
        return ResponseEntity.ok(weather);
    }
}
