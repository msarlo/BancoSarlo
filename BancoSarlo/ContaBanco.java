
public class ContaBanco
{ 
    //Atributos
    public int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Métodos
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "Corrente"){
            this.setSaldo(50);
        }
        else{
            this.setSaldo(100);
        }
    }
    
    public void fecharConta(){
        if(this.getSaldo()> 0){
            System.out.println("A conta tem saldo aberto");
        }
        else if(this.getSaldo()<0){
            System.out.println("A conta tem débito aberto");
        }
        else{
            System.out.println("A conta foi fechada com sucesso");
        }
    }
    
    public void depositar(double deposito){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + deposito);
        }
    }
    public void sacar(double saque){
        if(this.getSaldo() > 0){
            this.setSaldo(getSaldo() - saque); 
        }
    }
    
    public void pagarMensal(){ 
        if(this.getTipo() == "Corrente" && this.getSaldo() >= 20){
            this.setSaldo(this.getSaldo() - 20);
        }
        else if(this.getTipo() == "Poupança" && this.getSaldo() >= 10){
            this.setSaldo(this.getSaldo() - 10);
        }
        else{
            System.out.print("Saldo indisponível para pagamento.");
        }
    }
    
    //Método Construtor
    public ContaBanco()
    {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    //Métodos Set Get
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getDono(){
        return dono;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }
    
}
