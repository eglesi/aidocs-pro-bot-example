/**
 * Service class responsible for generating greeting messages.
 * It provides methods to create personalized greetings based on input names,
 * handling cases where the name is not provided.
 */
/**
 * Service class responsible for generating greeting messages.
 * It provides methods to create personalized greetings based on input,
 * handling cases where the name is not provided.
 */
/**
 * Service class responsible for generating greeting messages.
 * It provides methods to create personalized greetings based on input names,
 * handling cases where the name is not provided.
 */
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
