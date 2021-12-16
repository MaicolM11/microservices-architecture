package com.uptc.examsmicroservice.services;

import java.util.List;
import com.uptc.commonsmicroservices.services.CommonServiceImpl;
import com.uptc.examsmicroservice.repository.ExamRepository;
import org.springframework.transaction.annotation.Transactional;
import com.uptc.examsmicroservice.entities.Exam;

public class ExamServiceImpl extends CommonServiceImpl<Exam, ExamRepository> implements ExamService {

    @Override
    @Transactional(readOnly = true)
    public List<Exam> findByNameOrLastName(String term) {
        return repository.findByNameOrLastName(term);
    }

}
