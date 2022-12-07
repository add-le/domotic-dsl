public class CMaisonUser extends CMaison {
	public CMaisonUser() {
		super();


		//Déclaration des appareils
		CEclairage e1 = new CEclairage("e1",TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e1);
		CEclairage e2 = new CEclairage("e2",TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e2);
		CEclairage e3 = new CEclairage("e3",TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e3);
		CVoletFenetre v1 = new CVoletFenetre("v1",TypeAppareil.VOLET);
		ma_liste_appareils.add(v1);
		CVoletFenetre e2 = new CVoletFenetre("e2",TypeAppareil.VOLET);
		ma_liste_appareils.add(e2);
		CVoletFenetre e3 = new CVoletFenetre("e3",TypeAppareil.VOLET);
		ma_liste_appareils.add(e3);
		CVoletFenetre v4 = new CVoletFenetre("v4",TypeAppareil.VOLET);
		ma_liste_appareils.add(v4);
		CAutreAppareil e3 = new CAutreAppareil("e3",TypeAppareil.AUTRE_APPAREIL_HIFI);
		ma_liste_appareils.add(e3);
		CChauffage r1 = new CChauffage("r1",TypeAppareil.CHAUFFAGE);
		ma_liste_appareils.add(r1);
		CChauffage rad1 = new CChauffage("rad1",TypeAppareil.CHAUFFAGE);
		ma_liste_appareils.add(rad1);
		CAlarme a1 = new CAlarme("a1",TypeAppareil.ALARME);
		ma_liste_appareils.add(a1);
		CAlarme a2 = new CAlarme("a2",TypeAppareil.ALARME);
		ma_liste_appareils.add(a2);
		CAlarme a1 = new CAlarme("a1",TypeAppareil.ALARME);
		ma_liste_appareils.add(a1);
		CVoletFenetre v5 = new CVoletFenetre("v5",TypeAppareil.VOLET);
		ma_liste_appareils.add(v5);
		CAutreAppareil cafe = new CAutreAppareil("cafe",TypeAppareil.AUTRE_APPAREIL_CAFE);
		ma_liste_appareils.add(cafe);

		//Déclaration des interfaces
		CInterface b1 = new CInterface("b1", TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b1);
		CInterface b3 = new CInterface("b3", TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b3);
		CInterface zap = new CInterface("zap", TypeInterface.TELECOMMANDE);
		ma_liste_interfaces.add(zap);
		CInterface a2 = new CInterface("a2", TypeInterface.TELECOMMANDE);
		ma_liste_interfaces.add(a2);
		CInterface b2 = new CInterface("b2", TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b2);

		//Déclaration des scenarii
		String bonjour_contenu = 
"for(CAppareil appareil1 : this.l_appareils)\n" +
"if(appareil1.typeAppareil.equals(TypeAppareil.VOLET))\n" +
"appareil1.appliquer(TypeActionAppareil.OUVRIR);\n" +
"for(CAppareil appareil2: this.l_appareils)" +
"if(appareil2.getNomAppareil().equals(\"a1\"))\n" +
"appareil2.appliquer(TypeActionAppareil.ETEINDRE);\n" +
"for(CAppareil appareil3: this.l_appareils)" +
"if(appareil3.getNomAppareil().equals(\"cafe\"))\n" +
"appareil3.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil4: this.l_appareils)" +
"if(appareil4.getNomAppareil().equals(\"rad1\"))\n" +
"if(appareil4.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {\n" +
"for(CAppareil appareil5 : this.l_appareils)\n" +
"if(appareil5.getNomAppareil().equals(\"rad1\"))\n" +
"appareil5.appliquer(TypeActionAppareil.ALLUMER);\n" +
"}\n" +
"for(CAppareil appareil6: this.l_appareils)" +
"if(appareil6.getNomAppareil().equals(\"hf\"))\n" +
"appareil6.appliquer(TypeActionAppareil.ALLUMER);\n" ;

		CScenario bonjour = new CScenario("bonjour", bonjour_contenu);
		ma_liste_scenarios.add(bonjour);
		String rad1_contenu = 
"for(CAppareil appareil1 : this.l_appareils)\n" +
"if(appareil1.typeAppareil.equals(TypeAppareil.VOLET))\n" +
"appareil1.appliquer(TypeActionAppareil.OUVRIR);\n" +
"for(CAppareil appareil2: this.l_appareils)" +
"if(appareil2.getNomAppareil().equals(\"a1\"))\n" +
"appareil2.appliquer(TypeActionAppareil.ETEINDRE);\n" +
"for(CAppareil appareil3: this.l_appareils)" +
"if(appareil3.getNomAppareil().equals(\"cafe\"))\n" +
"appareil3.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil4: this.l_appareils)" +
"if(appareil4.getNomAppareil().equals(\"rad1\"))\n" +
"if(appareil4.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {\n" +
"for(CAppareil appareil5 : this.l_appareils)\n" +
"if(appareil5.getNomAppareil().equals(\"rad1\"))\n" +
"appareil5.appliquer(TypeActionAppareil.ALLUMER);\n" +
"}\n" +
"for(CAppareil appareil6: this.l_appareils)" +
"if(appareil6.getNomAppareil().equals(\"hf\"))\n" +
"appareil6.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil7: this.l_appareils)" +
"if(appareil7.getNomAppareil().equals(\"e1\"))\n" +
"appareil7.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil8: this.l_appareils)" +
"if(appareil8.getNomAppareil().equals(\"cafe\"))\n" +
"appareil8.appliquer(TypeActionAppareil.ETEINDRE);\n" ;

		CScenario rad1 = new CScenario("rad1", rad1_contenu);
		ma_liste_scenarios.add(rad1);
		String bonjour_contenu = 
"for(CAppareil appareil1 : this.l_appareils)\n" +
"if(appareil1.typeAppareil.equals(TypeAppareil.VOLET))\n" +
"appareil1.appliquer(TypeActionAppareil.OUVRIR);\n" +
"for(CAppareil appareil2: this.l_appareils)" +
"if(appareil2.getNomAppareil().equals(\"a1\"))\n" +
"appareil2.appliquer(TypeActionAppareil.ETEINDRE);\n" +
"for(CAppareil appareil3: this.l_appareils)" +
"if(appareil3.getNomAppareil().equals(\"cafe\"))\n" +
"appareil3.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil4: this.l_appareils)" +
"if(appareil4.getNomAppareil().equals(\"rad1\"))\n" +
"if(appareil4.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {\n" +
"for(CAppareil appareil5 : this.l_appareils)\n" +
"if(appareil5.getNomAppareil().equals(\"rad1\"))\n" +
"appareil5.appliquer(TypeActionAppareil.ALLUMER);\n" +
"}\n" +
"for(CAppareil appareil6: this.l_appareils)" +
"if(appareil6.getNomAppareil().equals(\"hf\"))\n" +
"appareil6.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil7: this.l_appareils)" +
"if(appareil7.getNomAppareil().equals(\"e1\"))\n" +
"appareil7.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil8: this.l_appareils)" +
"if(appareil8.getNomAppareil().equals(\"cafe\"))\n" +
"appareil8.appliquer(TypeActionAppareil.ETEINDRE);\n" +
"for(CAppareil appareil9: this.l_appareils)" +
"if(appareil9.getNomAppareil().equals(\"a1\"))\n" +
"if(appareil9.etatAppareil.equals(TypeEtatAppareil.ALLUME)) {\n" +
"System.out.println(message);\n" +
"}\n" ;

		CScenario bonjour = new CScenario("bonjour", bonjour_contenu);
		ma_liste_scenarios.add(bonjour);
		String test3_contenu = 
"for(CAppareil appareil1 : this.l_appareils)\n" +
"if(appareil1.typeAppareil.equals(TypeAppareil.VOLET))\n" +
"appareil1.appliquer(TypeActionAppareil.OUVRIR);\n" +
"for(CAppareil appareil2: this.l_appareils)" +
"if(appareil2.getNomAppareil().equals(\"a1\"))\n" +
"appareil2.appliquer(TypeActionAppareil.ETEINDRE);\n" +
"for(CAppareil appareil3: this.l_appareils)" +
"if(appareil3.getNomAppareil().equals(\"cafe\"))\n" +
"appareil3.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil4: this.l_appareils)" +
"if(appareil4.getNomAppareil().equals(\"rad1\"))\n" +
"if(appareil4.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {\n" +
"for(CAppareil appareil5 : this.l_appareils)\n" +
"if(appareil5.getNomAppareil().equals(\"rad1\"))\n" +
"appareil5.appliquer(TypeActionAppareil.ALLUMER);\n" +
"}\n" +
"for(CAppareil appareil6: this.l_appareils)" +
"if(appareil6.getNomAppareil().equals(\"hf\"))\n" +
"appareil6.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil7: this.l_appareils)" +
"if(appareil7.getNomAppareil().equals(\"e1\"))\n" +
"appareil7.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil8: this.l_appareils)" +
"if(appareil8.getNomAppareil().equals(\"cafe\"))\n" +
"appareil8.appliquer(TypeActionAppareil.ETEINDRE);\n" +
"for(CAppareil appareil9: this.l_appareils)" +
"if(appareil9.getNomAppareil().equals(\"a1\"))\n" +
"if(appareil9.etatAppareil.equals(TypeEtatAppareil.ALLUME)) {\n" +
"System.out.println(message);\n" +
"}\n" +
"for(CAppareil appareil10 : this.l_appareils)\n" +
"if(appareil10.typeAppareil.equals(TypeAppareil.VOLET))\n" +
"for(CAppareil appareil11: this.l_appareils)" +
"if(appareil11.getNomAppareil().equals(\"v\"))\n" +
"appareil10.appliquer(TypeActionAppareil.OUVRIR);\n" +
"for(CAppareil appareil12 : this.l_appareils)\n" +
"if(appareil12.getNomAppareil().equals(\"cafe\"))\n" +
"appareil12.appliquer(TypeActionAppareil.ETEINDRE);\n" ;

		CScenario test3 = new CScenario("test3", test3_contenu);
		ma_liste_scenarios.add(test3);
		String test4_contenu = 
"for(CAppareil appareil1 : this.l_appareils)\n" +
"if(appareil1.typeAppareil.equals(TypeAppareil.VOLET))\n" +
"appareil1.appliquer(TypeActionAppareil.OUVRIR);\n" +
"for(CAppareil appareil2: this.l_appareils)" +
"if(appareil2.getNomAppareil().equals(\"a1\"))\n" +
"appareil2.appliquer(TypeActionAppareil.ETEINDRE);\n" +
"for(CAppareil appareil3: this.l_appareils)" +
"if(appareil3.getNomAppareil().equals(\"cafe\"))\n" +
"appareil3.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil4: this.l_appareils)" +
"if(appareil4.getNomAppareil().equals(\"rad1\"))\n" +
"if(appareil4.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {\n" +
"for(CAppareil appareil5 : this.l_appareils)\n" +
"if(appareil5.getNomAppareil().equals(\"rad1\"))\n" +
"appareil5.appliquer(TypeActionAppareil.ALLUMER);\n" +
"}\n" +
"for(CAppareil appareil6: this.l_appareils)" +
"if(appareil6.getNomAppareil().equals(\"hf\"))\n" +
"appareil6.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil7: this.l_appareils)" +
"if(appareil7.getNomAppareil().equals(\"e1\"))\n" +
"appareil7.appliquer(TypeActionAppareil.ALLUMER);\n" +
"for(CAppareil appareil8: this.l_appareils)" +
"if(appareil8.getNomAppareil().equals(\"cafe\"))\n" +
"appareil8.appliquer(TypeActionAppareil.ETEINDRE);\n" +
"for(CAppareil appareil9: this.l_appareils)" +
"if(appareil9.getNomAppareil().equals(\"a1\"))\n" +
"if(appareil9.etatAppareil.equals(TypeEtatAppareil.ALLUME)) {\n" +
"System.out.println(message);\n" +
"}\n" +
"for(CAppareil appareil10 : this.l_appareils)\n" +
"if(appareil10.typeAppareil.equals(TypeAppareil.VOLET))\n" +
"for(CAppareil appareil11: this.l_appareils)" +
"if(appareil11.getNomAppareil().equals(\"v\"))\n" +
"appareil10.appliquer(TypeActionAppareil.OUVRIR);\n" +
"for(CAppareil appareil12 : this.l_appareils)\n" +
"if(appareil12.getNomAppareil().equals(\"cafe\"))\n" +
"appareil12.appliquer(TypeActionAppareil.ETEINDRE);\n" +
"for(CAppareil appareil13 : this.l_appareils)\n" +
"if(appareil13.typeAppareil.equals(TypeAppareil.VOLET))\n" +
"appareil13.appliquer(TypeActionAppareil.OUVRIR);\n" +
"for(CAppareil appareil14: this.l_appareils)" +
"if(appareil14.getNomAppareil().equals(\"cafe\"))\n" +
"appareil14.appliquer(TypeActionAppareil.ETEINDRE);\n" +
"for(CAppareil appareil15: this.l_appareils)" +
"if(appareil15.getNomAppareil().equals(\"e1\"))\n" +
"appareil15.appliquer(TypeActionAppareil.OUVRIR);\n" ;

		CScenario test4 = new CScenario("test4", test4_contenu);
		ma_liste_scenarios.add(test4);

		//Déclaration des commandes
		b1.addScenarioAssocie("bonjour");
		b4.addScenarioAssocie("test4");
		b3.addScenarioAssocie("toto");
		CProgrammation p1 = new CProgrammation("soiree");
		p1.addDate(new CDate(40,1,1,18,0));
		ma_liste_programmations.add(p1);
		CProgrammation p2 = new CProgrammation("soiree");
		p2.addDate(new CDate(9999,1,1,18,0));
		ma_liste_programmations.add(p2);
		CProgrammation p3 = new CProgrammation("soiree");
		p3.addDate(new CDate(2018,0,1,18,10));
		ma_liste_programmations.add(p3);
		CProgrammation p4 = new CProgrammation("soiree");
		p4.addDate(new CDate(2018,13,1,18,0));
		ma_liste_programmations.add(p4);
		CProgrammation p5 = new CProgrammation("soiree");
		p5.addDate(new CDate(2019,1,0,18,10));
		ma_liste_programmations.add(p5);
		CProgrammation p6 = new CProgrammation("soiree");
		p6.addDate(new CDate(2019,3,32,18,0));
		ma_liste_programmations.add(p6);
		CProgrammation p7 = new CProgrammation("soiree");
		p7.addDate(new CDate(2019,4,31,18,0));
		ma_liste_programmations.add(p7);
		CProgrammation p8 = new CProgrammation("soiree");
		p8.addDate(new CDate(2019,2,30,18,0));
		ma_liste_programmations.add(p8);
		CProgrammation p9 = new CProgrammation("soiree");
		p9.addDate(new CDate(2019,2,29,18,0));
		ma_liste_programmations.add(p9);
		CProgrammation p10 = new CProgrammation("soiree");
		p10.addDate(new CDate(2018,12,24,19,0));
		ma_liste_programmations.add(p10);
		CProgrammation p11 = new CProgrammation("soiree");
		p11.addDate(new CDate(2017,-1,1,25,0));
		ma_liste_programmations.add(p11);
		CProgrammation p12 = new CProgrammation("soiree");
		p12.addDate(new CDate(2017,3,-1,18,70));
		ma_liste_programmations.add(p12);
		monHabitat = new HabitatSpecific(ma_liste_appareils, ma_liste_ens_appareils, ma_liste_scenarios, ma_liste_interfaces, ma_liste_programmations);
	}
}
