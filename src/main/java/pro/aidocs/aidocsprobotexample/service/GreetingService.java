package pro.aidocs.aidocsprobotexample.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Stranger!";
        }
        return "Hello, " + name + "!";
    }
}
