package com.aluracursos.screenmatch.service;

import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

public class ConsultaLT {
    public static String obtenerTraducccion(String texto){
        String textoTraducido = Translator.translate(Language.ENGLISH, Language.SPANISH, texto);
        return textoTraducido;
    }

}
