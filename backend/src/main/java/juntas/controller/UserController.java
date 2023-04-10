package juntas.controller;

import juntas.dto.user.LoginRequestDto;
import juntas.dto.user.LoginResponseDto;
import juntas.dto.user.UserRequestDto;
import juntas.dto.user.UserResponseDto;
import juntas.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public record UserController(IUserService service) {

    @PostMapping("/register")
    public ResponseEntity<UserResponseDto> register(@RequestBody UserRequestDto dto){
        return ResponseEntity.ok(service.register(dto));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto dto){
        return ResponseEntity.ok(service.login(dto));
    }
}
