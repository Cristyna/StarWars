package com.everis.alicante.courses.beca.java_.starwars.game.domain;

import com.everis.alicante.courses.beca.java_.starwars.game.abstractclasses.EarthMachine;
import com.everis.alicante.courses.beca.java_.starwars.game.utils.FactionEnum;

public class ATAT extends EarthMachine {

	public ATAT(String id, String pname, Integer hp, Integer power, FactionEnum faction) {
		super();
		this.setId(id);
		this.setPname(pname);
		this.setHp(hp);
		this.setPower(power);
		this.setFaction(faction);

	}

}
