package br.com.scheduler.controllers.user.request;

import br.com.scheduler.models.dto.user.address.AddressCreatedUser;
import br.com.scheduler.models.dto.user.phone.PhoneCreatedUser;
import lombok.Data;

import java.util.List;

@Data
public class UserCreateRequest {

    private String email;
    private String cpfOuCnpj;
    private String accessKey;
    private List<AddressCreatedUser> addresses;
    private List<PhoneCreatedUser> phones;
}
