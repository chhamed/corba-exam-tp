package Institue;


/**
* Institue/Livre.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Institue.idl
* Wednesday, December 18, 2024 6:39:06 PM WAT
*/

public final class Livre implements org.omg.CORBA.portable.IDLEntity
{
  public int numero = (int)0;
  public String nom = null;
  public String auteur = null;
  public String collection = null;
  public String date_publication = null;

  public Livre ()
  {
  } // ctor

  public Livre (int _numero, String _nom, String _auteur, String _collection, String _date_publication)
  {
    numero = _numero;
    nom = _nom;
    auteur = _auteur;
    collection = _collection;
    date_publication = _date_publication;
  } // ctor

} // class Livre