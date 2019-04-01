package com.max.springboot.controller;

import com.max.springboot.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/*
    SpringBoot一般推薦使用RestController作註解
    因SpringBoot不支援對於傳統jsp的視圖返回，通常要搭配其他模板
    例如:
    1.FreeMarker
    2.Groovy
    3.Thymeleaf （Spring官網推薦使用此模板引擎,之後會以此模板引擎作介紹）
    4.Velocity
 */

//@RestController
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpServiceImpl empService;

    @RequestMapping(value = "/getAllEmps")
    public String getAllEmps(Map<String,Object> map){
//        ModelAndView mav = new ModelAndView();
        map.put("emps",empService.getAllEmps());
        return "emp";
    }
//    public List<EmpVO> getAllEmps(){
//        return empService.getAllEmps();
//    }

    @RequestMapping(value = "/delete/{empno}")
    public ModelAndView delete(@PathVariable("empno") String empno){
        ModelAndView mav = new ModelAndView();
        empService.delete(empno);
        mav.addObject("emps",empService.getAllEmps());
        mav.setViewName("emp.jsp");
        return mav;
    }
//    public void delete(@PathVariable("empno") String empno){
//        empService.delete(empno);
//    }
}
