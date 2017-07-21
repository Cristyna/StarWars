package com.everis.alicante.courses.beca.java_.starwars.game;

import java.util.Scanner;

import com.everis.alicante.courses.beca.java_.starwars.game.controller.BattleController;

public class BattleMain {
	
	static BattleController controller;

	public static void main(String[] args) {
		
		startApp();
		
	}
	
	private static void startApp() {

		System.out.println("*******************************************************");
		System.out.println("Wellcome to the battle, choose an option: ");
		System.out.println("1:Add warrior ");
		System.out.println("2:Delete warrior ");
		System.out.println("3:List all warriors ");
		System.out.println("4:List rebel warriors ");
		System.out.println("5:List empire warriors ");
		System.out.println("6:PLAY!");

		Scanner in = new Scanner(System.in);
		Integer opcion = in.nextInt();

		System.out.println("Ha elegido la opcion :" + opcion);

		switch (opcion) {
		case 1:
			controller.addBP();
			break;
		case 2:
			controller.deleteBP();
			break;
		case 3:
			//controller.listBP();
			System.out.println("hola");
			break;
		case 4:
			controller.listEmpire();
			break;
		case 5:
			controller.listRebels();
			break;
		case 6:
			controller.play();
			break;
		default:
			System.out.println("Error");
			break;
		}

		startApp();

	}


}
