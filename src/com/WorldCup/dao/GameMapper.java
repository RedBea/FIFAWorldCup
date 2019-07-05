package com.WorldCup.dao;


import java.util.List;

import com.WorldCup.pojo.Game;



public interface GameMapper {
	//��ѯ���������Ϣ
	List<Game> queryAllGame();
	
	//ɾ������
	 void deleteGameById(Integer gId);
	 
	 void followGame(Integer gId);
	 
	 void unFollowGame(Integer gId);
	 
	 List<Game> queryFollowGame();
	 
	 //��Ӷ���
	 int insert(Game record);
	 
	  //����Id��ѯ����
	 Game queryGameById(Integer gId);
	    
	//����Id����޸�
	void updateGameById(Game game);
	
	//����Name��ѯ����
	 Game queryGameByName(Integer gName);
	//��ӹ�ע�����
	int followGameById(Game record);
	 
}