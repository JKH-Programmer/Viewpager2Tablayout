package fastcampus.aop.part2.viewpager2tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)

        val viewpagerFragmentAdapter = ViewpagerFragmentAdapter(this)

        viewPager.adapter = viewpagerFragmentAdapter }

}

