package br.com.scheduler.mapper.user;

import br.com.scheduler.models.dto.user.address.AddressCreatedUser;
import br.com.scheduler.models.entity.user.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toAddress(AddressCreatedUser addressCreatedUser);
}
