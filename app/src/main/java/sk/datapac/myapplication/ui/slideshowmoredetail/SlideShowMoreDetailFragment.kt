package sk.datapac.myapplication.ui.slideshowmoredetail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sk.datapac.myapplication.R

class SlideShowMoreDetailFragment : Fragment() {

    companion object {
        fun newInstance() = SlideShowMoreDetailFragment()
    }

    private lateinit var viewModel: SlideShowMoreDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.slide_show_more_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SlideShowMoreDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}