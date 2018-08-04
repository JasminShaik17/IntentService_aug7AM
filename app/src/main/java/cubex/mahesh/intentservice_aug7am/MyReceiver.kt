package cubex.mahesh.intentservice_aug7am

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.widget.ImageView
import android.widget.Toast

class MyReceiver(var iview:ImageView):BroadcastReceiver()
{
    override fun onReceive(p0: Context?, p1: Intent?) {
        Toast.makeText(p0,"Background task is done",
                Toast.LENGTH_LONG).show()
    //    var bmp =   p1!!.getParcelableExtra<Bitmap>("image")
            iview.setImageBitmap(bmp)
    }

}