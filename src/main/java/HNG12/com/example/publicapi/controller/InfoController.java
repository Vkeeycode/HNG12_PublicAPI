package HNG12.com.example.publicapi.controller;


import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;



@RestController
@RequestMapping("/api")
public class InfoController {
    @CrossOrigin(origins = "*") // Allow requests from any origin
    @GetMapping("/info")
    public Map<String, String> getInfo() {
        Map<String, String> response = new HashMap<>();

        response.put("email", "chinomsovinfaith@gmail.com");
        response.put("timestamp", Instant.now().toString()); // ISO 8601 format
        response.put("repository", "https://github.com/Vkeeycode/HNG12_PublicAPI.git");

        return response;
    }
}


