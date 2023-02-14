# michal_test

Test repo

## weather

Spring Boot app that calls the openweather API for a specified city.

### Input
Both parameters are mandatory
```json
{
    "city": "Bratislava",
    "token": "bce55c9d35af0c920ebbede9bf52aeb5"
}
```

### Curl
```
curl --location --request POST 'localhost:8080/weather' \
--header 'Content-Type: application/json' \
--data-raw '{
    "city": "Bratislava",
    "token": "bce55c9d35af0c920ebbede9bf52aeb5"
}'
```

### Output
```json
{
    "coord": {
        "lon": 17.1067,
        "lat": 48.1482
    },
    "weather": [
        {
            "id": 800,
            "main": "Clear",
            "description": "clear sky",
            "icon": "01n"
        }
    ],
    "base": "stations",
    "main": {
        "temp": 274.72,
        "feels_like": 272.45,
        "temp_min": 272.99,
        "temp_max": 277.58,
        "pressure": 1033,
        "humidity": 80
    },
    "visibility": 10000,
    "wind": {
        "speed": 2.06,
        "deg": 300
    },
    "clouds": {
        "all": 0
    },
    "dt": 1676408923,
    "sys": {
        "type": 2,
        "id": 2044188,
        "country": "SK",
        "sunrise": 1676354461,
        "sunset": 1676391044
    },
    "timezone": 3600,
    "id": 3060972,
    "name": "Bratislava",
    "cod": 200
}
```
### Mandatory parameters not filled in error
```json
{
    "timestamp": "2023-02-14T20:39:15.967+00:00",
    "status": 400,
    "error": "Bad Request",
    "path": "/weather"
}
```

### Implemented features
- Accepts a city name at input of the api
- Returns the response in JSON format
- Tested via Postman

### Missing features
- Output does not follow the given schema