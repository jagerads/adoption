package com.gerads.adoption;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerads.adoption.enumerations.FamilyMember;
import com.gerads.adoption.enumerations.Video;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/*")
public class HomeController {
	private static final Logger log = Logger.getLogger(HomeController.class);
	
	@RequestMapping
	public String home(Model model) {
		return "home";
	}
	
	@RequestMapping("/aboutUs")
	public String aboutUs(Model model, String name) {
		try {
			if (name != null) {
				FamilyMember member = FamilyMember.fromValue(name);
				
				model.addAttribute("member", member);
				model.addAttribute("descriptions", ControllerHelper.getDescriptionsForFamilyMember(member));
				model.addAttribute("reasons", ControllerHelper.getReasonsForFamilyMember(member));
			
				return "aboutFamily";
			}
		} catch (RuntimeException e) {
			log.error("Caught exception while processing an About Family Member request. Redirecting to About Us.", e);
		}
		
		return "aboutUs";
	}
	
	@RequestMapping("/aboutSite")
	public String aboutSite(Model model) {
		return "aboutSite";
	}
	
	@RequestMapping("/videos")
	public String videos(Model model, String linkText) {
		Video video = Video.OH_BO; // default this.
		
		try {
			if (linkText != null) {
				video = Video.fromLinkText(linkText);
			}
		} catch (RuntimeException e) {
			log.error("Caught exception while processing a video request.", e);
		}
		
		model.addAttribute("loadedVideo", video);
		model.addAttribute("videos", Video.otherVideos(video));

		return "videos";
	}
}
