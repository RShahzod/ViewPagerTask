package uz.shox.viewpagertask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import uz.shox.viewpagertask.adapter.ViewPagerAdapter
import uz.shox.viewpagertask.fragment.*

class SecondActivity : AppCompatActivity() {

    private var viewPagerAdapter: ViewPagerAdapter? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        initViews()
    }

    fun initViews() {
        viewPager = findViewById(R.id.viewpager1)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPagerAdapter!!.add(PageOneFragment(), "Contact")
        viewPagerAdapter!!.add(PageTwoFragment(), "User")
        viewPagerAdapter!!.add(PageThreeFragment(), "Post")

        viewPager!!.adapter = viewPagerAdapter

        tabLayout = findViewById(R.id.tab_layout1)
        tabLayout!!.setupWithViewPager(viewPager)
    }
}
