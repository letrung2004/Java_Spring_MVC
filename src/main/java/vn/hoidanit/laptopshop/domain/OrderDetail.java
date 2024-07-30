package vn.hoidanit.laptopshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long quantity;
    private double price;
    // order_id
    // một đơn hàng có nhiều chi tiết(1 order hasMany order_detail (1 - N))
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    // product_id
    // 1 product có thể thuộc nhiều order_detail (1 - N)
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;
}
