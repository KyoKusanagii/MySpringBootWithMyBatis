package com.max.springboot.service;

import com.max.springboot.bean.EmpVO;
import com.max.springboot.model.EmpMapper;
import com.max.springboot.model.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    public List<EmpVO> getAllEmps(){
        return empMapper.getAllEmps();
    }

    public void delete(String empno){
        empMapper.delete(empno);
    }
}
