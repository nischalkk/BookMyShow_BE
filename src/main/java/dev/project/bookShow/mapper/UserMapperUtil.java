package dev.project.bookShow.mapper;

import dev.project.bookShow.DTO.UserLoginResponseDto;
import dev.project.bookShow.DTO.UserSignUpReqDto;
import dev.project.bookShow.model.User;

public class UserMapperUtil {

    public static User dtoToModel(UserSignUpReqDto userSignUpReqDto){
        User user = new User();
        user.setName(userSignUpReqDto.getName());
        user.setEmail(userSignUpReqDto.getEmail());
        user.setPassword(userSignUpReqDto.getPassword());
        return user;
    }

    public static UserLoginResponseDto modelToDto(User user){
        UserLoginResponseDto userLoginResponseDto = new UserLoginResponseDto();
        userLoginResponseDto.setName(user.getName());
        userLoginResponseDto.setEmail(user.getEmail());
        return userLoginResponseDto;
    }
}
