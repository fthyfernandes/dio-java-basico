public class OperacaoTernaria{
    public static void main(String[] args) {
        int a,b;

        a= 5;
        b= 6;

        if(a==b){
            System.out.println("Verdadeiro!");
        }
        else{
            System.out.println("Falso!");
        }
        System.out.println();
        /* O operador de condição ternária é uma forma resumida para definir uma condição
           e escolher por um dentre dois valores. Você deve pensar numa condição ternária,
           como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura
           estará escrita numa única linha.

           O operador ternário é representado pelos símbolos "?" e ":" 
           utilizados na seguinte estrutura de sintaxe:

           <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false> */

        String resultado = a==b? "True": "False";
        System.out.println(resultado);

        
    }





}