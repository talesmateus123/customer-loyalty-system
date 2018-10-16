/*
    NOME: TALES MATEUS DE OLIVEIRA
    TURMA: 1224
 */
package Modelo;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String validaData;

    public Data(int d, int m, int a) {
        if(a > 0) 
            ano = a;
        else{
            ano = 0;
            this.validaData="ano inválido";
        }
        if(m >= 1 && m <= 12) 
            mes = m;
        else{
            mes = 0;
            this.validaData="mês inválido";
        }
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if(d >= 1 && d <= 31)
                dia = d;
            else{
                dia = 0;
                this.validaData="dia inválido";
            }
        }
        if(m == 4 || m == 6 || m == 9 || m == 11){
            if(d >= 1 && d <= 30)
                dia = d;
            else{
                dia = 0;
                this.validaData="dia inválido";
            }
        }
        if(m == 2){
            boolean eBissexto = verificaBissexto(a);
            if(eBissexto == true){
                if(d >= 1 && d <= 29)
                    dia = d;
                else{
                    dia = 0;
                    this.validaData="dia inválido";
                }
            }
            else{
                if(d >= 1 && d <= 28)
                    dia = d;
                else{
                    dia = 0;
                    this.validaData="dia inválido";
                }
            }
        }
    }
    public void setData(int d, int m, int a) {
        if(a > 0) 
            ano = a;
        else{
            ano = 0;
            this.validaData="ano inválido";
        }
        if(m >= 1 && m <= 12) 
            mes = m;
        else{
            mes = 0;
            this.validaData="mês inválido";
        }
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if(d >= 1 && d <= 31)
                dia = d;
            else{
                dia = 0;
                this.validaData="dia inválido";
            }
        }
        if(m == 4 || m == 6 || m == 9 || m == 11){
            if(d >= 1 && d <= 30)
                dia = d;
            else{
                dia = 0;
                this.validaData="dia inválido";
            }
        }
        if(m == 2){
            boolean eBissexto = verificaBissexto(a);
            if(eBissexto == true){
                if(d >= 1 && d <= 29)
                    dia = d;
                else{
                    dia = 0;
                    this.validaData="dia inválido";
                }
            }
            else{
                if(d >= 1 && d <= 28)
                    dia = d;
                else{
                    dia = 0;
                    this.validaData="dia inválido";
                }
            }
        }
    }
    
    private boolean verificaBissexto(int ano){
        if(ano%4 == 0){
            if(ano%100 != 0)
                return true;
            else
                return false;
        }
        else{
            if(ano%400 == 0)
                return true;
            else
                return false;
        }
    }

    public int getData() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
    
    public String toString() {
        if (this.validaData != null)
            return this.validaData;
        else
            return this.dia+ "/" +this.mes+ "/" +this.ano;
    }
}
