package Banca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Banca.entity.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
