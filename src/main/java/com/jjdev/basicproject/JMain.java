package com.jjdev.basicproject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author jgilson
 */
public class JMain extends WebPage {

    public JMain() {
        super();

        add(new Label("lblTitle", "Olá! Este é um exemplo de uso do framework Apache Wicket. Bons estudos!"));
    }

}
