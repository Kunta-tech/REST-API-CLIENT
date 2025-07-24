# REST API CLIENT

This project is a Spring Boot application that fetches weather data from the [wttr.in](https://wttr.in) API based on user-provided locations.

It demonstrates:
- Consuming a public REST API via HTTP
- Parsing complex JSON into Java objects
- Exposing a RESTful endpoint (`weather/{location}`)
- Unit & integration testing with JUnit and MockMvc

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Jackson (for JSON mapping)
- JUnit 5
- MockMvc

---

## 🔧 How It Works

- The application sends an HTTP GET request to `https://wttr.in/{location}?format=j2`
- Parses the JSON response into Java POJOs (`WeatherResponse`, `CurrentCondition`, etc.)
- Returns structured weather data to the client via `/weather/{location}`

---

## 📁 Project Structure

```

src/
├── main/
│   └── java/com/codtech/weatherapi/
│       ├── model/                      # Response model classes (POJOs)
│       ├── WeatherService.java         # Business logic for fetching/parsing data
│       ├── WeatherController.java      # REST controller
│       └── WeatherApiApplication.java  # Spring Boot entry point
│
└── test/
    └── java/com/codtech/weatherapi/
        ├── WeatherapiApplicationTests.java
        └── WeatherControllerTest.java

````

---

## 🧪 Running Tests

```bash
./mvnw test
```

Test coverage includes:

* Unit tests for the service layer
* Integration test for the controller (`GET /{location}`)

---

## 🚀 Running the Application

```bash
./mvnw spring-boot:run
```

Once running, open a browser or use `curl`:

```bash
curl http://localhost:8080/weather/Delhi
```

You'll get a JSON response like:

```json
{
  "current_condition": [
    {
      "temp_C": "31",
      "humidity": "70",
      "weatherDesc": [ { "value": "Partly cloudy" } ],
      ...
    }
  ],
  "nearest_area": [ ... ],
  ...
}
```

---

## 🔍 Example Response

```bash
GET weather/Kolkata
```

Returns current weather details for Kolkata based on `wttr.in` API.

---

## ✅ Deliverables Checklist

* [x] Java app that handles HTTP GET requests
* [x] Parses JSON into Java objects
* [x] RESTful controller to expose endpoint
* [x] Proper exception handling
* [x] Unit & integration tests

---

## 📜 License

MIT

---

