![Publish to Bintray](https://github.com/sampingantech/ViewBindingPropertyDelegate/workflows/Publish%20to%20Bintray/badge.svg?branch=master&event=push) [ ![Download](https://api.bintray.com/packages/sampingan/android/viewbinding-propertydelegate/images/download.svg) ](https://bintray.com/sampingan/android/viewbinding-propertydelegate/_latestVersion)

# ViewBindingPropertyDelegate

Make work with [Android View Binding](https://developer.android.com/topic/libraries/view-binding) simpler

## Add library to a project

```groovy
allprojects {
  repositories {
    jcenter()
  }
}

dependencies {
    implementation 'co.sampingan.android:viewbinding-propertydelegate:1.0.0-beta1'
}
```

## Samples

```kotlin
class ProfileFragment : Fragment(R.layout.profile) {

    private val viewBinding: ProfileBinding by viewBinding()
}
```

```kotlin
class ProfileActivity : AppCompatActivity(R.layout.profile) {

    private val viewBinding: ProfileBinding by viewBinding(R.id.container)
}
```

```kotlin
class ProfileDialogFragment : DialogFragment() {

    private val viewBinding: ProfileBinding by dialogViewBinding(R.id.container)

    // Creating via default way will work too for that case
    // private val viewBinding: ProfileBinding by viewBinding()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setView(R.layout.profile)
            .create()
    }
}
```

```kotlin
class ProfileDialogFragment : DialogFragment() {

    private val viewBinding: ProfileBinding by dialogViewBinding(R.id.container)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.profile, container, false)
    }
}
```
