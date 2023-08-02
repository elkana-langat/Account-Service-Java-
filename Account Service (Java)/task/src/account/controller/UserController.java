package account.controller;

import account.dto.UserDto;
import account.entity.CustomErrorResponse;
import account.entity.UserModel;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/api/auth")
public class UserController {

    @PostMapping(path = "/signup")
    public ResponseEntity<Object> createUser(@Valid @RequestBody UserModel userModel, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            UserDto userDto = new UserDto();
            userDto.setName(userModel.getName());
            userDto.setLastname(userModel.getLastname());
            userDto.setEmail(userModel.getEmail());

            return new ResponseEntity<>(userDto, HttpStatus.OK);
        } else {
            CustomErrorResponse errorResponse = new CustomErrorResponse();
            errorResponse.setTimestamp(LocalDateTime.now().toString());
            errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
            errorResponse.setError("Bad Request");
            errorResponse.setPath("/api/auth/signup");

            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

        }
    }
}
