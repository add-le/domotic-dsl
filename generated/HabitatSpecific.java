import java.util.ArrayList;
public class HabitatSpecific extends Habitat {
	public HabitatSpecific(ArrayList<CAppareil> lapp, ArrayList<CEnsAppareil> lens, ArrayList<CScenario> lscen, ArrayList<CInterface> lint, ArrayList<CProgrammation> lprog) {
		super(lapp, lens, lscen, lint, lprog);
	}

	public void execScenarioNum(int num) {
		System.out.println("Execution du scenario " + this.l_scenarios.get(num).getNomScenario() + "...");
		switch(num) {
			case 0:
				for(CAppareil appareil1 : this.l_appareils)
				if(appareil1.typeAppareil.equals(TypeAppareil.VOLET))
				{
				appareil1.appliquer(TypeActionAppareil.OUVRIR);
				}
				for(CAppareil appareil2: this.l_appareils)
				if(appareil2.getNomAppareil().equals("a1"))
				appareil2.appliquer(TypeActionAppareil.ETEINDRE);
				for(CAppareil appareil3: this.l_appareils)
				if(appareil3.getNomAppareil().equals("cafe"))
				appareil3.appliquer(TypeActionAppareil.ALLUMER);
				for(CAppareil appareil4: this.l_appareils)
				if(appareil4.getNomAppareil().equals("rad1"))
				if(appareil4.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {
				for(CAppareil appareil5 : this.l_appareils)
				if(appareil5.getNomAppareil().equals("rad1"))
				appareil5.appliquer(TypeActionAppareil.ALLUMER);
				}
				for(CAppareil appareil6: this.l_appareils)
				if(appareil6.getNomAppareil().equals("hf"))
				appareil6.appliquer(TypeActionAppareil.ALLUMER);
			break;

			case 1:
				for(CAppareil appareil7: this.l_appareils)
				if(appareil7.getNomAppareil().equals("e1"))
				appareil7.appliquer(TypeActionAppareil.ALLUMER);
				for(CAppareil appareil8: this.l_appareils)
				if(appareil8.getNomAppareil().equals("cafe"))
				appareil8.appliquer(TypeActionAppareil.ETEINDRE);
			break;

			case 2:
				for(CAppareil appareil9: this.l_appareils)
				if(appareil9.getNomAppareil().equals("a1"))
				if(appareil9.etatAppareil.equals(TypeEtatAppareil.ALLUME)) {
				System.out.println(appareil9.getNomAppareil()+" allumee ");
				}
			break;

			case 3:
				for(CAppareil appareil10 : this.l_appareils)
				if(appareil10.typeAppareil.equals(TypeAppareil.VOLET))
				{
				for(CAppareil appareil11: this.l_appareils)
				if(appareil11.getNomAppareil().equals("v"))
				appareil10.appliquer(TypeActionAppareil.OUVRIR);
				}
				for(CAppareil appareil12 : this.l_appareils)
				if(appareil12.getNomAppareil().equals("cafe"))
				appareil12.appliquer(TypeActionAppareil.ETEINDRE);
			break;

			case 4:
				for(CAppareil appareil13 : this.l_appareils)
				if(appareil13.typeAppareil.equals(TypeAppareil.VOLET))
				{
				appareil13.appliquer(TypeActionAppareil.OUVRIR);
				}
				for(CAppareil appareil14: this.l_appareils)
				if(appareil14.getNomAppareil().equals("cafe"))
				appareil14.appliquer(TypeActionAppareil.ETEINDRE);
				for(CAppareil appareil15: this.l_appareils)
				if(appareil15.getNomAppareil().equals("e1"))
				appareil15.appliquer(TypeActionAppareil.OUVRIR);
			break;

			default:
		}
	}
}
