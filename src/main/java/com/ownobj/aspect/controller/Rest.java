package com.ownobj.aspect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ownobj.aspect.bean.ParamBean;
import com.ownobj.aspect.service.ChangeParamByAnnoService;
import com.ownobj.aspect.service.ChangeParamService;
import com.ownobj.aspect.service.IdCardUploadService;

@RestController  
public class Rest {  
  
	@Autowired
	private IdCardUploadService idCardUploadService;
	
	@Autowired
	private ChangeParamByAnnoService changeParamByAnnoService;
	
//	@Autowired
//	private ChangeParamService changeParamService;
	
	@Autowired
	@Qualifier("ChangeParamServiceImpl")
	private ChangeParamService changeParamService;
	
	@Autowired
	@Qualifier("ChangeParamServiceImpl2")
	private ChangeParamService changeParamService2;
	
	@Autowired
	@Qualifier("ChangeParamServiceImpl3")
	private ChangeParamService changeParamService3;
	
    @RequestMapping("/first")  
    @ResponseBody
    public Object first() {  
        return "first controller";  
    }  
  
    @RequestMapping("/doError")  
    public Object error() {  
        return 1 / 0;  
    }  
    
    @RequestMapping("/idCardUp")  
    public void idCardUp() {  
        idCardUploadService.Post();  
    }  
    
    @RequestMapping("/change")  
    public Object changeArgs(ParamBean pBean) {  
    	changeParamService.change(pBean);
    	changeParamService2.change(pBean);
    	changeParamService3.change(pBean);
        return "first controller";  
    }
    
    @RequestMapping("/changeBA")  
    public Object changeMethodArgsByAnnotation(ParamBean pBean) {  
    	changeParamByAnnoService.changeByAnno(pBean);
        return "first controller";  
    }
    
    
}  


