package Ej1.impl;

import Ej1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	private String text = "Undefined post";
	private int likes = 0;
	private boolean featured = false;

	/**
	 * Complete con su implementación
	 */

	/*
	 * Retorna el texto descriptivo de la publicación
	 */
	public String getText(){
		return text;
	}

	/*
	 * Asigna el texto descriptivo de la publicación
	 */
	public void setText (String descriptionText){
		text = descriptionText;
	}

	/*
	 * Retorna la cantidad de “me gusta”
	 */
	public int getLikes(){
		return likes;
	}

	/*
	 * Incrementa la cantidad de likes en uno.
	 */
	public void like(){
		likes = likes+1;
	}

	/*
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada.
	 */
	public void dislike(){
		if (likes!=0){
			likes = likes-1;
		}
	}

	/*
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 */
	public boolean isFeatured(){
		return featured;
	}

	/*
	 * Cambia el post del estado destacado a no destacado y viceversa.
	 */
	public void toggleFeatured(){
		if (featured == true){
			featured = false;
		} else {
			featured = true;
		}
	}


	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
