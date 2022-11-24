package uz.tuitfb.market.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "order_detail")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Transient
    private static final String sequence = ("order_detail_sequence");

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = sequence)
    @SequenceGenerator(name = sequence, sequenceName = sequence, allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @Column(name = "quality")
    private Integer integer;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    public OrderDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public OrderDetail(Integer id, Product product, Integer integer) {
        this.id = id;
        this.product = product;
        this.integer = integer;
    }
}
