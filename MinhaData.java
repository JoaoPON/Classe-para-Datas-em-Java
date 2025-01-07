public class MinhaData extends Data
{
    public int ano;
    
    MinhaData(int d, int m, int a){
        super(d, m);
        ano = a;
    }
    
    MinhaData(String data){
        super(0,0);
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
    
    public void alterarData(int d, int m, int a) {
        dia += d;
        mes += m;
        ano += a;

        ajustarData();
    }

    private void ajustarData() {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
        while (mes > 12) {
            mes -= 12;
            ano++;
        }
    
        while (mes <= 0) {
            mes += 12;
            ano--;
        }
    
        Bissexto(ano, diasPorMes);
    
        while (dia > diasPorMes[mes - 1]) {
            dia -= diasPorMes[mes - 1];
            mes++;
            if (mes > 12) {
                mes = 1;
                ano++;
                Bissexto(ano, diasPorMes);
            }
        }

        while (dia <= 0) {
            mes--;
            if (mes <= 0) {
                mes = 12;
                ano--;
                Bissexto(ano, diasPorMes);
            }
            dia += diasPorMes[mes - 1];
        }
    }

    private void Bissexto(int ano, int[] diasPorMes) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            diasPorMes[1] = 29;
        } else {
            diasPorMes[1] = 28;
        }
    }   
    
    int compara(String data) {
        String componentes[] = data.split("/");
        
        return compara(
            Integer.parseInt(componentes[0]),
            Integer.parseInt(componentes[1]),
            Integer.parseInt(componentes[2])
            );
    }
    
    int compara(MinhaData data) {
        return compara(data.dia, data.mes, data.ano);
    }
    
    int compara(int outroDia, int outroMes, int outroAno) {
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