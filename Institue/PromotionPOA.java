package Institue;


/**
* Institue/PromotionPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Institue.idl
* Wednesday, December 18, 2024 6:39:06 PM WAT
*/


// Define the interface for a Promotion
public abstract class PromotionPOA extends org.omg.PortableServer.Servant
 implements Institue.PromotionOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("AjouterUnEtudiant", new java.lang.Integer (0));
    _methods.put ("RechercherUnEtudiant", new java.lang.Integer (1));
    _methods.put ("CalculerMoyenneDeLaPromotion", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Institue/Promotion/AjouterUnEtudiant
       {
         int numero = in.read_long ();
         String nom = in.read_string ();
         String prenom = in.read_string ();
         this.AjouterUnEtudiant (numero, nom, prenom);
         out = $rh.createReply();
         break;
       }

       case 1:  // Institue/Promotion/RechercherUnEtudiant
       {
         int numero = in.read_long ();
         Institue.Etudiant $result = null;
         $result = this.RechercherUnEtudiant (numero);
         out = $rh.createReply();
         Institue.EtudiantHelper.write (out, $result);
         break;
       }


  // Search for a student by number
       case 2:  // Institue/Promotion/CalculerMoyenneDeLaPromotion
       {
         double $result = (double)0;
         $result = this.CalculerMoyenneDeLaPromotion ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Institue/Promotion:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Promotion _this() 
  {
    return PromotionHelper.narrow(
    super._this_object());
  }

  public Promotion _this(org.omg.CORBA.ORB orb) 
  {
    return PromotionHelper.narrow(
    super._this_object(orb));
  }


} // class PromotionPOA
