package flowershop.flowershopweb.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {
//    @Query("SELECT u FROM app_user u WHERE u.email = ?1")
    public Optional<AppUser> findAppUserByEmail(String email);
}
