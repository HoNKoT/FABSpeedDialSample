package jp.honkot.fabspeeddialsample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import com.leinardi.android.speeddial.SpeedDialActionItem
import com.leinardi.android.speeddial.SpeedDialView
import jp.honkot.fabspeeddialsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SpeedDialView.OnActionSelectedListener {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.speedDial.run {
            inflate(R.menu.menu_fab_speed_dial)
            setOnActionSelectedListener(this@MainActivity)
        }

    }

    fun onClickedCustomFAB(@Suppress("UNUSED_PARAMETER") view: View) {
        binding.customFAB.visibility = View.GONE
        binding.speedDial.visibility = View.VISIBLE
        binding.speedDial.open()
    }

    override fun onActionSelected(actionItem: SpeedDialActionItem?): Boolean {
        val ret = when (actionItem?.id) {
            R.id.action_menu_1 -> {
                Toast.makeText(this, "this is menu 1", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_menu_2 -> {
                Toast.makeText(this, "this is menu 2", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_menu_3 -> {
                Toast.makeText(this, "this is menu 3", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_menu_4 -> {
                Toast.makeText(this, "this is menu 4", Toast.LENGTH_SHORT).show()
                true
            }

            else -> false
        }

        if (ret) {
            binding.customFAB.visibility = View.VISIBLE
            binding.speedDial.visibility = View.GONE
            binding.speedDial.close()
        }

        return ret
    }
}
