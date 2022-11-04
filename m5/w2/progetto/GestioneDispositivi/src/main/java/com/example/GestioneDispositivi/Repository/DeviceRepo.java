package com.example.GestioneDispositivi.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.GestioneDispositivi.Models.Device;

@Repository
public interface DeviceRepo extends PagingAndSortingRepository<Device, Long>{

}
