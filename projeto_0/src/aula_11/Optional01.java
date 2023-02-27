package aula_11;

import java.util.Optional;

public class Optional01 {
    public static void main(String[] args) {
        String[] palavras = new String[10];
        palavras[2] = "Generation brazil - Turma 61";
        Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
        Optional<String> checaNulo2 = Optional.ofNullable(palavras[2]);
      
        /*for(var palavra : palavras){
            System.out.println(palavra);
        }*/

        if(checaNulo.isPresent()){
            String palavra = palavras[5].toLowerCase();
            System.out.println(palavra);
        }else
            System.out.println("Não existe palavra nessa posição!");
        System.out.println(checaNulo);
        System.out.println(checaNulo2.isEmpty());
        System.out.println(checaNulo2.get());
        
    }

}
