package com.yuvaraj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yuvaraj.dao.UserDao;
import com.yuvaraj.model.User;
import com.yuvaraj.validation.CharacterValidation;
import com.yuvaraj.validation.NumberValidation;
@Controller
public class AddController {
    @RequestMapping("/register")
	public ModelAndView register(@RequestParam("name") String name,@RequestParam("lname") String lname,
			        @RequestParam("email") String emailId,@RequestParam("mnum") int mnum,@RequestParam("pass") String pass)throws Exception {
    try {
    	System.out.println("hi");
    //String name=request.getParameter("name").trim();
    System.out.println(name);
   // String lname=(request.getParameter("lname").trim());
    System.out.println(lname);
  //  String emailId= request.getParameter("email").trim();
    System.out.println(emailId);
    //int mnum=Integer.parseInt(request.getParameter("mnum").trim());
    System.out.println(mnum);
   // String pass=request.getParameter("pass").trim();
    System.out.println(pass);
    ModelAndView mv=new ModelAndView();
   

    CharacterValidation val=new CharacterValidation();
    NumberValidation numval=new NumberValidation();
    if(!val.validateCharacter(name)) {
    	 mv.setViewName("index.jsp");
    	 mv.addObject("result", "only characters");
    	 return mv;
    }else if(!val.validateCharacter(lname))
    {
    	 mv.setViewName("index.jsp");
    	 mv.addObject("result1", "only characters");
    	 return mv;
    }else if(!numval.validatenumber(Integer.toString(mnum))) {
    	 mv.setViewName("index.jsp");
    	 mv.addObject("result2","only numbers");
    	 return mv;
    }else if(pass.length()<6) {
    	 mv.setViewName("index.jsp");
    	 mv.addObject("result3", "password shouls be six digit and above");
    	 return mv;
    }else 
    {
    	  User user=new User();
    	    user.setLastName(lname);
    	    user.setEmailId(emailId);
    	    user.setmNum(mnum);
    	    user.setPassword(pass);
    	    UserDao userDao=new UserDao();
    	    userDao.insert(user);
    	    mv.setViewName("login.jsp");
    		 mv.addObject("result", "successfully registered");
    		 return mv;
    }
   
   
    
	
    }
    catch(Exception e) {
    	
    	ModelAndView mv=new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("result", e);
    	return mv;
    }
	}
    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("email") String email,@RequestParam("pass") String pass)throws Exception {
    	ModelAndView mv=new ModelAndView();
		User user =new User();
    	try {
    		if(email==user.getEmailId() & pass==user.getPassword()) {
    			
    			 mv.setViewName("success.jsp");
    			 mv.addObject("result", "successfully login");
    			 return mv;
    		}
    	else {
    		 mv.setViewName("login.jsp");
			 mv.addObject("result", "enter correct password and emailid");
			 return mv;
    	}}
    	catch(Exception e) {
    		mv.setViewName("login.jsp");
			 mv.addObject("result", "exception found");
			 return mv;
   	}
    	
    }
}
