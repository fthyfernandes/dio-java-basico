public class OperadorRelacional {
    public static void main(String[] args) {
        int a= 10;
        int b= 5;
        String number1= "Thyago";
        String number2= "Thyago";
        String number3= new String ("Thyago");

        a= 10;
        b= 5;

        boolean simNao= a==b;
        System.out.println("'a' é igual a 'b'? "+ simNao);

        System.out.println(number1 ==number2);
        System.out.println(number3.equals(number2));




    }


}
