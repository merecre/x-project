package mrk.klb.example.controller;

import mrk.klb.example.core.model.UserDto;
import mrk.klb.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showRegistrationForm(Model model) {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserDto userDto, Model model) {
        boolean validationError = userService.validateUser(userDto.getUsername());
        if (validationError) {
            model.addAttribute("errorMessage", "User exists");
            return "registration";
        }
        userService.createUser(userDto);
        return "redirect:/login";
    }
}

