package br.com.chronosacademy.media;

public class Media {
    public String calculaMedia(double v2, double v, double v1) {
        double media = (v + v1)/2;
        if (media <5){
            return "Reprovado";
        }
        return "Aprovado";
    }
}
