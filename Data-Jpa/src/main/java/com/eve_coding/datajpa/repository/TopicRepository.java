package com.eve_coding.datajpa.repository;

import com.eve_coding.datajpa.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,Long> {
}
