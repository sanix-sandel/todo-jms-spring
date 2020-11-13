package com.sanix.todojms.repository;

import com.sanix.todojms.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, String> {
}
