package com.todo.controller;

import com.todo.pojo.StuGroup;
import com.todo.service.GroupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping("/{groupId}")
	public String groupDetail(@PathVariable("groupId") Integer groupId, Model model) {
		StuGroup group = groupService.getGroupById(groupId);
		if (group == null) {
			model.addAttribute("groupError", "该部门已被删除");
		} else {
			model.addAttribute("group", group);
		}
		return "groupDetail";
	}

	@RequestMapping("/update")
	public String updateGroupInfo(@RequestParam("groupName") String groupName, @RequestParam("groupId") Integer groupId) {
		groupService.updateGroupInfo(groupName, groupId);
		return "redirect:/group/all";
	}

}
