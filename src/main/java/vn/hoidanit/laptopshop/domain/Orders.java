package vn.hoidanit.laptopshop.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double totalPrice;

    // userId;
    // nhieu don hang co the mua boi nguoi dung (many order->one user)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // một đơn hàng có nhiều chi tiết
    @OneToMany(mappedBy = "order")
    List<OrderDetail> orderDetails;

    public long getOrderId() {
        return id;
    }

    public void setOrderId(long orderId) {
        this.id = orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Orders [orderId=" + id + ", totalPrice=" + totalPrice + "]";
    }

}
