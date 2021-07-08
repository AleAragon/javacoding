package model;

public class Wallet {
    
    public static final int CAPACIDAD_MAXIMA = 1000000;
    
    private int saldo;
    private boolean tieneLimite;
    private int meta;

    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
        meta = 0;
    }
    
    public int getSaldo(){
        return saldo;
    }

    public boolean getTieneLimite(){
        return tieneLimite;
    }

    public void setTieneLimite(boolean newtieneLimite){
        this.tieneLimite = newtieneLimite;
    }

    public String saveMoney(int value){
        if (saldo+value > CAPACIDAD_MAXIMA && tieneLimite) {
            return "No se puede superar el limite " + CAPACIDAD_MAXIMA;
        }
        saldo += value; //saldo = saldo + value
        if(verificarMeta())
            System.out.println("Has cumplido la meta");
        return "Transaccción exitosa, Nuevo Saldo: " + saldo;
    }

    public String getMoney(int value){
        if (saldo < value) {
            return "Saldo Insuficiente";
        }
        saldo -= value;
        return "Transaccción exitosa, Nuevo Saldo: " + saldo;
    }

    public String breakLimit(){
        if(!tieneLimite){
            return "La cuenta no tiene límites";
        }
        
        if (saldo >= 10000) {
            saldo -= 10000;
            setTieneLimite(false); //tieneLimite = false 
            return "Haz roto los límites";
        }

        return "Saldo Insuficiente :( ";

    }

    public String compararCuenta(Wallet otraWallet ){
        if(saldo ==otraWallet.getSaldo()){
            return "Las cuentas tienen el mismo saldo";
        }
        if (saldo > otraWallet.getSaldo()){
            return "La primera cuenta es Mayor";
        }
        return "La Segunda cuenta es Mayor";
    }

    public boolean establecerMeta(int value){
        if (value == 0) {
            meta = value;
            return true;   
        }
        if (value < 0 || value <= saldo || (value > CAPACIDAD_MAXIMA && tieneLimite)) {
            return false;   
        }
        
        meta = value;
        return true;
    }

    public boolean verificarMeta(){
        if(meta == 0 || saldo < meta){
            return false;
        }
        
        return true;

    }



}
