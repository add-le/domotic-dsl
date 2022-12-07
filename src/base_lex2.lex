//Addwyn LE LANN Projet COMP2
//Daniel LEDOUSSAL

// Specification JFlex
import java_cup.runtime.Symbol;
 
%%
%unicode
%cup
%line
%column

%{
	public int getYyLine(){
		return yyline+1;
	}
	public int getYyColumn(){
		return yycolumn+1;
	}
	public String getYyText(){
		return yytext();
	}
%}

progDomusDebut = "<PROGRAMME_DOMUS>"
progDomusFin = "</PROGRAMME_DOMUS>"
declaAppareilDebut = "<DECLARATION_APPAREILS>"
declaAppareilFin = "</DECLARATION_APPAREILS>"
declaInterfaceDebut = "<DECLARATION_INTERFACES>"
declaInterfaceFin = "</DECLARATION_INTERFACES>"
declaScenariiDebut = "<DECLARATION_SCENARII>"
declaScenariiFin = "</DECLARATION_SCENARII>"
declaCommandeDebut = "<DECLARATION_COMMANDES>"
declaCommandeFin = "</DECLARATION_COMMANDES>"
declaScenarioDebut = "<SCENARIO"
declaScenarioFin = "</SCENARIO"
superieur = ">"
virgule = ","
pointVirgule = ";"
point = "."
parOuvert = "("
parFermer = ")"
accOuvert = "{"
accFermer = "}"
deuxPoint = ":"
underscore = "_"
egal = "="
doubleEgal = "=="
different = "!="
type = eclairage | alarme | chauffage | fenetre | volet | "autre_appareil(hifi)" | "autre_appareil(cafetiere)" | "autre_appareil(tv)" | "autre_appareil(portail)" | "autre_appareil(video_proj)" | "autre_appareil(lave_vaisselle)" | "autre_appareil(lave_linge)" | "autre_appareil(seche_linge)" | interrupteur | mobile | telephone | telecommande | tablette | ordinateur | autre_appareil
mcDefinir = definir
mcExecuter = executer_scenario
mcAssocier = associer
mcProgrammer = programmer
mcMessage = message
mcPourout = pourtout
mcFaire = faire
mcFait = fait
mcSi = si
mcAlors = alors
mcSinon = sinon
mcFsi = fsi
methode = ouvrir | fermer | eteindre | allumer | tamiser | allumer_partiel | allumer_eco | ouvrir_partiel | fermer_partiel | etat
attribut = allume | eteint | demi | eco | ouvert | ferme
chaine = \"[^\n\"]*\"
variable = (_[a-zA-Z] | [a-zA-Z]) [_0-9a-zA-Z]*
entier = [0-9]+


%%
{progDomusDebut} { return new Symbol(sym.PROG_DOMUS_DEBUT); }
{progDomusFin} { return new Symbol(sym.PROG_DOMUS_FIN); }
{declaAppareilDebut} { return new Symbol(sym.DECLA_APPAREIL_DEBUT); }
{declaAppareilFin} { return new Symbol(sym.DECLA_APPAREIL_FIN); }
{declaInterfaceDebut} { return new Symbol(sym.DECLA_INTERFACE_DEBUT); }
{declaInterfaceFin} { return new Symbol(sym.DECLA_INTERFACE_FIN); }
{declaScenariiDebut} { return new Symbol(sym.DECLA_SCENARII_DEBUT); }
{declaScenariiFin} { return new Symbol(sym.DECLA_SCENARII_FIN); }
{declaCommandeDebut} { return new Symbol(sym.DECLA_COMMANDE_DEBUT); }
{declaCommandeFin} { return new Symbol(sym.DECLA_COMMANDE_FIN); }
{declaScenarioDebut} { return new Symbol(sym.DECLA_SCENARIO_DEBUT); }
{declaScenarioFin} { return new Symbol(sym.DECLA_SCENARIO_FIN); }
{superieur} { return new Symbol(sym.SUPERIEUR); }
{virgule} { return new Symbol(sym.VIRGULE); }
{pointVirgule} { return new Symbol(sym.POINT_VIRGULE); }
{point} { return new Symbol(sym.POINT); }
{parOuvert} { return new Symbol(sym.PAR_OUVERT); }
{parFermer} { return new Symbol(sym.PAR_FERMER); }
{accOuvert} { return new Symbol(sym.ACC_OUVERT); }
{accFermer} { return new Symbol(sym.ACC_FERMER); }
{deuxPoint} { return new Symbol(sym.DEUX_POINT); }
{underscore} { return new Symbol(sym.UNDERSCORE); }
{egal} { return new Symbol(sym.EGAL); }
{doubleEgal} { return new Symbol(sym.DOUBLE_EGAL); }
{different} { return new Symbol(sym.DIFFERENT); }
{type} { return new Symbol(sym.TYPE, new String(yytext())); }
{mcDefinir} { return new Symbol(sym.DEFINIR); }
{mcExecuter} { return new Symbol(sym.EXECUTER); }
{mcAssocier} { return new Symbol(sym.ASSOCIER); }
{mcProgrammer} { return new Symbol(sym.PROGRAMMER); }
{mcMessage} { return new Symbol(sym.MESSAGE); }
{mcPourout} { return new Symbol(sym.POURTOUT); }
{mcFaire} { return new Symbol(sym.FAIRE); }
{mcFait} { return new Symbol(sym.FAIT); }
{mcSi} { return new Symbol(sym.SI); }
{mcAlors} { return new Symbol(sym.ALORS); }
{mcSinon} { return new Symbol(sym.SINON); }
{mcFsi} { return new Symbol(sym.FSI); }
{methode} { return new Symbol(sym.METHODE, new String(yytext())); }
{attribut} { return new Symbol(sym.ATTRIBUT, new String(yytext())); }
{chaine} { return new Symbol(sym.CHAINE, new String(yytext())); }
{variable} { return new Symbol(sym.VARIABLE, new String(yytext())); }
{entier} { return new Symbol(sym.ENTIER, new Integer(yytext())); }
"//".* {} //Detection de commentaire donc ne rien faire
[ \t\n] {} //Ne rien faire
. { System.out.println("Erreur lexicale : " + yytext() + " non reconnue ! Ligne : " + (yyline+1) + " Colonne : " + (yycolumn +1)); }

