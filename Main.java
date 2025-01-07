public class Main
{
	public static void main(String[] args) {
		MinhaData data = new MinhaData("20/9/2003");
		MinhaData data2 = new MinhaData(5,8,2003);
		System.out.println(data2.compara(data.toString()));
		System.out.println(data.toString());
		System.out.println(data2.toString());
		data2.diaSet(20);
		data2.mesSet(9);
		data2.anoSet(2003);
		System.out.println(data.compara(data2));
		
		DataComemorativa natal = new DataComemorativa("Natal", true, true, "25/12");
		DataComemorativa jooj = new DataComemorativa("JooJ", true, false, "11/9");
		DataComemorativa teste = new DataComemorativa("Teste", false, false, "1/1");
		
		DatasComemorativas datas = new DatasComemorativas(3);
		datas.adiciona(natal);
		datas.adiciona(jooj);
		datas.adiciona(teste);
		datas.listaDatas();
		System.out.println(datas.horasNaoTrabalhadas());
		datas.remove("JooJ");
		datas.remove("Teste2");
		datas.listaDatas();
		System.out.println(datas.horasNaoTrabalhadas());
		
		MinhaData data3 = new MinhaData("28/2/2024");
		data3.alterarData(1, 0, 0);
		System.out.println(data3.toString());
	}
}