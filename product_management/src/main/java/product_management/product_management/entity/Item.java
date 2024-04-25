package product_management.product_management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;

import javax.lang.model.element.Name;

@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "product_name")
    private String productName;
    @ManyToOne
    @JoinColumn(name = "added_by", referencedColumnName = "id")
    private User addedBy;
}
