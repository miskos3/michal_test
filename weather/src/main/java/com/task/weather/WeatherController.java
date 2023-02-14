package com.task.weather;

import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
    @PostMapping(value = "/weather", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getInfo(@Valid @RequestBody WeatherServiceModel weatherServiceModel) {
        String result = callApi(weatherServiceModel.getCity(), weatherServiceModel.getToken());
        return result;
    }

    public String callApi(@RequestParam String city, @RequestParam String token) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + token;
        RestTemplate rt = new RestTemplate();
        return rt.getForObject(url, String.class);
    }
}