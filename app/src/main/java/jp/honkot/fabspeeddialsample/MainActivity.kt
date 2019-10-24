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
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//        binding.speedDialView.addActionItem(
//            SpeedDialActionItem.Builder(R.id.fab_custom_color, drawable)
//            .setFabBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.material_white_1000, getTheme()))
//            .setFabImageTintColor(ResourcesCompat.getColor(getResources(), R.color.inbox_primary, getTheme()))
//            .setLabel(getString(R.string.label_custom_color))
//            .setLabelColor(Color.WHITE)
//            .setLabelBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.inbox_primary, getTheme()))
//            .setLabelClickable(false)
//            .create())
    }
}
