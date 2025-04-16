package com.example.baibars_case_study_backend.controller

import com.example.baibars_case_study_backend.entity.Telemetry
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.random.Random


@RestController
@RequestMapping("api")
class TelemetryController {


    @GetMapping("/telemetry")
    fun getTelemetry(): Telemetry{
        return Telemetry(
            Math.round(Random.nextDouble(15.5, 18.9) * 10.0) / 10.0,
            altitude = Random.nextInt(100,200),
            gpsCoordinates = "41.015137, 28.979530",
            flightTime = LocalTime.of(0, Random.nextInt(0, 59), Random.nextInt(0, 59))
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        )
    }
}