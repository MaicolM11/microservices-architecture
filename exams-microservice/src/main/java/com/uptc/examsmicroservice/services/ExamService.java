package com.uptc.examsmicroservice.services;

import java.util.List;
import com.uptc.commonsmicroservices.services.CommonService;
import com.uptc.examsmicroservice.entities.Exam;

public interface ExamService extends CommonService<Exam> {
    public List<Exam> findByNameOrLastName(String term);
}
