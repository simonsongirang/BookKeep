package com.recordkeep.controller;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  
import com.recordkeep.model.Record;  
import com.recordkeep.dao.RecordDAO;

@Controller
public class BookController {  
    @Autowired  
    RecordDAO dao;//will inject dao from xml file  
    
    
    /* It provides list of employees in model object */  
    @RequestMapping("/viewrecord")  
    public ModelAndView viewrecord(){  
        List<Record> list=dao.getRecords();  
        return new ModelAndView("viewrecord","list",list);  
    }  
    
    @RequestMapping("/insertrecord")  
    public ModelAndView showform(){  
        return new ModelAndView("insertrecord","command",new Record());  
    } 
    
    @RequestMapping(value="/debit_save",method = RequestMethod.POST)  
    public ModelAndView debit_save(@ModelAttribute("record") Record record){  
        dao.debit_save(record);  
        return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
    }
    
    @RequestMapping(value="/credit_save",method = RequestMethod.POST)  
    public ModelAndView credit_save(@ModelAttribute("record") Record record){  
        dao.credit_save(record);  
        return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
    }  
    
    
    @RequestMapping(value="/")
    public ModelAndView index() {
        return new ModelAndView("redirect:/viewrecord");
    }
  
    

  
}  