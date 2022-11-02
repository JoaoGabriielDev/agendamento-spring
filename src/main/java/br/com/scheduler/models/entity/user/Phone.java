package br.com.scheduler.models.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;


@Data
@EqualsAndHashCode(of = "id")
@Table(name = "telefone")
@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_telefone")
    private Long id;

    @Column(name = "numero")
    private String number;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cod_usuario")
    private User user;
}
