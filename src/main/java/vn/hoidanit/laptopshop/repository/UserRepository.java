package vn.hoidanit.laptopshop.repository;

import org.springframework.stereotype.Repository;
import vn.hoidanit.laptopshop.domain.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//crud : create, read, update, delete
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User dataUser);// hibernate sẽ chuyển câu lệnh save thành các câu lệnh thêm vào bảng trong SQL

    List<User> findByEmail(String email);
}
