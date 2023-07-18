package aplicacao;

import java.util.Scanner;
import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.print("Digite as informacoes do aluno\nNome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota do primeiro trimestre: ");
		aluno.notaPrimeiroTrimestre = sc.nextDouble();
		System.out.print("Nota do segundo trimestre: ");
		aluno.notaSegundoTrimestre = sc.nextDouble();
		System.out.print("Nota do terceiro trimestre: ");
		aluno.notaTerceiroTrimestre = sc.nextDouble();
		System.out.println("Media final = " + String.format("%.2f", aluno.calculoDaMediaFinal()));
		System.out.println(aluno.verificaAprovacao(aluno.mediaFinal) == true ? "Aprovado":
			"Reprovado\nFaltaram " + String.format("%.2f", (60.00 - aluno.mediaFinal)) + " pontos"); 
		sc.close();
	}

}
