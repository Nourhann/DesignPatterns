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
/// The 'Target' class
public class Compound {
    protected String chemical;
    protected float boilingPoint;
    protected float meltingPoint;
    protected double molecularWeight;
    protected String molecularFormula;

    public Compound(String chemical) {
        this.chemical = chemical;
    }
    
    public void Display()
    {
        System.out.println("\nCompound: {0} ------ " + chemical);
    }
    
    
}
