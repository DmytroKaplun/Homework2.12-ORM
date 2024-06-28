package org.example.entity;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Setter
    private String passport;
    @Setter
    private String name;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", passport='" + passport + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
