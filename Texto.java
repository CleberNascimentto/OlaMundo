public class Texto {
    public static void main (String[] args) {
        String s = new String ("IFC Videira"); //Forma tradicional de criar objetos
        String s2; //Declaração
        s2 = "IFC Videira"; //Inicialização
        String s3 = "IFC Videira"; //Declaração inicialização

        //012345678910
        //IFC VIDEIRA
        String sub1 = s.substring(4);
        System.out.println(sub1);

        String sub2 = s.substring(0, 3);
        System.out.println(sub2); //iFC

        System.out.println(s.indexOf("Videira"));
        System.out.println(sub2.indexOf("Videira"));
        System.out.println(sub1.indexOf("Videira"));

        System.out.println("Tamanho da string S: "+ s.length());
        System.out.println ("caracter na posição x da string s: "+s.charAt(4));

        String cursosIFC = "Computacao:Engenharia Eletrica:Pedagogia:Agronomia:";
        String[] vetCursos = cursosIFC.split(":");
        System.out.println(vetCursos);

        for (int i = 0; i < vetCursos.length; i++) {
            System.out.println(vetCursos[i]); 
        }

        int i = 0;
        while(i < vetCursos.length) { 
            System.out.println(vetCursos[i]);
            i++;
        }

        for (String curso : vetCursos) {
            System.out.println(curso);
        }

        if (s.equals(s2)) { //Comparação de iguais obs: == náo irá funcionar!
            System.out.println("Sao iguais");
        }
        else {
            System.out.println("Sao diferentes");
        }

    }
}