package com.firat.exampleapp.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name_surname")
    private String nameSurname;

    @Column(name = "email")
    private String email;

    @JoinColumn(name = "assignee_user_id")
    @OneToMany(fetch = FetchType.LAZY) //eğer kullanıcıya ait issue'leri görmek istersem diye bu ilişkiyi kullanıyoum
                //bir kullanıcıya bir çok issue bağlanabilir
    private List<Issue> issues; //bir çok issue çağrılacağı için issue'yi list olarak yaratırız.
}
