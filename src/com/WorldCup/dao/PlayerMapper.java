package com.WorldCup.dao;

import java.util.List;

import com.WorldCup.pojo.Player;


public interface PlayerMapper {
	//ע��һ���û�
    int insert(Player record);
	
	//��ѯ��Ա��Ϣ
	List<Player> queryAllPlayer();
	
	//����Idɾ��������Ϣ
    void deletePlayerById(Integer pId);
    
    //����
    void updateLike(Integer pId);
    
    //����Id��ѯ����
    Player queryPlayerById(Integer pId);
    
  //����Id����޸�
    void updatePlayerById(Player player);
}