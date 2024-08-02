package vn.hoidanit.laptopshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min = 2, message = "You have not entered the product name, minimum 2 characters")
    private String proName;

    @NotNull(message = "You have not entered the product price")
    @DecimalMin(value = "0.0", inclusive = false, message = "The product price must be greater than zero")
    private double proPrice;
    private String proImage;
    private String detailDesc;
    private String shortDesc;

    @NotNull(message = "You have not entered the product quantity")
    @Min(value = 0, message = "The product quantity must be greater than or equal to one")
    private long quantity;
    private long sold;
    @NotNull
    @Size(min = 2, message = "You have not selected a manufacturer")
    private String factory;
    private String target;

    // 1 sản phẩm thuộc nhiều chi tiết đơn hàng

    @Override
    public String toString() {
        return "Products [proId=" + id + ", proName=" + proName + ", proPrice=" + proPrice + ", proImage=" + proImage
                + ", detailDesc=" + detailDesc + ", shortDesc=" + shortDesc + ", quantity=" + quantity + ", sold="
                + sold + ", factory=" + factory + ", target=" + target + "]";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }

    public String getProImage() {
        return proImage;
    }

    public void setProImage(String proImage) {
        this.proImage = proImage;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getSold() {
        return sold;
    }

    public void setSold(long sold) {
        this.sold = sold;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

}
