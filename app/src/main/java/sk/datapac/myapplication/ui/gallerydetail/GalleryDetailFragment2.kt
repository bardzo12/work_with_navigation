package sk.datapac.myapplication.ui.gallerydetail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import sk.datapac.myapplication.R

class GalleryDetailFragment2 : Fragment() {

    companion object {
        fun newInstance() = GalleryDetailFragment2()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        view?.findViewById<Button>(R.id.button)?.setOnClickListener {
            findNavController().navigate(GalleryDetailActivityDirections.actionGlobalNavGlobalActivity())
        }
        // TODO: Use the ViewModel
    }

}