public class Gerente extends Funcionario {

    private double baseSalarial;
    private double bonus;

    public double getBaseSalarial (){
        return this.baseSalarial;
    }

    public void setBaseSalarial (double salario) {
        this.baseSalarial = salario;
    }

    public double getBonus(){
        return this.bonus;
    }

    public void setBonus (double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work () {

        System.out.println ("O gerente está trabalhando");

    }
    
    @Override
    public double calculoSalario (){

       double salario = this.baseSalarial + this.bonus;
        
        System.out.println (" O salário será de: " + salario);

        return salario;
    }
}
