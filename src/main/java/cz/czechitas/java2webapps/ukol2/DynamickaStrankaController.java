package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import java.util.List;
import java.util.Random;


@Controller
public class DynamickaStrankaController {
    private final Random random = new Random();

    @GetMapping("/")

    private ModelAndView nahodnyObrazek() {

        int nahodnyObrazekCitat = random.nextInt(4) + 1;

        List<String> citaty = List.of(
                "Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
                "A user interface is like a joke. If you have to explain it, it's not that good.",
                "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
                "I have a joke on programming but it only works on my computer."
        );

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("obrazek", nahodnyObrazekCitat);
        modelAndView.addObject("citaty", citaty.get(nahodnyObrazekCitat));
        return modelAndView;

}

}