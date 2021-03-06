package com.sds.playpoll.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sds.playpoll.domain.entity.Survey;
import com.sds.playpoll.domain.entity.User;

@Repository
public interface SurveyRepository extends CrudRepository<Survey, String> {

	List<Survey> findByCreatedBy(User user);

}
