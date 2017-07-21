package com.everis.alicante.courses.beca.java_.starwars.game.controller;

import java.util.Scanner;

import com.everis.alicante.courses.beca.java_.starwars.game.domain.ATAT;
import com.everis.alicante.courses.beca.java_.starwars.game.domain.Destructor;
import com.everis.alicante.courses.beca.java_.starwars.game.domain.Jedi;
import com.everis.alicante.courses.beca.java_.starwars.game.domain.Sith;
import com.everis.alicante.courses.beca.java_.starwars.game.domain.TFighter;
import com.everis.alicante.courses.beca.java_.starwars.game.domain.XWing;
import com.everis.alicante.courses.beca.java_.starwars.game.utils.FactionEnum;

public class BattleControllerImp implements BattleController {

	@Override
	public void addBP() {
		System.out.println("Introduce el nombre del participante:");
		Scanner in= new Scanner (System.in);
		String pname= in.nextLine();
		
		System.out.println("Elige que tipo de participante es:");
		System.out.println("Empire                            Rebel");
		System.out.println("_______________________________________");		
		System.out.println("Warrior                         Warrior");
		System.out.println("1.Sith                           2.Jedi");
		System.out.println("EarthMachine               EarthMachine");
		System.out.println("3.ATAT                     4.Destructor");
		System.out.println("AirMachine                   AirMachine");
		System.out.println("5.TFighter                      6.XWing");
		
		in= new Scanner (System.in);
		int option= in.nextInt();
		String idBP= pname + String.valueOf(1+Math.random()*25); 
		
		switch (option) {
		
		case 1:
			Sith sith= new Sith(idBP,pname,300,300, FactionEnum.EMPIRE);
			break;
		case 2:
			Jedi jedi= new Jedi(idBP,pname,300,300, FactionEnum.REBEL);
			break;
		case 3:
			ATAT atat= new ATAT(idBP,pname,500,500, FactionEnum.EMPIRE);
			break;
		case 4:
			Destructor destructor= new Destructor(idBP,pname,500,500, FactionEnum.REBEL);
			break;
		case 5:
			TFighter tFighter= new TFighter(idBP,pname,700,700, FactionEnum.EMPIRE);
			break;
		case 6:
			XWing xWing= new XWing(idBP,pname,700,700, FactionEnum.REBEL);
			break;

		default:
			
			System.out.println("Not valid option");
			break;
		}

	}

	@Override
	public void deleteBP() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listBP() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listEmpire() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listRebels() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

}
