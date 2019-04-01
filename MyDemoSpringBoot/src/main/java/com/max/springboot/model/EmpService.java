package com.max.springboot.model;

import com.max.springboot.bean.EmpVO;

import java.util.List;

public interface EmpService {

    public List<EmpVO> getAllEmps();

    public void delete(String empno);
}
