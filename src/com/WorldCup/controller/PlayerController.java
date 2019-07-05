package com.WorldCup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WorldCup.pojo.Player;
import com.WorldCup.service.PlayerService;


@Controller
public class PlayerController {
	@Autowired
	PlayerService playerService;
	
	@RequestMapping("insertPlayer")
	public String insertPlayer(Player player){
		playerService.insertPlayer(player);
		return "queryAllPlayer";
	}
	
	//��ѯ������Ա��Ϣ
	@ResponseBody
	@RequestMapping("queryAllPlayer")
	public List<Player> queryAllPlayer(){
		System.out.println("123");
		List<Player> list=playerService.queryAllPlayer();
		return list;
	}
	
	//����IDɾ��������Ϣ
	@ResponseBody
	@RequestMapping("deletePlayerById")
	public String deletePlayerById(Integer pId){
		playerService.deletePlayerById(pId);
		return "yes";//����ֵyes
	}
	
	//����
	@RequestMapping("updateLike")
	public ModelAndView updateLike(Integer pId){
		playerService.updateLike(pId);
		Player player = playerService.queryPlayerById(pId);
		System.out.println(pId+"ssssssssss");
		//��������
		ModelAndView mv=new ModelAndView();
		mv.setViewName("player");
		mv.addObject("player", player);
		
		return mv;
	}
	
	@RequestMapping("queryPlayerById")
	public ModelAndView queryPlayerById(Integer pId){
		Player player = playerService.queryPlayerById(pId);
		ModelAndView mv = new ModelAndView();
		//��������
		mv.addObject("player",player);
		//ת���Ľ���
		mv.setViewName("updataPlayer");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("queryPlayerById2")
	public ModelAndView queryPlayerById2(Integer pId){
		System.out.println("*********"+pId);
		Player player = playerService.queryPlayerById(pId);
		ModelAndView mv = new ModelAndView();
		//��������
		mv.addObject("player",player);
		//ת���Ľ���
		mv.setViewName("player");
		return mv;
	}
	
	@RequestMapping("updatePlayerById")
	public String updatePlayerById(Player player){
		playerService.updatePlayerById(player);
		return "queryAllPlayer";//��ת���浽queryAllPlayer.jsp
	}
}