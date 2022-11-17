public class ContaBanco {
    // Atributos

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // Métodos Personalizados

    public void estadoAtual() {
        System.out.println("--------------------------");
        System.out.println("Número da conta : " + this.getNumConta());
        System.out.println("Tipo de conta : " + this.getTipo());
        System.out.println("Conta de : " + this.getDono());
        System.out.println("Conta no saldo de : " + this.getSaldo());
        System.out.println("Conta está no status : " + this.getStatus());

    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso !");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com saldo ! ");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Conta com Débito ! ");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada !");
        }
    }

    public void depositar(double v) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado no valor de " + v +  " na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar, conta não existente !");
        }
    }

    public void sacar(double v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado no valor de " + v + " na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque ");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada ");
        }
    }

    public void pagarMensal() {
        if (this.getTipo() == "CC") {
            this.saldo = this.saldo - 12;
            System.out.println("pagamento da mensalidade foi realizado !");
        } else if (this.getTipo() == "CP") {
            this.saldo = this.saldo - 20;
            System.out.println("pagamento da mensalidade foi realizado !");
        } else {
            System.out.println("Impossível fazer o pagamento da mensalidade !");
        }


    }
    // Método Construtor

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    // Métodos Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
