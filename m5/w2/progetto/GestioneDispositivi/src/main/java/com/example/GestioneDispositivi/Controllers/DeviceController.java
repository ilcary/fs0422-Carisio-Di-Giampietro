package com.example.GestioneDispositivi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GestioneDispositivi.Models.Device;
import com.example.GestioneDispositivi.Service.DeviceService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/device")
public class DeviceController {

	@Autowired
	private DeviceService ds;
	
	@GetMapping("")
	public Iterable<Device> searchAllDevices() {
		return ds.searchAllDevices();
	}
	
	@GetMapping("/pageable")
	public ResponseEntity<Page<Device>> findAll(Pageable p) {
		Page<Device> findAll = ds.searchAllDevicesPageable(p);

		if (findAll.hasContent()) {
			return new ResponseEntity<>(findAll, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

	}
	
	@PostMapping("")
	public void create(@RequestBody Device device) {
		try {
			ds.create(device);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
	
	
	@GetMapping("/{id}")
	public Device readById(@PathVariable Long id) {
		try {
			return ds.findById(id);
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}
	
	@PutMapping("")
	public void update(@RequestBody Device device) {
		try {
			ds.update(device.getId(), device);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		try {
			ds.delete(id);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
	
	
}
