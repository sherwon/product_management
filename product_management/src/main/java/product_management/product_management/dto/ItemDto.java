package product_management.product_management.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import product_management.product_management.entity.User;
@Data
@AllArgsConstructor
public class ItemDto {
    private  Long id;
    private String productName;
    private User addedBy;
}
