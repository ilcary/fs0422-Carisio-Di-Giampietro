package com.example.GestioneDispositivi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GestioneDispositivi.Entity.Subscription;
@Repository
public interface SubscriptionRepo extends JpaRepository<Subscription, Long> {

}
