package com.davidedalsanto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidedalsanto.entities.Video;

@Repository
public interface VideoRepo extends JpaRepository<Video, Long>{

}
