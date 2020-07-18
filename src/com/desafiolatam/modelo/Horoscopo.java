package com.desafiolatam.modelo;

public class Horoscopo {
	
	 public String lecturaHoroscopoChino(String date) {
		 String[] añoSplit; 
		 añoSplit= date.split("-");
		 int año=0;
		 año=Integer.parseInt(añoSplit[0]);
		 System.out.println(año);
		 String horoscopo = "";
		 String descripcion="";
		 int resto = año % 12;
		 switch(resto) {
		 case 0: horoscopo = "Mono"; descripcion="Los monos son inteligentes, inventivos, ingeniosos, entretenidos, pero también son peligrosos y se desaniman fácilmente.\r\n" + 
		 		"Debido a su naturaleza extraordinaria y magnética personalidad, son siempre muy queridos y hacen amigos."; break;
         case 1: horoscopo = "Gallo"; descripcion="A los Gallos no se les ve desaliñados, se pasean mostrando toda su dignidad, fácil de enamorarse y difícil de desenamorarse de ellos ya que los gallos tiene mucha atracción sobre todo por su elegancia personal.";break;
         case 2: horoscopo = "Perro"; descripcion="El Perro en la astrología china representa la ternura, la fidelidad y la felicidad.\r\n" + 
         		"Los nacidos bajo este signo son honestos, tranquilos, inteligentes, generosos, tercos, leales y fieles a sus seres queridos.";break;
         case 3: horoscopo = "Cerdo"; descripcion="En la cultura china, el cerdo está asociado con la fertilidad y la virilidad.\r\n" + 
         		"Para tener hijos en el Año del Cerdo se considera muy afortunado, porque ellos serán felices y honrados.";break;
         case 4: horoscopo = "Rata"; descripcion="Las personas que nacen bajo su dominio por lo general se consideran agresivos, ambiciosos, recelosos, hambrientos de poder, honestos, generosos, rápidos para la ira y con tendencia a gastar libremente."; break;
         case 5: horoscopo = "Buey"; descripcion="Es un símbolo de individuos poderosos con personalidades inflexibles y obstinados.\r\n" + 
         		"Los nacidos bajo el signo son líderes naturales, que por lo general tienen éxito cuando les da la oportunidad.";break;
         case 6: horoscopo = "Tigre"; descripcion="Los nacidos bajo el signo del tigre son sensibles, agresivos, impredecibles, con encanto, emocionales, valientes y capaces de un gran amor. A menudo se arriesgan y tienen una vida sin preocupaciones."; break;
         case 7: horoscopo = "Conejo"; descripcion="El Conejo simboliza la gracia, los buenos modales, el consejo sano, la bondad y la sensibilidad. Los nacidos bajo este signo son cariñosos, talentosos, serviciales, siempre agradables.";break;
         case 8: horoscopo = "Dragon"; descripcion="En China, los dragones se asocian con la fuerza, con la salud, con la armonía y con la buena suerte.\r\n" + 
         		"En las culturas milenarias orientales, es considerado al igual que la serpiente un animal de buena suerte.";break;
         case 9: horoscopo = "Serpiente"; descripcion="El Signo de la Serpiente dentro de la astrología china, según las creencias culturales ancestrales, es considerado como un animal sagrado, de aspecto positivo y de buena suerte, también relacionado con la sabiduría.";break;
         case 10: horoscopo = "Caballo"; descripcion="Son laboriosos, inteligentes y amables, alegres y populares, pero impacientes.\r\n" + 
         		"Por lo general, se consideran superiores a otros. Tienen una fuerte tendencia de egoísmo y de la astucia. Aventureros, científicos, poetas, políticos, son ocupaciones adecuadas para ellos.";break;
         case 11: horoscopo = "Cabra"; descripcion="El signo indica una persona que es creativa, artística, apasionada, elegante, cariñosa, sincera, encantadora, pero pesimista, tímida, desorganizada y vulnerable.\r\n" + 
         		"Demasiado dependiente de las comodidades materiales, son fáciles de quejarse y no responden bien a la presión.";break;
		 
		 }
		 
		 
		 
		 return horoscopo;
	 }
	 
	 public String descripcion(String date) {
		 String[] añoSplit; 
		 añoSplit= date.split("-");
		 int año=0;
		 año=Integer.parseInt(añoSplit[0]);
		 System.out.println(año);
		 String horoscopo = "";
		 String descripcion="";
		 int resto = año % 12;
		 switch(resto) {
		 case 0: horoscopo = "Mono"; descripcion="Los monos son inteligentes, inventivos, ingeniosos, entretenidos, pero también son peligrosos y se desaniman fácilmente.\r\n" + 
		 		"Debido a su naturaleza extraordinaria y magnética personalidad, son siempre muy queridos y hacen amigos."; break;
         case 1: horoscopo = "Gallo"; descripcion="A los Gallos no se les ve desaliñados, se pasean mostrando toda su dignidad, fácil de enamorarse y difícil de desenamorarse de ellos ya que los gallos tiene mucha atracción sobre todo por su elegancia personal.";break;
         case 2: horoscopo = "Perro"; descripcion="El Perro en la astrología china representa la ternura, la fidelidad y la felicidad.\r\n" + 
         		"Los nacidos bajo este signo son honestos, tranquilos, inteligentes, generosos, tercos, leales y fieles a sus seres queridos.";break;
         case 3: horoscopo = "Cerdo"; descripcion="En la cultura china, el cerdo está asociado con la fertilidad y la virilidad.\r\n" + 
         		"Para tener hijos en el Año del Cerdo se considera muy afortunado, porque ellos serán felices y honrados.";break;
         case 4: horoscopo = "Rata"; descripcion="Las personas que nacen bajo su dominio por lo general se consideran agresivos, ambiciosos, recelosos, hambrientos de poder, honestos, generosos, rápidos para la ira y con tendencia a gastar libremente."; break;
         case 5: horoscopo = "Buey"; descripcion="Es un símbolo de individuos poderosos con personalidades inflexibles y obstinados.\r\n" + 
         		"Los nacidos bajo el signo son líderes naturales, que por lo general tienen éxito cuando les da la oportunidad.";break;
         case 6: horoscopo = "Tigre"; descripcion="Los nacidos bajo el signo del tigre son sensibles, agresivos, impredecibles, con encanto, emocionales, valientes y capaces de un gran amor. A menudo se arriesgan y tienen una vida sin preocupaciones."; break;
         case 7: horoscopo = "Conejo"; descripcion="El Conejo simboliza la gracia, los buenos modales, el consejo sano, la bondad y la sensibilidad. Los nacidos bajo este signo son cariñosos, talentosos, serviciales, siempre agradables.";break;
         case 8: horoscopo = "Dragon"; descripcion="En China, los dragones se asocian con la fuerza, con la salud, con la armonía y con la buena suerte.\r\n" + 
         		"En las culturas milenarias orientales, es considerado al igual que la serpiente un animal de buena suerte.";break;
         case 9: horoscopo = "Serpiente"; descripcion="El Signo de la Serpiente dentro de la astrología china, según las creencias culturales ancestrales, es considerado como un animal sagrado, de aspecto positivo y de buena suerte, también relacionado con la sabiduría.";break;
         case 10: horoscopo = "Caballo"; descripcion="Son laboriosos, inteligentes y amables, alegres y populares, pero impacientes.\r\n" + 
         		"Por lo general, se consideran superiores a otros. Tienen una fuerte tendencia de egoísmo y de la astucia. Aventureros, científicos, poetas, políticos, son ocupaciones adecuadas para ellos.";break;
         case 11: horoscopo = "Cabra"; descripcion="El signo indica una persona que es creativa, artística, apasionada, elegante, cariñosa, sincera, encantadora, pero pesimista, tímida, desorganizada y vulnerable.\r\n" + 
         		"Demasiado dependiente de las comodidades materiales, son fáciles de quejarse y no responden bien a la presión.";break;
		 
		 }
		 
		 
		 return descripcion;
	 }
}
