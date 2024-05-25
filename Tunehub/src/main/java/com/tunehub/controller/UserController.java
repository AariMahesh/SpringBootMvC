package com.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tunehub.entity.Songs;
import com.tunehub.entity.User;
import com.tunehub.model.LoginData;
import com.tunehub.service.SongsService;
import com.tunehub.service.UserService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
@CrossOrigin("*")
@RestController
public class UserController {
	@Autowired
	UserService us;
	@Autowired
	SongsService ss;
	@PostMapping("/register")
	@ResponseBody
	public String addUser(@ModelAttribute User user)
	{
		// extracting the email value and checking
		boolean ue=us.emailExists(user);
		
		if(ue==false)
		{
			us.insertUser(user);
			System.out.println("User added");
//			String role=user.getRole();
//			if(role.equals("admin"))
//			{
//				return adminHome();
//			}
//			else
//			{
//				return customerHome();
//			}
//			
			
			
		}
		else
		{
			System.out.println("User not added..Try again..");
			//return "faild";
			

		}
		return "login";
		
	}
	@GetMapping("/customerHome")
	public String customerHome() {
		// TODO Auto-generated method stub
		return "customerhome";
	}
    @GetMapping("/adminHome")
	public String adminHome() {
		// TODO Auto-generated method stub
		return "adminhome";
	}

	@PostMapping("/validate")
	public String validateUser(@RequestBody LoginData logindata,HttpSession session,Model model)
	{
		if(us.validUser(logindata.getEmail(),logindata.getPassword())==true)
		{
			session.setAttribute("email", logindata.getEmail());
			
			if(us.getRoleDetails(logindata.getEmail()))
			{
				return "adminhome";
			}
			else
			{
				User user=us.getUser(logindata.getEmail());
				boolean userstatus=user.setIspremium(false);
				List<Songs> fethAllSongs=ss.fetchAllSongs();
				model.addAttribute("songs",fethAllSongs);
				return "customerhome";
			}
			
		}
		else
		{
			return "login";
		}
		
	}
	@GetMapping("/logout")
	public String logOut(HttpSession session)
	{
		session.invalidate();
		return "login";
	}
	
}
