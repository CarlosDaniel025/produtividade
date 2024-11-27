package layout.produtividade

class xml {
    <LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="16dp">

    <TextView
    android:id="@+id/textViewWelcome"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Bem-vindo à Tela Principal!"
    android:textSize="18sp"
    android:textStyle="bold" />

    <Button
    android:id="@+id/buttonLogout"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Logout" />
    </LinearLayout>

}