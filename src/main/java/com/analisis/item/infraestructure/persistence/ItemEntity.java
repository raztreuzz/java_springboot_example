package com.analisis.item.infraestructure.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.tool.schema.internal.exec.GenerationTarget;
import org.springframework.context.annotation.Primary;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "item")
public class ItemEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id"
    )
    private Integer id;

    @Column(
            name ="name",
            unique = true,
            length = 75,
            nullable = false)
    private String name;

    @Column(
            name = "salePrice",
            nullable = false,
            precision = 10,
            scale = 2
    )
    private Double salePrice;


    private Boolean active;
}
