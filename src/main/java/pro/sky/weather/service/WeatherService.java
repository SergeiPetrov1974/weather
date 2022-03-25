package pro.sky.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private static String WEATHER_SERVICE_URL = "https://api.openweathermap.org/data/2.5/weather?q=moscow&units=metric&appid=5a5dc1fbae7de873e8a9f0167db0a183";

    @Autowired
    private RestTemplate restTemplate;
    public Weather getWeather(String city) {


    }
}
