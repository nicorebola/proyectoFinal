package Notificaciones.FinalizarPedido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class PushNotifictionHelper {
public final static String AUTH_KEY_FCM = "AAAAhUGFNLA:APA91bGBgyp78eCkVOd0TOgQZkiASlaANDCz98wSCKb5dEv12JdpV4hZQW0jU_Q13-O7NFr46d-MKb0IiCHjEPA9q7bjSRwcoLE8iMxHexW3cWUafjo409Jzq5gmNwJ9tAGYHd5ljFkc";
public final static String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";

// userDeviceIdKey is the device id you will query from your database
//  cGOrtlJwPWQ:APA91bH6DpNbjyDn76_DOuq56G7YqNyUooUOtZvGIr7mCdEmJEj58KcdBTrAR1zOCm50Igo6L7yOY7iiZjHHJNZvdzE0nWpUuphbGXcQ2e6itsTN6sLka27_sw2tx8XoBRZgC0HL2-cB
// La de arriba es mi key de mi dispositivo, cambiar por el que se vaya a usar cuando se mande la ntoificacion
public static void pushFCMNotification(String userDeviceIdKey, String mesa , String pedido) throws Exception{

String authKey = AUTH_KEY_FCM; // You FCM AUTH key
String FMCurl = API_URL_FCM;

URL url = new URL(FMCurl);
HttpURLConnection conn = (HttpURLConnection) url.openConnection();

conn.setUseCaches(false);
conn.setDoInput(true);
conn.setDoOutput(true);

conn.setRequestMethod("POST");
conn.setRequestProperty("Authorization","key="+authKey);
conn.setRequestProperty("Content-Type","application/json");

JSONObject json = new JSONObject();
json.put("to",userDeviceIdKey.trim());
JSONObject info = new JSONObject();
info.put("title", "Mesa N° " + mesa); // Notification title
info.put("body", "Pedido Listo " + pedido); // Notification body
json.put("notification", info);

OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
wr.write(json.toString());
wr.flush();
conn.getInputStream();
    System.out.println("Notificacion enviada");
}
}