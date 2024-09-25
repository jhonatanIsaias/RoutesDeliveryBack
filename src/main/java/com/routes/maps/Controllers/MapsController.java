package com.routes.maps.Controllers;

import com.routes.maps.services.MapsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET})
public class MapsController {

 private final MapsService mapsService;

    @GetMapping("/route")
    public ResponseEntity<String> getRoute(@RequestParam String origin, @RequestParam String destination) {
        String result = mapsService.getRoute(origin, destination);
        return ResponseEntity.ok(result);
    }
}
