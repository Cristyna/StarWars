package com.everis.alicante.courses.beca.java_.starwars.game.dao;

import java.util.Map;

import com.everis.alicante.courses.beca.java_.starwars.game.abstractclasses.BattleParticipant;

public interface BattleParticipantDAO {

	Map<String, BattleParticipant> readBP();
	void createBP(BattleParticipant bp);
	void deleteBP(String pname);
}
