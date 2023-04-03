package projeto;

import java.util.Scanner;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class leitoHtml extends Processamento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Link: ");
		String link = sc.next();
		
		NEWURL newurl = null;
		NFile newfile = null;
		URL url = null;
		File file = new File("C:\\Users\\ejcar\\OneDrive\\Área de Trabalho\\Projeto/novoProjeto");
		try {
			url = new URL(link);
			//url = new URL("https://pt.wikipedia.org/wiki/Wikip%C3%A9dia:P%C3%A1gina_principal");
			new leitoHtml().getPage(url, file);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//newlink
		
		try {
			url = new URL(link);
			new leitoHtml().novoLink(newurl, newfile);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
