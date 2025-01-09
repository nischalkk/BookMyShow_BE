package dev.project.bookShow.Controller;

import dev.project.bookShow.DTO.UserLoginResponseDto;
import dev.project.bookShow.DTO.UserSignUpReqDto;
import dev.project.bookShow.mapper.UserMapperUtil;
import dev.project.bookShow.model.User;
import dev.project.bookShow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<UserLoginResponseDto> createUser(@RequestBody UserSignUpReqDto userSignUpReqDto){
        User userModel = UserMapperUtil.dtoToModel(userSignUpReqDto);
        userModel = userService.createUser(userModel);
        UserLoginResponseDto dto = UserMapperUtil.modelToDto(userModel);
        return ResponseEntity.ok(dto);
    }
}
