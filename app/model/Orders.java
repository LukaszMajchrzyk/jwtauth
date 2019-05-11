package tk.jewsbar.jwtauth.app.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private Long orders_id;

    @Basic
    private Timestamp date;


    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "storeitem_id")
    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
    private Set<Recip> recip;


    public Long getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Long orders_id) {
        this.orders_id = orders_id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Set<Recip> getRecip() {
        return recip;
    }

    public void setRecip(Set<Recip> recip) {
        this.recip = recip;

    }
}