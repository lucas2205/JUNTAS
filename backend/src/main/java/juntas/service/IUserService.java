package juntas.service;

import juntas.dto.user.LoginRequestDto;
import juntas.dto.user.LoginResponseDto;
import juntas.dto.user.UserRequestDto;
import juntas.dto.user.UserResponseDto;
import juntas.model.User;

public interface IUserService {

    UserResponseDto register(UserRequestDto dto);
    LoginResponseDto login(LoginRequestDto dto);

    User findByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByDni(Integer dni);
}
