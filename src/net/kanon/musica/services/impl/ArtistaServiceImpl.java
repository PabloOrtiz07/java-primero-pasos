/**
 * 
 */
package net.kanon.musica.services.impl;

import net.kanon.musica.entity.Album;
import net.kanon.musica.entity.Artista;
import net.kanon.musica.services.ArtistaService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 */
public class ArtistaServiceImpl implements ArtistaService {
	@Override
	public Artista consultarPorId(int idArtista) {

		List<Album> albumMuse = new ArrayList<Album>();

		if (idArtista == 1){

			//agrego artista primero
			Artista MuseArtista = new Artista();

			MuseArtista.setId(1);

			MuseArtista.setNombre("Muse");

			MuseArtista.setTipoArtista("Grupo");

			MuseArtista.setPais("Gran Bretaña");

			//primer album

			Album simulationTheory = new Album();

			simulationTheory.setNombre("Simulation Theory");

			simulationTheory.setAnio(2018);

			simulationTheory.setCopiasVendidas("900000");

			//segundo album

			Album drones = new Album();

			drones.setNombre("drones");

			drones.setAnio(2015);

			drones.setCopiasVendidas("1500000");

			// agrego los albumes a la lista de Muse

			albumMuse.add(simulationTheory);

			albumMuse.add(drones);

			MuseArtista.setAlbums(albumMuse);
			return MuseArtista;
		}

		if (idArtista == 2){
			//agrego artista primero
			Artista MetallicaArtista = new Artista();

			MetallicaArtista.setId(2);

			MetallicaArtista.setNombre("Metallica");

			MetallicaArtista.setTipoArtista("Solista");

			MetallicaArtista.setPais("Alemania");

			//primer album

			Album pruebaMetalica = new Album();

			pruebaMetalica.setNombre("Metallica Musica");

			pruebaMetalica.setAnio(2020);

			pruebaMetalica.setCopiasVendidas("945454");

			//agrego a album
			albumMuse.add(pruebaMetalica);

			MetallicaArtista.setAlbums(albumMuse);
			return MetallicaArtista;
		}

		return null;
	}

}
