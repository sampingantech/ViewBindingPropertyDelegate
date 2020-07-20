@file:Suppress("unused")

package co.sampingan.android.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import co.sampingan.android.sample.databinding.ProfileBinding
import co.sampingan.android.viewbinding.viewBinding
import co.sampingan.android.viewbinding.dialogViewBinding

class ProfileDialogFragment2 : DialogFragment() {

    private val viewBindingUsingReflection: ProfileBinding by dialogViewBinding(R.id.container)

    // Creating via default way will work too for that case
    // private val viewBinding: ProfileBinding co viewBinding()

    private val viewBindingWithoutReflection by viewBinding { fragment ->
        ProfileBinding.bind(fragment.requireView())
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.profile, container, false)
    }
}
