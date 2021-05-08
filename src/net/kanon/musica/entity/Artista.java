/**
 * 
 */
package net.kanon.musica.entity;

import java.util.List;

/**
 * @author
 */
public class Artista {
    private int id;

    private String nombre;

    private List<Album> albums;

    private String tipoArtista;

    private String pais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public String getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(String tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
