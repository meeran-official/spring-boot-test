package com.meeran.my_first_spring_app;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactController {

    private final List<String> awesomeFacts = Arrays.asList(
            "Honey never spoils. Archaeologists have found pots of honey in ancient Egyptian tombs that are over 3,000 years old and still perfectly edible.",
            "A group of flamingos is called a 'flamboyance'.",
            "Octopuses have three hearts and blue blood.",
            "The Eiffel Tower can be 15 cm taller during the summer, due to thermal expansion meaning the iron heats up, the particles gain kinetic energy and take up more space.",
            "A single strand of spaghetti is called a 'spaghetto'.",
            "Bananas are berries, but strawberries aren't.",
            "The total weight of all the ants on Earth is estimated to be similar to, or even greater than, the total weight of all humans on Earth."
    );

    private final Random random = new Random();

    @GetMapping("/api/fact") 
    public String getRandomFact() {
        int randomIndex = random.nextInt(awesomeFacts.size());
        return awesomeFacts.get(randomIndex);
    }
}
