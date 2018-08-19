package epam.workshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HiController {

    @GetMapping("/sayHello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/helloFriend")
    public ResponseEntity<String> helloFriend () {
        log.info("Some one said hello");
        return ResponseEntity.ok("Hello friend");
    }
}
