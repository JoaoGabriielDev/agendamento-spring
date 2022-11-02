package br.com.scheduler.mapper.user;

import br.com.scheduler.models.dto.user.phone.PhoneCreatedUser;
import br.com.scheduler.models.entity.user.Phone;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneMapper {

    Phone toPhone(PhoneCreatedUser phoneCreatedUser);
}
