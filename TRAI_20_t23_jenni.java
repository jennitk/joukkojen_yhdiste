/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trai_20_t23_jenni;

// TRAI_20_t23_24.java SJ

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class TRAI_20_t23_jenni {

    public static void main(String[] args) {

        int N = 7;
        if (args.length > 0)
            N = Integer.parseInt(args[0]);

        Set<Set<Integer>> SS = new HashSet<>();

        Random r = new Random(N + 1);
        System.out.println("SyÃ¶tejoukot:");
        for (int i = 0; i < N; i++) {
            Set<Integer> S = new HashSet<>();
            for (int j = 0; j < N; j++) {
                S.add(r.nextInt(N * 2));
            }
            SS.add(S);
            System.out.println("S" + i + ": " + S);
        }

        Set<Integer> tulos = yhdiste(SS);
        System.out.println("\nKaikkien yhdiste: " + tulos);
        System.out.println();

        tulos = vainYhdessa(SS);
        System.out.println("Vain yhdessÃ¤: " + tulos);
        System.out.println();

    } // main()


    /**
     * 23. Kirjoita algoritmi joka saa parametrinaan joukkojen joukon (Set<Set<E>>) ja joka pa-
     * lauttaa joukkona (Set<E>) kaikki ne alkiot jossakin (tai joissakin) syÃ¶tejoukoissa. Siis
     * yhdisteen. Vihje: iteraattori ja joukko-operaatiot. MikÃ¤ on algoritmisi aikavaativuus?
     *
     * @param SS  joukkojen joukko
     * @param <E> joukkojen alkioiden tyyppi
     * @return kaikki jossain joukossa esiintyneet alkiot
     */
    public static <E> Set<E> yhdiste(Set<Set<E>> SS) {
        //luodaan tuloslista, joka palautetaan
        Set<E> tulos = new HashSet<>();
       
        // for-loopissa käydään läpi joukkojen joukko SS
        for (Set<E> x: SS){
            //loopista saadaan joukko, jolle luodaan iteraattori
            Iterator<E> it = x.iterator();
            //kun iteraattorilla seuraaja
            while (it.hasNext()){
                //lisätään iteraattorin seuraaja tulosjoukkoon
                tulos.add(it.next());
            }    
        }
        //palautetaan tulosjoukko
        return tulos;
    }

    /**
     * 24. Kirjoita algoritmi joka saa parametrinaan joukkojen joukon (Set<Set<E>>) ja joka pa-
     * lauttaa joukkona (Set<E>) kaikki ne alkiot jotka ovat tasan yhdessÃ¤ syÃ¶tejoukoista. Ne
     * alkiot jotka ovat useammassa kuin yhdessÃ¤ syÃ¶tejoukoista eivÃ¤t tule tulokseen. Ã„lÃ¤ muuta
     * syÃ¶tejoukkoja. Vihje: iteraattori ja joukko-operaatiot. MikÃ¤ on algoritmisi aikavaativuus?
     *
     * @param SS  joukkojen joukko
     * @param <E> joukkojen alkioiden tyyppi
     * @return kaikki ne alkiot jotka esiintyvÃ¤t vain yhdessÃ¤ joukossa
     */
    public static <E> Set<E> vainYhdessa(Set<Set<E>> SS) {
        Set<E> tulos = new HashSet<>();

        // TODO

        return tulos;
    } // vainYhdessa()


} // class
