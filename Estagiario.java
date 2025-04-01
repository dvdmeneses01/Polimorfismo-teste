public class Estagiario extends Funcionario{

    private double bolsa;


    public void setBolsa (double bolsa){
        this.bolsa = bolsa;
    }

    public double getBolsa () {
        return this.bolsa;
    }

    @Override
    public void work (){
        System.out.println ("O estagiário " + nome+ " está trabalhando");
    }

    @Override
    public double calculoSalario () {
        return getBolsa();
    }

}
