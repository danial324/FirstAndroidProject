package haqnawaz.org.a20220815db;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter <StudentModel> {
    public MyAdapter(@NonNull Context context, @NonNull List<StudentModel> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        StudentModel studentModel = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.customized_layout, parent, false);

        EditText nameEditText = convertView.findViewById(R.id.namePlainText);
        nameEditText.setText(studentModel.getName());

        EditText rollNumberEditText = convertView.findViewById(R.id.rollNoPlainText);
        rollNumberEditText.setText(String.valueOf(studentModel.getRollNmber()));

        Switch isEnrolledSwitch = convertView.findViewById(R.id.enrolledSwitch);
        isEnrolledSwitch.setChecked(studentModel.isEnroll());

        Button updateButton = convertView.findViewById(R.id.updateButton);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(getContext());
                dbHelper.updateStudent(new StudentModel(studentModel.getId(), nameEditText.getText().toString(),
                        Integer.parseInt(rollNumberEditText.getText().toString()),isEnrolledSwitch.isChecked()));
            }
        });

        Button deleteButton = convertView.findViewById(R.id.deleteButton);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(getContext());
                dbHelper.deleteStudent(studentModel);
                notifyDataSetChanged();
            }
        });
        return convertView;
    }
}
