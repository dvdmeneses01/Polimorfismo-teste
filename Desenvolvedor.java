public class Desenvolvedor extends Funcionario{

    private double baseSalarial;
    private int horaExtra;
    private double taxaHora;

    public double getBaseSalarial (){
        return this.baseSalarial;
    }

    public void setBaseSalarial (double salario) {
        this.baseSalarial = salario;
    }

    public int getHoraExtra (){
        return this.horaExtra;
    }

    public void setHoraExtra (int horas) {
        this.horaExtra = horas;
    }

    public double getTaxaHora (){
        return this.taxaHora;
    }

    public void setTaxaHora (double taxa) {
        this.taxaHora = taxa;
    }

    @Override
    public void work () {

        System.out.println ("O desenvolvedor está trabalhando");

    }
    
    @Override
    public double calculoSalario (){
        double salario;

        salario = this.baseSalarial + (this.baseSalarial*this.horaExtra*this.taxaHora);
        
        System.out.println (" O salário será de: " + salario);

        return salario;
    }

}
