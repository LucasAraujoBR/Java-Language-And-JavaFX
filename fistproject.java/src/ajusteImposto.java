public class ajusteImposto {
    public static void main(String[] args) throws Exception {
        /* 
        crie uma variável salário e imprima o importo respectivo:
        salario < 1000 5%
        salario >=1000 && salario <3000 10%
        salario >=3000 && salario <5000 15%
        salario >=5000 20%
        */ 

        
        int salario = 5000;
        double imposto = 0;

        if(salario < 1000){
            imposto = salario * 0.05;
        }else if(salario >=1000 && salario <3000){
            imposto = salario * 0.1;
        }else if(salario >=3000 && salario <5000){
            imposto = salario * 0.15;
        }else{
            imposto = salario * 0.2;
        }

        System.out.println("Seu salario eh:"+salario+" .Então,seu imposto eh: "+imposto);
    }
}
