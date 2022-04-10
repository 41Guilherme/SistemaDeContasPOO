package utils;

public class Pessoa {
    
    private String cpf;
    private String name;
    
    public Pessoa(String cpf, String name) {
        this.setCpf(cpf);
        this.setName(name);
    }

    public String getCpf() {
        return cpf;
    }
    public String getName() {
        return name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setName(String name) {
        this.name = name;
    }


}
