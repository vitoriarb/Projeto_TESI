package projeto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Processamento {
	
	static int i = 0;
	public 	static void main(String[] args) {
		new Thread(run1).start();
		new Thread(run2).start();
	}

	private static Runnable run1 = new Runnable() {
		public void run() {
		public getPage(URL url, File file) throws IOException{
			BufferedReader in = new BufferedReader (new InputStreamReader(url.openStream()));
			
			BufferedWriter out = new BufferedWriter (new FileWriter(file));
			
			String inputLine;
			String a = "a";
			String regex = "<("+a+").*>([^<]*?)</\\1>";
			
			while ((inputLine = in.readLine()) !=null){
				Matcher matcher = Pattern.compile(regex).matcher(inputLine);
				if(matcher.find()) {
					System.out.println(matcher.group());
				}else {
					System.out.println("Nesta linha não possuí link");
				}
				/*if(inputLine.contains("<a>") || inputLine.contains("</a>")) {
					System.out.println("O html contem Links");
				}else {
					System.out.println("O html não possui links");
				}*/
				
				//Vai imprimir a página no console
				//System.out.println(inputLine.contains("<a>"));
				
				//Vai gravar a página no arquivo
				out.write(inputLine);
				out.newLine();
			}
			in.close();
			out.flush();
			out.close();
		}
	}
};
	
	
	private static Runnable run2 = new Runnable() {
		public void run() {
		public novoLink(NEWURL newurl, NFile newfile) throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(url.openStream()));
			
			BufferedWriter out = new BufferedWriter (new FileWriter(newfile));
			
			String newinputLine;
			String a = "a";
			String regex = "<("+herf+").*>([^<]*?)</\\1>";
			
			while ((newinputLine = in.readLine()) !=null){
				Matcher matcher = Pattern.compile(regex).matcher(newinputLine);
				if(matcher.find()) {
					System.out.println(matcher.group());
				}else {
					System.out.println("Nesta linha não possuí link");
				}
				out.write(inputLine);
				out.newLine();
			}
			in.close();
			out.flush();
			out.close();
			
		}
	}
	};
	
}
