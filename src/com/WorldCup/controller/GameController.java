package com.WorldCup.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WorldCup.pojo.Game;
import com.WorldCup.service.GameService;



@Controller
public class GameController {
	@Autowired
	GameService gameService;
	
	@ResponseBody
	@RequestMapping("queryAllGame")
	public List<Game> queryAllGame(){
		List<Game> list=gameService.queryAllGame();
		return list;
	}
	
	
	@ResponseBody
	@RequestMapping("queryFollowGame")
	public List<Game> queryFollowGame(){
		List<Game> list=gameService.queryFollowGame();
		return list;
	}

	
	@ResponseBody
	@RequestMapping("deleteGameById")
	public String deleteGameById(Integer gId){
		gameService.deleteGameById(gId);
		return "yes";//����ֵyes
	}
	
	
	@ResponseBody
	@RequestMapping("followGame")
	public String followGame(Integer gId){
		gameService.followGame(gId);
		return "yes";//����ֵyes
	}
	
	@ResponseBody
	@RequestMapping("unFollowGame")
	public String unFollowGame(Integer gId){
		gameService.unFollowGame(gId);
		return "yes";//����ֵyes
	}
	
	
	
	@RequestMapping("insertGame")
	public String insertGame(Game game){
		gameService.insertGame(game);
		return "queryAllGame";
	}
	
	
	@RequestMapping("queryGameById")
	public ModelAndView queryGameById(Integer gId){
		Game game = gameService.queryGameById(gId);
		ModelAndView mv = new ModelAndView();
		//��������
		mv.addObject("game",game);
		//ת���Ľ���
		mv.setViewName("updateGame");
		return mv;
	}
	
	
	
	
	
	
	
	@RequestMapping("updateGameById")
	public String updateGameById(Game game){
		gameService.updateGameById(game);
		return "queryAllGame";//��ת���浽queryAllUser.jsp
	}
	
	
	
	
	
	
	
}
