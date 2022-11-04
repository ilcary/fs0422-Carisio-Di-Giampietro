package com.example.GestioneDispositivi.Service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.GestioneDispositivi.Models.Device;
import com.example.GestioneDispositivi.Models.User;
import com.example.GestioneDispositivi.Repository.DeviceRepo;

@Service
public class DeviceService {

	@Autowired
	DeviceRepo dr;
	
	@Autowired
	UserService us;
	
	public Iterable<Device> searchAllDevices(){
		return dr.findAll();
	}
	
	public Page<Device> searchAllDevicesPageable(Pageable p) {
		return dr.findAll(p);
	}
	
	public Device create(Device device) {
		return dr.save(device);
	}
	
	public Device findById(long id) {
		return dr.findById(id).get();
	}
	
	public Device update(long id, Device device) throws Exception {
		Optional<Device> deviceRes = dr.findById(id);
		
		if (deviceRes.isPresent()) {
			Device deviceUp = deviceRes.get();
			deviceUp.setName(device.getName());
			deviceUp.setDeviceStatus(device.getDeviceStatus());
			dr.save(deviceUp);
			return deviceUp;
		}else {
			throw new Exception("failed to update user");
		}
	}
	
	public void delete(long id) {
		dr.deleteById(id);
	}
	
	public void assignDevicetoUser(long userId, long deviceId) throws Exception {
        User userFound = us.findById(userId);
        
        if(userFound != null) {
            Device devFound = findById(deviceId);
            if(devFound != null) {
                userFound.getCompanyDevices().add(devFound);
            }else {
                throw new Exception();
            }
        }else {
            throw new Exception(); 
        }
    }
	
}
