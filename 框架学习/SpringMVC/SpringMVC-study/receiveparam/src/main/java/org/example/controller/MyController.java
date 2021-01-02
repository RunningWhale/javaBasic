package org.example.controller;

import org.example.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    /**
     * 诸葛接收请求参数：
     * 要求：处理器方法的形参名和请求中参数名必须一致
     */
    @RequestMapping(value = "/receive.do", method = RequestMethod.POST)
    public ModelAndView doSome(Integer age, String name) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("show");
        return mv;
    }

    /**
     * @RequestParam解决逐个接收参数中，参数名形参名不一样的问题
     */
//  表示rname赋值给name，required默认true，表示必须传参  public ModelAndView doSome(@RequestParam( value = "rname",required = false) Integer age, String name) {

    /**
     * 通过对象形式接收参数
     * @param student
     * @return
     */
    @RequestMapping("/receiveObject.do")
    public ModelAndView receiveObject(Student student) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", student.getName());
        mv.addObject("myage", student.getAge());
        mv.addObject("mysex", student.getSex());
        mv.addObject("myheight", student.getHeight());
        mv.setViewName("show");
        return mv;
    }
}
