package entidades;

public class Aluno {

	public String nome;
	public double notaPrimeiroTrimestre, notaSegundoTrimestre, notaTerceiroTrimestre, mediaFinal;
	
	public double calculoDaMediaFinal() { return mediaFinal = notaPrimeiroTrimestre+
			notaSegundoTrimestre+notaTerceiroTrimestre;}
	public boolean verificaAprovacao(double media) {return media >= 60? true:false;}
}
