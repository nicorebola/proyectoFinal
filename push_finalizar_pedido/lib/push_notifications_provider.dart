import 'package:firebase_messaging/firebase_messaging.dart';

class PushNotificationsProvider {

  FirebaseMessaging _firebaseMessaging = FirebaseMessaging();

// INICIALIZA LAS NOTIFICACIONES
  initNotifications() {

    _firebaseMessaging.requestNotificationPermissions();
    _firebaseMessaging.getToken().then((token){

      print("TOKEN");
      print(token);

      //  cGOrtlJwPWQ:APA91bH6DpNbjyDn76_DOuq56G7YqNyUooUOtZvGIr7mCdEmJEj58KcdBTrAR1zOCm50Igo6L7yOY7iiZjHHJNZvdzE0nWpUuphbGXcQ2e6itsTN6sLka27_sw2tx8XoBRZgC0HL2-cB  //TOKEN DE MI NOKIA
    });

    _firebaseMessaging.configure(
      onMessage: ( info ){
        print('On Message info');
            print(info);
          //  final noti = info['data']['pedido'];

      },
      onLaunch: ( info ){
        print('On Launch info');
        print(info);
      },
      onResume: ( info ){
        print('On Resume info');
        print(info);
      }

    );
  }

}