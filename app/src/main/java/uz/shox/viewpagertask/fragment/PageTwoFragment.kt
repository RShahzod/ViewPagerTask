package uz.shox.viewpagertask.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.shox.viewpagertask.R
import uz.shox.viewpagertask.adapter.PagerAdapter
import uz.shox.viewpagertask.adapter.PagerTwoAdapter
import uz.shox.viewpagertask.model.User

class PageTwoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_page_two, container, false)
        initView(view)
        return view
    }
    private fun initView(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView1)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val user: ArrayList<User> = ArrayList()
        user.add(User("Shahzod", "Rozimboyev", "+998997713834"))
        user.add(User("Shahzod", "Ro'zimboyev", "+998997713835"))
        user.add(User("Shahzod", "Ruzimboyev", "+998997713836"))
        user.add(User("Shahzod", "Ruzimboev", "+998997713837"))

        val pagerAdapter = PagerTwoAdapter(requireContext(), user)
        recyclerView.adapter = pagerAdapter


    }

}