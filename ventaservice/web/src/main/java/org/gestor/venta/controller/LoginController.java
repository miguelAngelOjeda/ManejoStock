/**
 * 
 */
package org.gestor.venta.controller;

import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Miguel
 *
 */
@Controller
public class LoginController {
	@RequestMapping(value="/login",method=RequestMethod.GET)  
    public String loginForm(Model model){  
        model.addAttribute("user", "");  
        return "/login";  
    }  
      
    @RequestMapping(value="/login",method=RequestMethod.POST)  
    public String login(BindingResult bindingResult,RedirectAttributes redirectAttributes){  
        try {  
            if(bindingResult.hasErrors()){  
                return "/login";  
            }  
            //SecurityUtils.getSubject().login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));  
            return "redirect:/user";  
        } catch (AuthenticationException e) {  
            redirectAttributes.addFlashAttribute("message","");  
            return "redirect:/login";  
        }  
    }  
      
    @RequestMapping(value="/logout",method=RequestMethod.GET)    
    public String logout(RedirectAttributes redirectAttributes ){   
        SecurityUtils.getSubject().logout();    
        redirectAttributes.addFlashAttribute("message", "");    
        return "redirect:/login";  
    }   
      
    @RequestMapping("/403")  
    public String unauthorizedRole(){  
        return "/403";  
    }  
}
