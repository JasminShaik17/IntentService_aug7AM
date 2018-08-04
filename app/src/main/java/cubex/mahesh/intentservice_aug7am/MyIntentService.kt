package cubex.mahesh.intentservice_aug7am

import android.app.IntentService
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL

var bmp:Bitmap? = null


class MyIntentService:IntentService("")
{

    override fun onHandleIntent(p0: Intent?) {
            var url = URL("https://www.android.com/static/2016/img/share/oreo-lg.jpg")
           var isr =  url.openStream()
           bmp = BitmapFactory.decodeStream(isr)

            var i = Intent( )
            i.setAction("iservice_task_done")
          //  i.putExtra("image",bmp)
            sendBroadcast(i)
    }
}