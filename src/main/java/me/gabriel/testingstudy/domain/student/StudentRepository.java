package me.gabriel.testingstudy.domain.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by daohn on 30/05/2021
 * @author daohn
 * @since 30/05/2021
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

  Optional<Student> findByEmail(String email);

}