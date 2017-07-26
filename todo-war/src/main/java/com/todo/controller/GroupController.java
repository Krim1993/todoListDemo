package com.todo.controller;

import com.todo.pojo.StuGroup;
import com.todo.service.GroupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * 添加部门控制器
 * Created by njw20 on 2017/7/26.
 */
@Controller
@RequestMapping("/group")
public class GroupController {

	@Resource
	private GroupService groupService;

	@RequestMapping("/all")
	public String toGroupPage(Model model) {
		List<StuGroup> groups = groupService.listAllGroups();
		model.addAttribute("groups", groups);
		return "addGroup";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addGroup(@RequestParam("groupName") String groupName) {
		groupService.addGroup(groupName);
		return "redirect:/group/all";
	}


}
