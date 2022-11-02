package br.com.scheduler.services;

import br.com.scheduler.models.dto.user.UserCreatedDto;
import br.com.scheduler.models.dto.user.UserDto;
import br.com.scheduler.models.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    UserDto createUserDto(UserCreatedDto userCreatedDto);

    UserDto findByUser(Long id);

    UserDto findAll(Pageable pageable);
}
