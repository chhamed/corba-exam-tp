package Institue;

/**
* Institue/LivreHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Institue.idl
* Wednesday, December 18, 2024 6:39:06 PM WAT
*/

public final class LivreHolder implements org.omg.CORBA.portable.Streamable
{
  public Institue.Livre value = null;

  public LivreHolder ()
  {
  }

  public LivreHolder (Institue.Livre initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Institue.LivreHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Institue.LivreHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Institue.LivreHelper.type ();
  }

}