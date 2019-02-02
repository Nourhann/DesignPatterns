/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author norhan
 */

 
/// The 'Adapter' class
public class RichCompound extends Compound{
    
    private ChemicalDatabank bank;
    public RichCompound(String chemical) {
        super(chemical);
    }
     public  void Display()
    {
      bank = new ChemicalDatabank();
 
      boilingPoint = bank.GetCriticalPoint(chemical, "B");
      meltingPoint = bank.GetCriticalPoint(chemical, "M");
      molecularWeight = bank.GetMolecularWeight(chemical);
      molecularFormula = bank.GetMolecularStructure(chemical);
 
      super.Display();
      System.out.println(" Formula: {0} "+ molecularFormula);
      System.out.println(" Weight : {0} "+ molecularWeight);
      System.out.println(" Melting Pt: {0} "+ meltingPoint);
      System.out.println(" Boiling Pt: {0} "+ boilingPoint);
      
    }
}
