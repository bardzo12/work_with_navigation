package sk.datapac.myapplication.ui.slideshowdetail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import sk.datapac.myapplication.R
import sk.datapac.myapplication.databinding.FragmentSlideshowBinding
import sk.datapac.myapplication.databinding.SlideShowDetailFragmentBinding
import sk.datapac.myapplication.ui.slideshow.SlideshowFragmentDirections
import sk.datapac.myapplication.ui.slideshow.SlideshowViewModel

class SlideShowDetailFragment : Fragment() {

    companion object {
        fun newInstance() = SlideShowDetailFragment()
    }

    private var _binding: SlideShowDetailFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel =
            ViewModelProvider(this).get(SlideShowDetailViewModel::class.java)

        _binding = SlideShowDetailFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.button3.setOnClickListener {
            val action =
                SlideShowDetailFragmentDirections.actionNavSlideshowDetailToNavSlideshowMoreDetail()
            findNavController().navigate(action)
        }

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}