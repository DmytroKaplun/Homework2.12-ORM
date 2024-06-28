package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "planets")
@Data
public class Planet {
    @Id
    private String id;
    private String name;
}
