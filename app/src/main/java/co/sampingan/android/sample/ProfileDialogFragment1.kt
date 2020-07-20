@file:Suppress("unused")

package co.sampingan.android.sample

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import co.sampingan.android.viewbinding.dialogViewBinding
import co.sampingan.android.sample.databinding.ProfileBinding

class ProfileDialogFragment1 : DialogFragment() {

    private val viewBindingUsingReflection: ProfileBinding by dialogViewBinding(R.id.container)

    private val viewBindingWithoutReflection by dialogViewBinding { fragment ->
        ProfileBinding.bind(fragment.dialog!!.window!!.decorView.findViewById(R.id.container))
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setView(R.layout.profile)
            .create()
    }
}
