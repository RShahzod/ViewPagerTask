package uz.shox.viewpagertask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import uz.shox.viewpagertask.adapter.ViewAdapter
import uz.shox.viewpagertask.fragment.FirstFragment
import uz.shox.viewpagertask.fragment.SecondFragment
import uz.shox.viewpagertask.fragment.ThirdFragment

class FirstActivity : AppCompatActivity() {
    private var viewPagerAdapter: ViewAdapter? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TabLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        initViews()
    }

    fun initViews() {
        viewPager = findViewById(R.id.viewpager)

        viewPagerAdapter = ViewAdapter(supportFragmentManager)

        viewPagerAdapter!!.add(FirstFragment(), "Page 1")
        viewPagerAdapter!!.add(SecondFragment(), "Page 2")
        viewPagerAdapter!!.add(ThirdFragment(), "Page 3")

        viewPager!!.adapter = viewPagerAdapter

        tabLayout = findViewById(R.id.tab_layout)
        tabLayout!!.setupWithViewPager(viewPager)
    }
}