package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Actor;

public interface SpringVaultConfigRepository extends JpaRepository<Actor,Integer>{

}
