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
public class Metal implements HeavyMetal{

    public void genreHeavyMetal(String artistName) {
        System.out.printf("%s adalah musisi HeavyMetal\n",artistName);
    }

    public void genrePunk(String artistName) {
        System.out.printf("%s adalah musisi Punk\n",artistName);
    }
 
}