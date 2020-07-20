@file:Suppress("unused")

package co.sampingan.android.sample

import androidx.appcompat.app.AppCompatActivity
import co.sampingan.android.sample.databinding.ProfileBinding
import co.sampingan.android.viewbinding.viewBinding

class ProfileActivity : AppCompatActivity(R.layout.profile) {

    private val viewBindingUsingReflection: ProfileBinding by viewBinding(R.id.container)

    private val viewBindingWithoutReflection by viewBinding { activity ->
        ProfileBinding.bind(activity.findViewById(R.id.container))
    }
}
