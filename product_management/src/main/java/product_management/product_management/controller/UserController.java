package product_management.product_management.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import product_management.product_management.dto.UserDto;
import product_management.product_management.service.UserService;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public ResponseEntity<UserDto> register(@RequestBody @Valid UserDto userDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {

            return ResponseEntity.badRequest().body(userDto);
        }
        UserDto registerUser = userServiceImpl.register(userDto);
        return  ResponseEntity.ok(registerUser);
    }
}
