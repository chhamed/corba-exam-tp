package Institue;


/**
* Institue/PromotionOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Institue.idl
* Wednesday, December 18, 2024 6:39:06 PM WAT
*/


// Define the interface for a Promotion
public interface PromotionOperations 
{
  void AjouterUnEtudiant (int numero, String nom, String prenom);
  Institue.Etudiant RechercherUnEtudiant (int numero);

  // Search for a student by number
  double CalculerMoyenneDeLaPromotion ();
} // interface PromotionOperations
