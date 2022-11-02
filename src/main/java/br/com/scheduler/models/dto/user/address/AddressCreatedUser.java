package br.com.scheduler.models.dto.user.address;

import lombok.Data;

@Data
public class AddressCreatedUser {

    private String street;
    private String district;
    private String zipCode;
    private String city;
    private String complement;
    private String uf;
}
