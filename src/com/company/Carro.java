package com.company;

public class Carro {

    public final static String VERMELHO = "VERMELHO";
    public final static String AZUL = "AZUL";
    public final static String PRETO = "PRETO";
    public final static String AMARELO = "AMARELO";

    private String cor;
    private String marcas;

    private Integer ano;
    private Integer pneus;
    private Integer Calotas;
    private Integer Parafusos;

    public final static String FERRARI = "FERRARI";
    public final static String MERCEDES = "MERCEDES";
    public final static String PORCHE = "PORCHE";



    public Carro (Integer pneus) {
        setPneus(pneus);
        this.pneus = pneus;
    }

    public Integer getPneus() {
        return pneus + 1;
    }

    public void setPneus(Integer pneus) {
        Calotas = pneus;
        Parafusos = pneus * 4;
        this.pneus = pneus;
    }

    public Integer getCalotas() { return Calotas; }

    public void setCalotas(Integer calotas) { Calotas = calotas; }

    public Integer getParafusos() { return Parafusos; }

    public void setParafusos(Integer parafusos) { Parafusos = parafusos; }

    public String getCor() { return cor; }

    public void setCor(String cor) { this.cor = cor; }

    public String getMarcas() { return marcas; }

    public void setMarcas(String marcas) { this.marcas = marcas; }

    public Integer getAno() { return ano; }

    public void setAno(Integer ano) { this.ano = ano;}

    public void infos() {
        System.out.println("|   Informações do carro");
        System.out.println("");
        System.out.println("|   Marca: " + getMarcas());
        System.out.println("|   Ano: " + getAno());
        System.out.println("|   Cor: " + getCor());
        System.out.println("|   Quantidade de Pneus: " + getPneus());
        System.out.println("|   Quantidade de Parafusos nos Pneus: " + getParafusos());
        System.out.println("|   Quantidade de Calotas do carro: " + getCalotas());

    }
}
