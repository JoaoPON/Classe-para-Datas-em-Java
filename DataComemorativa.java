public class DataComemorativa extends Data
{
    public String nome;
    public boolean feriado;
    public boolean mundial;
    
    DataComemorativa(String n, boolean f, boolean m, String data){
        super(data);
        nome = n;
        feriado = f;
        mundial = m;
    }
}