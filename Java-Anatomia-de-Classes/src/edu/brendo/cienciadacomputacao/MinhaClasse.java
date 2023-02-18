package edu.brendo.cienciadacomputacao;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá turma, sejam bem-vindos"); 
        String primeiroNome = "Brendo";
        String segundoNome = "Farias";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
        
    }
}
