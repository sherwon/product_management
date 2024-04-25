package product_management.product_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import product_management.product_management.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
