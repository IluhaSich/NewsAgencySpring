package com.example.demo.repository.baseRepository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface BaseCommentRepository<T,ID> extends Repository<T,ID> {
}
