public abstract class Funcionario {

private String nome;

public void setNome (String nome){
    this.nome = nome;
}

public abstract void work ();

public abstract double calculoSalario ();

}