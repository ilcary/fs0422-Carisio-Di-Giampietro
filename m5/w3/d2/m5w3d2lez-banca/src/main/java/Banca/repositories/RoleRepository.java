package Banca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Banca.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
