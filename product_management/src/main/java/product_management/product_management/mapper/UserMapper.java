package product_management.product_management.mapper;

import product_management.product_management.dto.UserDto;
import product_management.product_management.entity.User;

public class UserMapper {
    public  static User mapper(UserDto userDto) {
        return new User(
                    userDto.getId(),
                    userDto.getFirstName(),
                    userDto.getLastName(),
                    userDto.getEmail(),
                    userDto.getPassword(),
                    userDto.getAddress(),
                    userDto.getAge()
        );
    }

    public  static UserDto mapper(User user) {
        return new UserDto(
                    user.getId(),
                    user.getFirstName(),
                    user.getLastName(),
                    user.getEmail(),
                    user.getPassword(),
                    user.getAddress(),
                    user.getAge()
        );
    }
}
