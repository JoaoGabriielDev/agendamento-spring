package br.com.scheduler.services;

import br.com.scheduler.models.dto.user.UserCreatedDto;
import br.com.scheduler.models.dto.user.UserDto;

public interface UserService {

    UserDto createUserDto(UserCreatedDto userCreatedDto);

    UserDto findByUser(Long id);
}
