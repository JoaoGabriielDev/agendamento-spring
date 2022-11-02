package br.com.scheduler.controllers.mapper.user;

import br.com.scheduler.controllers.user.request.UserCreateRequest;
import br.com.scheduler.models.dto.user.UserCreatedDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRequestMapper {

    UserCreatedDto toCreateUserCreateDto(UserCreateRequest userCreateRequest);
}
