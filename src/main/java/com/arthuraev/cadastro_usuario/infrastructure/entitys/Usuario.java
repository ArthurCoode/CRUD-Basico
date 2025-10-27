package com.arthuraev.cadastro_usuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)  // Unique quer dizer que o email é unico ou seja nao pode cadastrar dois emails
    private String email;

    @Column(name = "nome")
    private String nome;
}
