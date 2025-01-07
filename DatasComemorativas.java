public class DatasComemorativas
{
    public DataComemorativa datas[];
    private int qTdDatas;
    
    DatasComemorativas(int capacidade) {
        datas = new DataComemorativa[capacidade];
        qTdDatas = 0;
    }
    
    void adiciona(DataComemorativa data){
        if (qTdDatas < datas.length) {
            datas[qTdDatas] = data;
            qTdDatas++;
        } else {
            System.out.println("Vetor cheio! Não é possível adicionar mais datas.");
        }
    }
    
    void remove(String nome) {
        for (int i = 0; i < qTdDatas; i++){
            if (datas[i].nome.equals(nome)){
    
                for (int j = i; j < qTdDatas - 1; j++) {
                    datas[j] = datas[j + 1];
                }
    
                datas[qTdDatas - 1] = null;
                qTdDatas--;
                return;
            }
        }
        System.out.println("Data comemorativa com o nome '" + nome + "' não encontrada.");
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