package com.sentinel.smarter.repositories;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface ReadOnlyRepo<T, ID> extends Repository<T, ID> {
    List<T> findAll();
}
