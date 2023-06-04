import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Server extends JFrame{
	ArrayList<String> wordList = new ArrayList<String>();
	JTextArea ta = new JTextArea();
	
	public Server() {
		readWordList();
	
	
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	c.add(ta);
	ta.setEnabled(false);
	ta.setDisabledTextColor(Color.black);
	
	setTitle("영어 단어 체크 서버");
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300,300);
	try {
		ServerSocket ss = new ServerSocket(9999);
		
		while(true) {
			Socket socket = ss.accept();
			ta.append("클라이언트 접속됨!"+"\n");
			Multiple multi = new Multiple(socket);
			multi.start();
		}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}

public void readWordList() {
	File file = new File("/Users/sonmingi/Desktop/강남대학교/Java_Programing/PT/word.txt");
	try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		while(true) {
			String word = br.readLine();
			if(word == null)
				break;
			wordList.add(word);
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

class Multiple extends Thread{
	
	Socket socket;
	
	public Multiple(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String receiveWord = br.readLine();
				if(receiveWord == null)
					break;
				
				if(wordList.indexOf(receiveWord) >= 0) {
					ta.append(receiveWord+"=Yes"+"\n");
					bw.write("Yes" + "\n");
					bw.flush();
				}
				else {
					ta.append(receiveWord+"=No"+"\n");
					bw.write("No" + "\n");
					bw.flush();
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public static void main(String[] args) {
	new Server();
	}
}


