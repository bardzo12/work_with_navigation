package sk.datapac.myapplication.ui.gallerydetail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sk.datapac.myapplication.R

class GalleryDetailFragment : Fragment() {

    companion object {
        fun newInstance() = GalleryDetailFragment()
    }

    private lateinit var viewModel: GalleryDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.gallery_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GalleryDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}