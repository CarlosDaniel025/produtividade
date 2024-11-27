package layout.CadastroActivity

class xml {

    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <EditText
    android:id="@+id/editTextNome"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Nome" />

    <EditText
    android:id="@+id/editTextEmail"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Email"
    android:inputType="textEmailAddress" />

    <EditText
    android:id="@+id/editTextPassword"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Senha"
    android:inputType="textPassword" />

    <Button
    android:id="@+id/buttonCadastrar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Cadastrar" />
    </LinearLayout>
}