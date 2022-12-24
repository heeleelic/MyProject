package com.example.seedStarter.service;

import com.example.seedStarter.entity.SeedStarter;
import com.example.seedStarter.repository.SeedStarterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor //'생성자 주입' 자동 생성.
@Service
public class SeedStarterService {

    private final SeedStarterRepository seedStarterRepository; //데이터베이스 접근.
    public List<SeedStarter> findWithFeature(){
       return this.seedStarterRepository.findWithFeature();
   }
    public List<SeedStarter> findWithDetail(){
        return this.seedStarterRepository.findWithDetail();
    }
}
