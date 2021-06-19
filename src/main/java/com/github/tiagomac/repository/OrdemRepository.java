package com.github.tiagomac.repository;

import javax.enterprise.context.ApplicationScoped;

import com.github.tiagomac.model.Ordem;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class OrdemRepository implements PanacheRepository<Ordem> {
	
	

}
