package com.shubhajit.mobileappws.service.impl;

import com.shubhajit.mobileappws.io.entity.AddressEntity;
import com.shubhajit.mobileappws.io.entity.UserEntity;
import com.shubhajit.mobileappws.io.repository.AddressRepository;
import com.shubhajit.mobileappws.io.repository.UserRepository;
import com.shubhajit.mobileappws.service.AddressService;
import com.shubhajit.mobileappws.shared.dto.AddressDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<AddressDto> getAddresses(String userId) {
        List<AddressDto> returnValue = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();

        UserEntity userEntity = userRepository.findByUserId(userId);
        if (userEntity == null) return returnValue;

        List<AddressEntity> addresses = addressRepository.findAllByUserDetails(userEntity);
        for (AddressEntity address : addresses) {
            returnValue.add(modelMapper.map(address, AddressDto.class));
        }

        return returnValue;
    }

    @Override
    public AddressDto getAddress(String addressId) {
        AddressDto returnValue = null;

        AddressEntity addressEntity = addressRepository.findByAddressId(addressId);

        if (addressEntity != null) {
            returnValue = new ModelMapper().map(addressEntity, AddressDto.class);
        }

        return returnValue;
    }
}
