package com.payment.wiproprojectfortraning.android.viewModelWithFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R
import com.payment.wiproprojectfortraning.android.viewModelRecyclerView.ShoppingAdapter

/**
 * A simple [Fragment] subclass.
 * Use the [ShoppingAddCardListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShoppingAddCardListFragment : Fragment() {

    private val viewModel:ShoppingFragmentViewModel by lazy { ViewModelProvider(requireActivity())[ShoppingFragmentViewModel::class.java] }
    private var recyclerView: RecyclerView?= null
    private var btnGoToCard: Button?= null
    private val adapter: ShoppingAdapter by lazy {
        ShoppingAdapter(emptyList()) {
            it?.let { item ->
                if (item.isAdded) {
                    viewModel.removeItem(item)
                }else {
                    viewModel.addItem(item)
                }
            }
        }
    }
    companion object {
        fun newInstance(): ShoppingAddCardListFragment {
            val fragment = ShoppingAddCardListFragment()
            return fragment
        }
    }

    override fun toString(): String {
        return super.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_shopping_add_card_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewItem(view)
    }


    private fun initViewItem(view: View?) {
        recyclerView = view?.findViewById(R.id.recyclerView)
        btnGoToCard = view?.findViewById(R.id.btnGoToCard)

        recyclerView?.adapter = adapter

        viewModel.products.observe(viewLifecycleOwner) { updatedList ->
            adapter.updateList(updatedList.filter { it.isAdded })
        }

        btnGoToCard?.setOnClickListener {
        }

    }
}