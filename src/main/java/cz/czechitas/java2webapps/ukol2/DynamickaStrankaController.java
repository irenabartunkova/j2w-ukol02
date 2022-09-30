package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import java.util.Random;


@Controller
public class DynamickaStrankaController {
    private final Random random = new Random();

    @GetMapping("/")

    private ModelAndView nahodnyObrazek() {
        int nahodnyObrazek = random.nextInt(4) + 1;

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("obrazek", nahodnyObrazek);
        return modelAndView;



    }
}
