package sk.datapac.myapplication.ui.gallerydetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sk.datapac.myapplication.R

class GalleryDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gallery_detail_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, GalleryDetailFragment2.newInstance())
                .commitNow()
        }
    }
}