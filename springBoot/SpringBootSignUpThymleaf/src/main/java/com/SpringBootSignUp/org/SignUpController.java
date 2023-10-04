package com.SpringBootSignUp.org;



import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;    
import org.springframework.stereotype.Controller; 

@Controller    
public class SignUpController   
{    
@RequestMapping("/")    
public String index()  
{    
return"index";    
}    
@RequestMapping(value="/signup", method=RequestMethod.POST)    
public ModelAndView save(@ModelAttribute Signup signup)  
{    
ModelAndView modelAndView = new ModelAndView();    
modelAndView.setViewName("signup");        
modelAndView.addObject("signup", signup);      
return modelAndView;    
}    
}