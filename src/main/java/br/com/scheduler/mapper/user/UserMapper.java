package br.com.scheduler.mapper.user;

import br.com.scheduler.models.dto.user.UserCreatedDto;
import br.com.scheduler.models.dto.user.UserDto;
import br.com.scheduler.models.entity.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "addresses", ignore = true)
    @Mapping(target = "phones", ignore = true)
    User toUserCreatedDto(UserCreatedDto userCreatedDto);

    UserDto toUserDto(User user);
}
