package br.com.scheduler.models.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode(of = "id")
@Table(name = "endereco")
@Entity
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_endereco")
    private Long id;

    @Column(name = "rua")
    private String street;

    @Column(name = "bairro")
    private String district;

    @Column(name = "cep")
    private String zipCode;

    @Column(name = "cidade")
    private String city;

    @Column(name = "complemento")
    private String complement;

    @Column(name = "estado")
    private String uf;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cod_usuario")
    private User user_addresses;
}
