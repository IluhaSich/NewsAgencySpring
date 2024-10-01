package com.example.demo.repository.baseRepository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface BaseNewsRepository<T,ID> extends Repository<T, ID> {
}
