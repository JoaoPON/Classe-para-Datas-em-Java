public class Data{
    public int dia;
    public int mes;
    
    Data(int d, int m){
        dia = d;
        mes = m;
    }
    
    Data(String data){
        if(!data.isEmpty()){
            String componentes[] = data.split("/");
            dia = Integer.parseInt(componentes[0]);
            mes = Integer.parseInt(componentes[1]);
        }
    }
}