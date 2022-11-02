package br.com.scheduler.controllers.user;


import br.com.scheduler.controllers.mapper.user.UserRequestMapper;
import br.com.scheduler.controllers.user.request.UserCreateRequest;
import br.com.scheduler.models.dto.user.UserCreatedDto;
import br.com.scheduler.models.dto.user.UserDto;
import br.com.scheduler.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/user/")
@RequiredArgsConstructor
public class UserController {

    private final UserRequestMapper userRequestMapper;
    private final UserService userService;

    @PostMapping("create")
    public ResponseEntity<UserDto> createUser(@RequestBody @Valid UserCreateRequest userCreateRequest) {
        UserCreatedDto userCreatedDto = userRequestMapper.toCreateUserCreateDto(userCreateRequest);
        UserDto userDto = userService.createUserDto(userCreatedDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDto> findByUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findByUser(id));
    }

    public ResponseEntity<Object> list(Pageable pageable){
        return ResponseEntity.ok(userService.findAll(pageable));
    }
}
