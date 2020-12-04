/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.aditiyamusthafakamil.no.pkg3;

/**
 *
 * @author TOSHIBA
 */
public class Rnb implements Jazz, Blues{

    @Override
    public void genreJazz(String artistName) {
        System.out.printf("%s adalah musisi Jazz\n",artistName);
    }

    @Override
    public void genreBlues(String artistName) {
        System.out.printf("%s adalah musisi Blues\n",artistName);
    }

    
    
}
