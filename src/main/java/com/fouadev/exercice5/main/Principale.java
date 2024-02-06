package com.fouadev.exercice5.main;

import com.fouadev.exercice5.presentation.Cercle;
import com.fouadev.exercice5.presentation.Figure;
import com.fouadev.exercice5.presentation.Rectangle;

public class Principale {
    public static void main(String[] args) {
        Figure c = new Cercle("c1",4);
        c.afficherDetails();
        Figure r = new Rectangle("r1",2,2);
        r.afficherDetails();

    }
}
