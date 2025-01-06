public class DatasComemorativas
{
    public DataComemorativa datas[];
    private int qTdDatas = 0;
    
    public DatasComemorativas(int capacidade) {
        datas = new DataComemorativa[capacidade];
    }
    
    void adiciona(DataComemorativa data){
        if (qTdDatas < datas.length) {
            datas[qTdDatas] = data;
            qTdDatas++;
        } else {
            System.out.println("Array cheio! Não é possível adicionar mais datas.");
        }
    }
    
    void remove(String nome) {
        boolean encontrado = false;
    
        for (int i = 0; i < qTdDatas; i++){
            if (datas[i].nome.equals(nome)){
                encontrado = true;
    
                for (int j = i; j < qTdDatas - 1; j++) {
                    datas[j] = datas[j + 1];
                }
    
                datas[qTdDatas - 1] = null;
                qTdDatas--;
                break;
            }
        }
    
        if (!encontrado) {
            System.out.println("Data comemorativa com o nome '" + nome + "' não encontrada.");
        }
    }
    
    void listaDatas(){
        for(int i=0; i < qTdDatas; i++){
            System.out.println(datas[i].nome);
        }
    }
    
    int horasNaoTrabalhadas(){
        int aux = 0;
        for(int i=0; i < qTdDatas; i++){
            if(datas[i].feriado){
                aux++;
            }
        }
        return aux*8;
    }
}