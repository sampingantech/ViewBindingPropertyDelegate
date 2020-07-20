@file:Suppress("unused")

package co.sampingan.android.sample

import androidx.fragment.app.Fragment
import co.sampingan.android.sample.databinding.ProfileBinding
import co.sampingan.android.viewbinding.viewBinding

class ProfileFragment : Fragment(R.layout.profile) {

    private val viewBindingUsingReflection: ProfileBinding by viewBinding()

    private val viewBindingWithoutReflection by viewBinding { fragment ->
        ProfileBinding.bind(fragment.requireView())
    }
}
