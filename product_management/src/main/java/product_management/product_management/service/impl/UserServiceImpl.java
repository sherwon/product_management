package product_management.product_management.service.impl;

import org.springframework.stereotype.Service;
import product_management.product_management.dto.UserDto;
import product_management.product_management.entity.User;
import product_management.product_management.mapper.UserMapper;
import product_management.product_management.repository.UserRepository;
import product_management.product_management.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto register(UserDto userDto) {
        User user = UserMapper.mapper(userDto);
        User userSave = userRepository.save(user);
        return UserMapper.mapper(userSave);
    }
}
