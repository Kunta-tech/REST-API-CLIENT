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

## OUTPUT
![Output](https://private-user-images.githubusercontent.com/79380857/470540115-d0b9e9a6-836f-4f91-95ef-2f1ec1ddc54b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTMzOTMzOTgsIm5iZiI6MTc1MzM5MzA5OCwicGF0aCI6Ii83OTM4MDg1Ny80NzA1NDAxMTUtZDBiOWU5YTYtODM2Zi00ZjkxLTk1ZWYtMmYxZWMxZGRjNTRiLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTA3MjQlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUwNzI0VDIxMzgxOFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWU5MjM1NjE3MDIzN2JlZGMzZWFjOThiMmRkNGZjNzNhZDYzNTZkNWYyOTNmNGU2ODA3NDY5YTY3NDFjNWFlM2MmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.4aJdcy2DLwpBU0TIjTv-rylVD2a0wjLQBrUe1uI2zRE)

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

