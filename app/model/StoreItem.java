package tk.jewsbar.jwtauth.app.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "storeitem")
public class StoreItem  implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "storeitem_id", unique = true)
    private Long storeitem_id;

    @Basic
    private String name;

    @Basic
    private float quantity;

    @Basic
    private Integer batch;


    @Basic
    private double unit_price;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "recip_id")
    @OneToMany(mappedBy = "storeItem", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Set<Recip> recip;


    public Long getStoreitem_id() {
        return storeitem_id;
    }

    public void setStoreitem_id(Long storeitem_id) {
        this.storeitem_id = storeitem_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }


    public Set<Recip> getRecip() {
        return recip;
    }

    public void setRecip(Set<Recip> recip) {
        this.recip = recip;
    }
}