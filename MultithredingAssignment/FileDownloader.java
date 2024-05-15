package assignment;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread.State;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Simple File Download (Thread Interruption and Monitoring):

Create a thread to download a file from a URL.
Implement thread interruption to gracefully stop the download if needed (e.g., using a flag).
Monitor the download progress and provide feedback (e.g., percentage downloaded).
 */
public class FileDownloader {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Downloader downloader = null;
		exit: while(true) {
			try {
				System.out.println("1.Enter url and file Name 2.startDownload 3.stop Download 10.exit");
				int choice = scanner.nextInt();
				switch(choice) {
				case 1:
					System.out.print("Enter the URL:");
					String url = scanner.next();
					System.out.print("Enter the file Name:");
					String fileName = scanner.next();
					downloader = new Downloader();
					downloader.setFileName(fileName);
					downloader.setFileUrl(url);
					break;
				case 2:
					if(downloader == null) {
						System.out.println("You must give url and file name to start downloding!");
						continue;
					}
					if(!downloader.isAlive() && downloader.getState() != State.TERMINATED) {
						downloader.start();
					}
					else {
						System.out.println("The file is already downloaded or cancelled");
					}
					break;
				case 3:
					downloader.setStopDownload(true);
					break;
				case 10:
					break exit;
				default:
					System.out.println("Enter a valid opurltion!");
					
				}
			}catch(InputMismatchException e) {
				System.out.println("Enter a number input!");
				scanner.nextLine();
			}
		}
	}
}


class Downloader extends Thread{
	
	String fileUrl;
	String fileName;
	FileOutputStream fos;
	volatile boolean stopDownload;
	HttpURLConnection httpUrlConnection;
	URL url;

	public Downloader() {

	}
	
	public void connect() {
		try {
			try {
				url = new URL(fileUrl);
			}catch(MalformedURLException e) {
				System.out.println("URL is malformed!");
				return;
			}
			httpUrlConnection = (HttpURLConnection) url.openConnection();
			if(httpUrlConnection.getResponseCode() == 200) {
				System.out.println("Connected successfully!");
				download();
			}else {
				System.out.println("Failed to download the file!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 
	public void download() {
		InputStream ips;
		try {
			int val;
			File file = new File(this.fileName);
			ips = httpUrlConnection.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(ips);
			fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int clength = httpUrlConnection.getContentLength();
			byte[] bytes = new byte[clength/10];
			double count = 0;
			while((val = bis.read(bytes)) != -1 && !isStopDownload()) {
				bos.write(bytes, 0, val);
				count += val;
				double progress = (count/clength)*100;
				String percent = String.format("%.1f%%",progress);
				System.out.print("\r Progress: "+percent);	
			}
			System.out.println();
			if(isStopDownload()) {
				file.delete();
				System.out.println("The download successfully exited!");
				return;
			}
			bis.close();
			ips.close();
			fos.close();
			System.out.println("File successfully downloaded at location "+file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		connect();
	}
	
	public boolean isStopDownload() {
		return stopDownload;
	}

	public void setStopDownload(boolean stopDownload) {
		this.stopDownload = stopDownload;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}