package com.desafiolatam.modelo;

public class Horoscopo {
	
	 public String lecturaHoroscopoChino(String date) {
		 String[] a�oSplit; 
		 a�oSplit= date.split("-");
		 int a�o=0;
		 a�o=Integer.parseInt(a�oSplit[0]);
		 System.out.println(a�o);
		 String horoscopo = "";
		 String descripcion="";
		 int resto = a�o % 12;
		 switch(resto) {
		 case 0: horoscopo = "Mono"; descripcion="Los monos son inteligentes, inventivos, ingeniosos, entretenidos, pero tambi�n son peligrosos y se desaniman f�cilmente.\r\n" + 
		 		"Debido a su naturaleza extraordinaria y magn�tica personalidad, son siempre muy queridos y hacen amigos."; break;
         case 1: horoscopo = "Gallo"; descripcion="A los Gallos no se les ve desali�ados, se pasean mostrando toda su dignidad, f�cil de enamorarse y dif�cil de desenamorarse de ellos ya que los gallos tiene mucha atracci�n sobre todo por su elegancia personal.";break;
         case 2: horoscopo = "Perro"; descripcion="El Perro en la astrolog�a china representa la ternura, la fidelidad y la felicidad.\r\n" + 
         		"Los nacidos bajo este signo son honestos, tranquilos, inteligentes, generosos, tercos, leales y fieles a sus seres queridos.";break;
         case 3: horoscopo = "Cerdo"; descripcion="En la cultura china, el cerdo est� asociado con la fertilidad y la virilidad.\r\n" + 
         		"Para tener hijos en el A�o del Cerdo se considera muy afortunado, porque ellos ser�n felices y honrados.";break;
         case 4: horoscopo = "Rata"; descripcion="Las personas que nacen bajo su dominio por lo general se consideran agresivos, ambiciosos, recelosos, hambrientos de poder, honestos, generosos, r�pidos para la ira y con tendencia a gastar libremente."; break;
         case 5: horoscopo = "Buey"; descripcion="Es un s�mbolo de individuos poderosos con personalidades inflexibles y obstinados.\r\n" + 
         		"Los nacidos bajo el signo son l�deres naturales, que por lo general tienen �xito cuando les da la oportunidad.";break;
         case 6: horoscopo = "Tigre"; descripcion="Los nacidos bajo el signo del tigre son sensibles, agresivos, impredecibles, con encanto, emocionales, valientes y capaces de un gran amor. A menudo se arriesgan y tienen una vida sin preocupaciones."; break;
         case 7: horoscopo = "Conejo"; descripcion="El Conejo simboliza la gracia, los buenos modales, el consejo sano, la bondad y la sensibilidad. Los nacidos bajo este signo son cari�osos, talentosos, serviciales, siempre agradables.";break;
         case 8: horoscopo = "Dragon"; descripcion="En China, los dragones se asocian con la fuerza, con la salud, con la armon�a y con la buena suerte.\r\n" + 
         		"En las culturas milenarias orientales, es considerado al igual que la serpiente un animal de buena suerte.";break;
         case 9: horoscopo = "Serpiente"; descripcion="El Signo de la Serpiente dentro de la astrolog�a china, seg�n las creencias culturales ancestrales, es considerado como un animal sagrado, de aspecto positivo y de buena suerte, tambi�n relacionado con la sabidur�a.";break;
         case 10: horoscopo = "Caballo"; descripcion="Son laboriosos, inteligentes y amables, alegres y populares, pero impacientes.\r\n" + 
         		"Por lo general, se consideran superiores a otros. Tienen una fuerte tendencia de ego�smo y de la astucia. Aventureros, cient�ficos, poetas, pol�ticos, son ocupaciones adecuadas para ellos.";break;
         case 11: horoscopo = "Cabra"; descripcion="El signo indica una persona que es creativa, art�stica, apasionada, elegante, cari�osa, sincera, encantadora, pero pesimista, t�mida, desorganizada y vulnerable.\r\n" + 
         		"Demasiado dependiente de las comodidades materiales, son f�ciles de quejarse y no responden bien a la presi�n.";break;
		 
		 }
		 
		 
		 
		 return horoscopo;
	 }
	 
	 public String descripcion(String date) {
		 String[] a�oSplit; 
		 a�oSplit= date.split("-");
		 int a�o=0;
		 a�o=Integer.parseInt(a�oSplit[0]);
		 System.out.println(a�o);
		 String horoscopo = "";
		 String descripcion="";
		 int resto = a�o % 12;
		 switch(resto) {
		 case 0: horoscopo = "Mono"; descripcion="Los monos son inteligentes, inventivos, ingeniosos, entretenidos, pero tambi�n son peligrosos y se desaniman f�cilmente.\r\n" + 
		 		"Debido a su naturaleza extraordinaria y magn�tica personalidad, son siempre muy queridos y hacen amigos."; break;
         case 1: horoscopo = "Gallo"; descripcion="A los Gallos no se les ve desali�ados, se pasean mostrando toda su dignidad, f�cil de enamorarse y dif�cil de desenamorarse de ellos ya que los gallos tiene mucha atracci�n sobre todo por su elegancia personal.";break;
         case 2: horoscopo = "Perro"; descripcion="El Perro en la astrolog�a china representa la ternura, la fidelidad y la felicidad.\r\n" + 
         		"Los nacidos bajo este signo son honestos, tranquilos, inteligentes, generosos, tercos, leales y fieles a sus seres queridos.";break;
         case 3: horoscopo = "Cerdo"; descripcion="En la cultura china, el cerdo est� asociado con la fertilidad y la virilidad.\r\n" + 
         		"Para tener hijos en el A�o del Cerdo se considera muy afortunado, porque ellos ser�n felices y honrados.";break;
         case 4: horoscopo = "Rata"; descripcion="Las personas que nacen bajo su dominio por lo general se consideran agresivos, ambiciosos, recelosos, hambrientos de poder, honestos, generosos, r�pidos para la ira y con tendencia a gastar libremente."; break;
         case 5: horoscopo = "Buey"; descripcion="Es un s�mbolo de individuos poderosos con personalidades inflexibles y obstinados.\r\n" + 
         		"Los nacidos bajo el signo son l�deres naturales, que por lo general tienen �xito cuando les da la oportunidad.";break;
         case 6: horoscopo = "Tigre"; descripcion="Los nacidos bajo el signo del tigre son sensibles, agresivos, impredecibles, con encanto, emocionales, valientes y capaces de un gran amor. A menudo se arriesgan y tienen una vida sin preocupaciones."; break;
         case 7: horoscopo = "Conejo"; descripcion="El Conejo simboliza la gracia, los buenos modales, el consejo sano, la bondad y la sensibilidad. Los nacidos bajo este signo son cari�osos, talentosos, serviciales, siempre agradables.";break;
         case 8: horoscopo = "Dragon"; descripcion="En China, los dragones se asocian con la fuerza, con la salud, con la armon�a y con la buena suerte.\r\n" + 
         		"En las culturas milenarias orientales, es considerado al igual que la serpiente un animal de buena suerte.";break;
         case 9: horoscopo = "Serpiente"; descripcion="El Signo de la Serpiente dentro de la astrolog�a china, seg�n las creencias culturales ancestrales, es considerado como un animal sagrado, de aspecto positivo y de buena suerte, tambi�n relacionado con la sabidur�a.";break;
         case 10: horoscopo = "Caballo"; descripcion="Son laboriosos, inteligentes y amables, alegres y populares, pero impacientes.\r\n" + 
         		"Por lo general, se consideran superiores a otros. Tienen una fuerte tendencia de ego�smo y de la astucia. Aventureros, cient�ficos, poetas, pol�ticos, son ocupaciones adecuadas para ellos.";break;
         case 11: horoscopo = "Cabra"; descripcion="El signo indica una persona que es creativa, art�stica, apasionada, elegante, cari�osa, sincera, encantadora, pero pesimista, t�mida, desorganizada y vulnerable.\r\n" + 
         		"Demasiado dependiente de las comodidades materiales, son f�ciles de quejarse y no responden bien a la presi�n.";break;
		 
		 }
		 
		 
		 return descripcion;
	 }
}
