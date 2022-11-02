package br.com.scheduler.models.entity.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "usuario")
@EqualsAndHashCode(of = "id")
@Data
public class User implements Serializable {

    @Id
    @Column(name = "cod_usuario")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "cpfOuCNPJ")
    private String cpfOuCnpj;

    @Column(name = "senha")
    private String accessKey;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;

    @OneToMany(mappedBy = "user_addresses", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Phone> phones = new ArrayList<>();

    public void addAddress(Address address) {
        address.setUser_addresses(this);
        this.addresses.add(address);
    }
//
    public void addPhones(Phone phone) {
        phone.setUser(this);
        this.phones.add(phone);
    }
}
