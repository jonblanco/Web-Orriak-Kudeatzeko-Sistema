package webkudeaketa;

import java.util.ArrayList;

public class webOrri {
	private String url; //la url de cada web, por ejemplo "jimperry.com", es ese formato
	private Integer indizea; //indice correspondiente a cada weborri
	private ArrayList<gako> gakoak;//gako zerrenda, es decir, un gako para cada web (todas las webs tienen un gako diferente)
	//no se si las arraylist van aqu�, pero las pongo para acordarme de momento
	private ArrayList<webOrri> weborriLista;//web orrien zerrenda
	
	public webOrri(String webUrl, Integer ind) //ERAIK.
	{url=webUrl;
	indizea=ind;
	}
}
