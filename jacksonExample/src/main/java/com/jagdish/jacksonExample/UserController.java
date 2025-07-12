package com.jagdish.jacksonExample;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // Receive JSON (Deserialize) and return response
    @PostMapping
    public String createUser(@RequestBody User user) {
        return "User received: ID = " + user.getUserId() + ", Name = " + user.getFirstName();
    }

    // Return JSON (Serialize)
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return new User(id, "Alice", "alice@example.com");
    }
}
