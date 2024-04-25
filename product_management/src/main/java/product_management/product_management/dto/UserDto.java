package product_management.product_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String firstName;
    private  String lastName;
    private String email;
    private String password;
    private  String address;
    private int age;
}
