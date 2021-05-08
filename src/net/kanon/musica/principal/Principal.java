/**
 * 
 */
package net.kanon.musica.principal;

import net.kanon.musica.entity.Album;
import net.kanon.musica.entity.Artista;
import net.kanon.musica.services.impl.ArtistaServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author
 */
public class Principal {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		iniciarBusqueda();
	}
	public static void iniciarBusqueda(){

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba el artista que desea buscar");
		int artistaId = entrada.nextInt();
		ArtistaServiceImpl artistaServiceImpl = new ArtistaServiceImpl();
		Artista artistaConsultado = null;


		switch (artistaId){
			case 1:
				artistaConsultado = artistaServiceImpl.consultarPorId(artistaId);
				System.out.println("Registro encontrado");
				System.out.println("Tipo Artista: " + artistaConsultado.getTipoArtista());
				System.out.println("Pais: " + artistaConsultado.getPais());
				for ( Album albumPrueba: artistaConsultado.getAlbums()){
					System.out.println("Nombre: " + albumPrueba.getNombre());
					System.out.println("Copias: " + albumPrueba.getCopiasVendidas());

				}


		}



	}
}
