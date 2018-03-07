/*
Classe que receberá informaçõs de partidas das diversas compas do muno em html e serão armazenadas
através destes atributos
*/

import java.io.*;

class Partida{
	
	private int copa;

	private int placar1;

	private int placar2;

	private int dia;

	private int mes;

	private String etapa;

	private String time1;

	private String time2;

	private String local;
/*
	Os dois metodos a seguir são metodos construtores para recepção com e semargumetos
*/
	Partida(){
		this.setCopa(1933);
		this.setPlacar1(0);
		this.setPlacar2(0);
		this.setDia(1);
		this.setMes(1);
		this.setEtapa("Primeira");
		this.setTime1("");
		this.setTime2("");
		this.setLocal("N/D");
	}

	Partida(int copa, int placar1, int placar2, int dia, int mes, String etapa, String time1, String time2, String local){
		this.setCopa(copa);
		this.setPlacar1(placar1);
		this.setPlacar2(placar2);
		this.setDia(dia);
		this.setMes(mes);
		this.setEtapa(etapa);
		this.setTime1(time1);
		this.setTime2(time2);
		this.setLocal(local);
	}
/*
	A sequencia de metods a seguir corresponde aos metodo de set() para
cada atributo da classe e suas devidas condiçoes de existencia quando ncessarias
*/
	public void setCopa(int x){
		this.copa = x;
	}//fim setCopa

	public void setPlacar1(int x){
		this.placar1 = x;
	}//fim setPlacar1

	public void setPlacar2(int x){
		this.placar2 = x;
	}//fim setPlacar2

	public void setDia(int x){
		if(x >= 1 && x <= 31){
			this.dia = x;
		}else{
			MyIO.println("ERRO!");
		}
	}//fim setDia

	public void setMes(int x){
		if(x >= 1 && x <= 12){
			this.mes = x;
		}else{
			MyIO.println("ERRO!");
		}
	}//fim setMes

	public void setEtapa(String s){
		this.etapa = s;
	}//fim setEtapa

	public void setTime1(String s){
		this.time1 = s;
	}//fim setTime1
	
	public void setTime2(String s){
		this.time2 = s;
	}//fim setTime2

	public void setLocal(String s){
		this.local = s;
	}//fim setLocal

	public int getCopa(){
		return this.copa;
	}//fim getCopa

	public int getPlacar1(){
		return this.placar1;
	}//fim getPlacar1

	public int getPlacar2(){
		return this.placar2;
	}//fim getPlacar2

	public int getDia(){
		return this.dia;
	}//fim getDia

	public int getMes(){
		return this.mes;
	}//fim getMes
	

	public String getEtapa(){
		return this.etapa;
	}//fim getEtapa

	public String getTime1(){
		return this.time1;
	}//fim getTime1

	public String getTime2(){
		return this.time2;
	}//fim getTime2

	public String getLocal(){
		return this.local;
	}//fim getLocal

	void ler(BufferedReader br, String nomeArquivo) throws Exception{
		String entradas = "";
		for(entradas; entradas != "</tr>", entradas = br.readLine()){
			if(entradas.contais("align=")){
				entrada.replace("<td align=\"center\">", "");
				entrada.replace("</td>","");
				
			}//fim if
		
	}//fim ler

	void imprimir(){
		//MyIO.print();
	}//fim imprimir
}//fim Partida

public class Copa{
	public static void main(String[] args){
		int ano = 1;
		int i = 0;
		String flag = "";
		Partida p[];
		while(ano != 0){		
			ano = MyIO.readLine();
			BufferedReader br  new BufferedReader(new FileReader("/tmp/copa/" + ano + ".html"));
			do{
				p[i] = new Partida();
				for(flag; flag != "<tr>");
				p.ler((String)ano);
			}while(flag != "#00000");
		}
	}//fim main

}//fim copa
