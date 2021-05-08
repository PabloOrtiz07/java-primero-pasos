/**
 * 
 */
package net.kanon.musica.services;

import net.kanon.musica.entity.Artista;

/**
 * 
 * @author 
 *
 */
public interface ArtistaService {
	/**
	 * 
	 * @param idArtista
	 * @return
	 */
	Artista consultarPorId(int idArtista);
}
