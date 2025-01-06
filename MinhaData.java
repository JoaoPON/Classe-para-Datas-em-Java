public class MinhaData
{
    public int dia;
    public int mes;
    public int ano;
    
    MinhaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    
    MinhaData(String data){
        if(!data.isEmpty()){
            String componentes[] = data.split("/");
            dia = Integer.parseInt(componentes[0]);
            mes = Integer.parseInt(componentes[1]);
            ano = Integer.parseInt(componentes[2]);
        }
    }
    
    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
    
    void diaSet(int d){
        dia = d;
    }
    
    void mesSet(int m){
        mes = m;
    }
    
    void anoSet(int a){
        ano = a;
    }
    
    public int compara(String data) {
        String componentes[] = data.split("/");
    
        int outroDia = Integer.parseInt(componentes[0]);
        int outroMes = Integer.parseInt(componentes[1]);
        int outroAno = Integer.parseInt(componentes[2]);
    
        if (ano != outroAno) {
            return (ano < outroAno) ? -1 : 1;
        }
    
        if (mes != outroMes) {
            return (mes < outroMes) ? -1 : 1;
        }
    
        if (dia != outroDia) {
            return (dia < outroDia) ? -1 : 1;
        }
    
        return 0;
    }
}