public class Main
{
	public static void main(String[] args) {
		MinhaData data = new MinhaData("20/9/2003");
		MinhaData data2 = new MinhaData(18,10,2001);
		System.out.println(data.toString());
		System.out.println(data2.toString());
		System.out.println(data.compara(data2.toString()));
		
		DataComemorativa natal = new DataComemorativa("Natal", true, true, "25/12/0");
		DataComemorativa jooj = new DataComemorativa("JooJ", true, false, "11/09/0");
		DataComemorativa teste = new DataComemorativa("Teste", false, false, "1/1/0");
		System.out.println(natal.toString());
		
		DatasComemorativas datas = new DatasComemorativas(3);
		datas.adiciona(natal);
		datas.adiciona(jooj);
		datas.adiciona(teste);
		datas.listaDatas();
		System.out.println(datas.horasNaoTrabalhadas());
		datas.remove("JooJ");
		datas.listaDatas();
		System.out.println(datas.horasNaoTrabalhadas());
	}
}