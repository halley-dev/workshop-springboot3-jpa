package com.educandoweb.course.entities;

import com.educandoweb.course.entities.pk.OrderItemPk;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tb_order_item")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class OrderItem implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private OrderItemPk id;
    private Integer quantity;
    private Double price;
}
