package com.way.utils.reptile.util;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

import org.apache.hc.client5.http.impl.sync.CloseableHttpClient;
import org.apache.hc.client5.http.impl.sync.HttpClients;
import org.apache.hc.client5.http.methods.HttpGet;
import org.apache.hc.core5.http.HttpResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HttpUtils {

	public static Document get(String urlPath) {
		try {
			HttpResponse response = request(urlPath);
			String html = convertStreamToString(response.getEntity().getContent());
			Document doc = Jsoup.parse(html, urlPath);
			return doc;
		} catch (UnknownHostException ue) {
			JedisUtils.pushQ("host", urlPath);
			return null;
		} catch (IllegalStateException ue) {
			return null;
		} catch (IllegalArgumentException ue) {
			return null;
		} catch (Exception e) {
			System.out.println("path error " + urlPath);
			e.printStackTrace();
			return null;
		}
	}

	public static void down(String urlPath, String dir, String fileName) {
		try {
			HttpResponse response = request(urlPath);
			if (response.getEntity().getContentLength() < 102400) {
				 return;
			}
			File file = new File(dir);
			if (!file.exists()) {
				file.mkdirs();
			}
			file = new File(dir + "\\" + fileName);
			FileOutputStream fos = new FileOutputStream(file);
			response.getEntity().writeTo(fos);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void down2(String photoUrl,String dir, String fileName) {
		// 此方法只能用户HTTP协议
		try {
			URL url = new URL(photoUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(connection.getContentLength() < 102400){
				return ;
			}
			DataInputStream in = new DataInputStream(connection.getInputStream());
			fileName = dir + "\\" + fileName;
			DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));
			byte[] buffer = new byte[4096];
			int count = 0;
			while ((count = in.read(buffer)) > 0) {
				out.write(buffer, 0, count);
			}
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static HttpResponse request(String urlPath) {
		HttpGet request = new HttpGet(urlPath);
		CloseableHttpClient client = HttpClients.createDefault();
		try {
			request.addHeader("User-Agent",
					"Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36");
			return client.execute(request);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			request.abort();
			try {
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String convertStreamToString(InputStream is) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		try {
			String urlPath = "http://img.7160.com/uploads/allimg/131021/1-1310211932270-L.jpg";
			// HttpResponse response = HttpUtils.request(urlPath);
			// HttpGet request = new HttpGet(urlPath);
			// HttpClient client = new AutoRetryHttpClient();
			// HttpResponse response = client.execute(request);
			
			down2(urlPath,"G://pic2", "10.jpg");
			
//			down(urlPath, "G://pic2", "10.jpg");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
