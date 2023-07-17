package br.com.banco.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Conta {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_conta")
    private Long id;
    @Column(name = "nome_responsavel")
    private String nome;
}
