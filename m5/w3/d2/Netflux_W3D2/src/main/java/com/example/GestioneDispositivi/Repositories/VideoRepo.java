package com.example.GestioneDispositivi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GestioneDispositivi.Entity.Video;
@Repository
public interface VideoRepo extends JpaRepository<Video, Long>{

}
