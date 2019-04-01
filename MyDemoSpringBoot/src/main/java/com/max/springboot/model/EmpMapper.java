package com.max.springboot.model;

import com.max.springboot.bean.EmpVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {

    @Select("SELECT * FROM EMP2")
    List<EmpVO> getAllEmps();

    @Delete("DELETE FROM EMP2 WHERE EMPNO = #{empno}")
    void delete(String empno);
}
