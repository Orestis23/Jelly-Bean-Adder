package co.grandcircus.assessment6b.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.assessment6b.entity.JellyBean;

public interface JellyBeanRepo extends JpaRepository<JellyBean, Integer>{

}
