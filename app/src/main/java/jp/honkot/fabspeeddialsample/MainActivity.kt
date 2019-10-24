package jp.honkot.fabspeeddialsample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import com.leinardi.android.speeddial.SpeedDialActionItem
import jp.honkot.fabspeeddialsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.speedDial.inflate(R.menu.menu_fab_speed_dial)
    }
}
