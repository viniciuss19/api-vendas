package com.xbrainapi.api.repositories;

import org.springframework.data.repository.CrudRepository;

import com.xbrainapi.api.models.Sale;


public interface SaleRepository extends CrudRepository<Sale, Long> {}